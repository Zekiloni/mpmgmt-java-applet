/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.domain.model;

import java.io.Serializable;
import java.time.OffsetDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Comp
 */
@Entity
@Table(name = "mobile_plans")
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
    
    @Column(name = "DATA_LIMIT")
    private int dataLimit;
    
    @Column(name = "MINUTES_LIMIT")
    private int minutesLimit;
    
    @Column(name = "MONTHLY_FEE")
    private Double monthlyFee;
    
    @Column(name = "CREATED_AT")
    private OffsetDateTime createdAt;
}
