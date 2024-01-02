/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.domain.model;

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
public class MobilePlanCreate {
    private String name;
    private String description;
    private int dataLimit;
    private int minutesLimit;
    private Double monthlyFee;
}
