/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.presentation.controller;

import java.util.List;
import mobileplanmgmt.domain.model.MobilePlan;
import mobileplanmgmt.domain.model.MobilePlanCreate;
import mobileplanmgmt.domain.service.MobilePlanService;
import mobileplanmgmt.domain.service.impl.MobilePlanServiceImpl;

/**
 *
 * @author Zekiloni
 */
public class MobilePlanController {

    private MobilePlanService mobilePlanService;

    public MobilePlanController() {
        this.mobilePlanService = new MobilePlanServiceImpl();
    }

    public List<MobilePlan> getAllMobilePlans() {
        return this.mobilePlanService.getAll();
    }

    public MobilePlan createMobilePlan(MobilePlanCreate mobilePlanCreate) {
        return this.mobilePlanService.create(mobilePlanCreate);
    }

    public void deleteMobilePlan(Long mobilePlanId) {
        this.mobilePlanService.delete(mobilePlanId);
    }
}
