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
    public boolean isValidFirstName(String name){
        char[] chars = name.toCharArray();
        
        for (char c : chars){
            if(!Character.isLetter(c)){
                return false;
            }
        }
        
        return true;
    }
    
    // Validating if the last name in the customers.txt only contains letters
    public boolean isValidLastName(String lName){
        char[] chars = lName.toCharArray();
        
        for (char c : chars){
            if(!Character.isLetter(c)){
                return false;
            }
        }
        
        return true;
    }
    
     // Validating if the last name in the customers.txt only contains letters
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
}
