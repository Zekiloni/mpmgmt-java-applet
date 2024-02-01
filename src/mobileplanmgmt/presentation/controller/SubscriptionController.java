/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.presentation.controller;

import java.util.List;
import mobileplanmgmt.domain.model.Subscription;
import mobileplanmgmt.domain.model.SubscriptionCreate;
import mobileplanmgmt.domain.service.SubscriptionService;
import mobileplanmgmt.domain.service.impl.SubscriptionServiceImpl;

/**
 *
 * @author Zekiloni
 */
public class SubscriptionController {
    
    private SubscriptionService subscriptionService;

    public SubscriptionController() {
        this.subscriptionService = new SubscriptionServiceImpl();
    }

    public List<Subscription> getAllSubscriptions() {
        return this.subscriptionService.getAll();
    }

    public Subscription createSubscription(SubscriptionCreate subscriptionCreate) {
        return this.subscriptionService.create(subscriptionCreate);
    }

    public void deleteSubscription(Long subscriptionId) {
        this.subscriptionService.delete(subscriptionId);
    }
}
