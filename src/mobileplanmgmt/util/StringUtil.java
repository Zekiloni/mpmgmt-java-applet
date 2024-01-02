/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.util;

import lombok.experimental.UtilityClass;

/**
 *
 * @author Zekiloni
 */
@UtilityClass
public class StringUtil {
    
    public static String truncate(String payload, int characters) {
        return (payload == null || payload.length() <= characters) ? payload : payload.substring(0, characters) + "...";
    }
}
