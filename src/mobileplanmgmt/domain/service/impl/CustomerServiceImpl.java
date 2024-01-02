/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.domain.service.impl;

import java.util.List;
import mobileplanmgmt.domain.model.Customer;
import mobileplanmgmt.domain.service.CustomerService;
import mobileplanmgmt.infrastructure.persistence.DatabaseOperations;
import mobileplanmgmt.domain.service.MobilePlanService;

/**
 *
 * @author Zekiloni
 */
public class CustomerServiceImpl implements CustomerService {

    private DatabaseOperations databaseOperations;
    
    public CustomerServiceImpl() {
        this.databaseOperations = new DatabaseOperations();
    }
    
    @Override
    public Customer create(Customer customer) {
        return this.databaseOperations.save(customer);
    }

    @Override
    public void delete(Long customerId) {
        this.databaseOperations.delete(Customer.class, customerId);
    }
    
    @Override
    public Customer update(Customer customer) {
        return this.databaseOperations.save(customer);
    }
    
    @Override
    public Customer getById(Long entityId) {
        return this.databaseOperations.getById(Customer.class, entityId).orElse(null);
    }
    
    @Override
    public List<Customer> getAll() {
        return this.databaseOperations.getAll(Customer.class);
    }
}
