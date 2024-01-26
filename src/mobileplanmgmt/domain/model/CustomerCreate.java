/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.domain.model;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Comp
 */

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerCreate {
    private String firstName;
    
    private String middleName;
    
    private String lastName;
    
    private String emailAddress;
    
    private String phoneNumber;
    
    private LocalDate dateOfBirth;
}
