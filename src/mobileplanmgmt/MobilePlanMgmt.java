/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobileplanmgmt;

import mobileplanmgmt.domain.model.Customer;
import mobileplanmgmt.application.service.impl.CustomerService;

/**
 *
 * @author Zekiloni
 */
public class MobilePlanMgmt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        CustomerService customerService = new CustomerService();
        Customer customer = new Customer();
        
        customerService.create(customer);
    }
    
}
