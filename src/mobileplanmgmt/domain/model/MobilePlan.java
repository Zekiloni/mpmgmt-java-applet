/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.domain.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Comp
 */
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobilePlan implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true)
    private String name; 
    
    private String description;
    
    @Column(name = "data_limit")
    private int dataLimit;
    
    @Column(name = "minutes_limit")
    private int minutesLimit;
    
    @Column(name = "monthly_fee")
    private Double monthlyFee;
}
