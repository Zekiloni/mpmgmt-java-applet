/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.domain.service;

import java.util.List;
import mobileplanmgmt.domain.model.Subscription;
import mobileplanmgmt.domain.model.SubscriptionCreate;

/**
 *
 * @author Zekiloni
 */
public interface SubscriptionService {
    Subscription create(SubscriptionCreate subscriptionCreate);
    void delete(Long subscriptionId);
    Subscription update(Subscription subscription);
    Subscription getById(Long subscriptionId);
    List<Subscription> getAll();
}
