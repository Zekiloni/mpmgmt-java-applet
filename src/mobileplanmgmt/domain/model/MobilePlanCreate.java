/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.domain.model;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Zekiloni
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MobilePlanCreate implements Serializable {
    private String name;
    private String description;
    private int dataLimit;
    private int minutesLimit;
    private Double monthlyFee;
}
