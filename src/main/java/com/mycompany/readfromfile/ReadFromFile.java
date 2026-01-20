/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.readfromfile;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 *
 * @author Marika
 */
public class ReadFromFile {

    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("customers.txt"))) {
        String line;
        while ((line = br.readLine()) != null)
                System.out.println(line);
        }
        catch (IOException e){
            System.out.println("Error reading file");
        }   
    }
    
    // Validating if the first name in the customers.txt only contains letters
    public static boolean isValidFirstName(String name){
        char[] chars = name.toCharArray();
        
        for (char c : chars){
            if(!Character.isLetter(c)){
                return false;
            }
        }
        
        return true;
    }
    
    // Validating if the last name in the customers.txt only contains letters
    public static boolean isValidLastName(String lName){
        char[] chars = lName.toCharArray();
        
        for (char c : chars){
            if(!Character.isLetter(c)){
                return false;
            }
        }
        
        return true;
    }
    
     // Validating if the total purchase in the customers.txt is a valid purchase figure
    public static boolean isValidTotalPurchase(String purchase){
        char[] chars = purchase.toCharArray();
        int decimalCounter = 0;
        
        for (char c : chars){
            if(!Character.isDigit(c) && !(c == '.')){
                return false;
            }
            else if (c == '.'){
                decimalCounter += 1;
                    if (decimalCounter > 1){
                        return false;
                    }
                }
        }
        
        return true;
    }
    
    // Validating if the customer class is either 1, 2 or 3, otherwise returning false
    public static boolean isValidCustomerClass(String customClass){
        int customClassNum = Integer.parseInt(customClass);
        
        return switch (customClassNum) {
            case 1 -> true;
            case 2 -> true;
            case 3 -> true;
            default -> false;
        };
    }
    
    // Validating if the purchase year is a valid year
    public static boolean isValidPurchaseYear(String year){
        int purchaseYear = Integer.parseInt(year);
        
        return purchaseYear < 2026;
    }
}
