/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.presentation.controller;

import mobileplanmgmt.domain.model.MobilePlan;
import mobileplanmgmt.domain.model.MobilePlanCreate;
import mobileplanmgmt.domain.service.impl.MobilePlanServiceImpl;

/**
 *
 * @author Zekiloni
 */
public class MobilePlanController {
    private MobilePlanServiceImpl mobilePlanService;
    
    public MobilePlanController() {
        mobilePlanService = new MobilePlanServiceImpl();
    }
    
    public MobilePlan createMobilePlan(MobilePlanCreate mobilePlanCreate) {
        try { 
            return mobilePlanService.create(MobilePlanCreate)
        } catch(RuntimeException exception) {
            
        }        
    }
}
