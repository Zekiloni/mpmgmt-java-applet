/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.domain.service.impl;

import java.util.List;
import mobileplanmgmt.domain.model.MobilePlan;
import mobileplanmgmt.domain.model.MobilePlanCreate;
import mobileplanmgmt.domain.service.MobilePlanService;
import mobileplanmgmt.infrastructure.persistence.DatabaseOperations;

/**
 *
 * @author Comp
 */
public class MobilePlanServiceImpl implements MobilePlanService {

    private DatabaseOperations databaseOperations;
    
    public MobilePlanServiceImpl() {
        this.databaseOperations = new DatabaseOperations();
    }
    
    @Override
    public MobilePlan create(MobilePlanCreate mobilePlanCreate) {
        MobilePlan mobilePlan = MobilePlan.builder()
                .name(mobilePlanCreate.getName())
                .description(mobilePlanCreate.getDescription())
                .dataLimit(mobilePlanCreate.getDataLimit())
                .minutesLimit(mobilePlanCreate.getMinutesLimit())
                .build();
        
        return this.databaseOperations.save(mobilePlan);
    }

    @Override
    public void delete(Long mobilePlanId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MobilePlan update(MobilePlan entity) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public MobilePlan getById(Long mobilePlanId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<MobilePlan> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
