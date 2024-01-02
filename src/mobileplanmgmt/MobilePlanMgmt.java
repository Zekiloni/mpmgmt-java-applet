/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mobileplanmgmt;

import mobileplanmgmt.domain.model.Customer;
import mobileplanmgmt.domain.service.impl.CustomerServiceImpl;
import mobileplanmgmt.presentation.view.MainView;

/**
 *
 * @author Zekiloni
 */
public class MobilePlanMgmt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         java.awt.EventQueue.invokeLater(() -> {
            new MainView().setVisible(true);
        });
    }
    
}
