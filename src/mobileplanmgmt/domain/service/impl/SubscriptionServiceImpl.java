/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.domain.service.impl;

import java.util.List;
import mobileplanmgmt.domain.model.Subscription;
import mobileplanmgmt.domain.model.SubscriptionCreate;
import mobileplanmgmt.domain.service.SubscriptionService;
import mobileplanmgmt.infrastructure.persistence.DatabaseOperations;

/**
 *
 * @author Zekiloni
 */
public class SubscriptionServiceImpl implements SubscriptionService {

    private DatabaseOperations databaseOperations;

    public SubscriptionServiceImpl() {
        this.databaseOperations = new DatabaseOperations();
    }

    @Override
    public Subscription create(SubscriptionCreate subscriptionCreate) {
        return this.databaseOperations.save(
                Subscription.builder()
                        .customer(subscriptionCreate.getCustomer())
                        .validFrom(subscriptionCreate.getValidFrom())
                        .validTo(subscriptionCreate.getValidTo())
                        .mobilePlan(subscriptionCreate.getMobilePlan())
                        .build()
        );
    }

    @Override
    public void delete(Long subscriptionId) {
        this.databaseOperations.delete(Subscription.class, subscriptionId);
    }

    @Override
    public Subscription update(Subscription subscription) {
        return this.databaseOperations.save(subscription);
    }

    @Override
    public Subscription getById(Long subscriptionId) {
        return this.databaseOperations.getById(Subscription.class, subscriptionId).orElse(null);
    }

    @Override
    public List<Subscription> getAll() {
        return this.databaseOperations.getAll(Subscription.class);
    }

}
