/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.presentation.controller;

import java.util.List;
import mobileplanmgmt.domain.model.Customer;
import mobileplanmgmt.domain.model.CustomerCreate;
import mobileplanmgmt.domain.service.CustomerService;
import mobileplanmgmt.domain.service.impl.CustomerServiceImpl;

/**
 *
 * @author Zekiloni
 */
public class CustomerController {
    
    private CustomerService customerService;
    
    public CustomerController() {
        this.customerService = new CustomerServiceImpl();
    }
    
    public List<Customer> getAllCustomers() {
        return this.customerService.getAll();
    }
    
    public Customer createCustomer(CustomerCreate customerCreate) {
        try { 
            return this.customerService.create(customerCreate);
        } catch(RuntimeException exception) {
            return null;
        }        
    }
    
    public void deleteCustomer(Long customerId) {
        this.customerService.delete(customerId);
    }
}
