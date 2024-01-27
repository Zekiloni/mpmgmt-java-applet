/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mobileplanmgmt.util;

import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.function.Predicate;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import lombok.experimental.UtilityClass;

/**
 *
 * @author Comp
 */
@UtilityClass
public class ValidationUtil {

    public static void setValidationBorder(JTextField textField, boolean isValid) {
        setValidationBorder((JComponent) textField, isValid);
    }

    public static void setValidationBorder(JTextArea textArea, boolean isValid) {
        setValidationBorder((JComponent) textArea, isValid);
    }

    private static void setValidationBorder(JComponent component, boolean isValid) {
        if (isValid) {
            component.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        } else {
            component.setBorder(BorderFactory.createLineBorder(Color.RED));
        }
    }

    public static boolean isValidInput(JTextField textField, Predicate<String> validationLogic) {
        String input = textField.getText();
        boolean isValid = !input.isEmpty() && validationLogic.test(input);
        setValidationBorder(textField, isValid);
        return isValid;
    }

    public static boolean isValidInput(JTextArea textArea, Predicate<String> validationLogic) {
        String input = textArea.getText();
        boolean isValid = validationLogic.test(input);
        setValidationBorder(textArea, isValid);
        return isValid;
    }

    public static boolean isValidIntegerInput(String input) {
        try {
            int value = Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isValidDateFormat(String dateText, String expectedFormat) {
        try {
            LocalDate.parse(dateText, DateTimeFormatter.ofPattern(expectedFormat));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static boolean isValidDoubleInput(String input) {
        try {
            double value = Double.parseDouble(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
