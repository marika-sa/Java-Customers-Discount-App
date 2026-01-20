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
}

public class Customer {
    String firstName;
    String lastName;
    float totalPurchase;
    int customerClass;
    int lastPurchaseYear;
    
    public Customer(String name, String surname, float purchase, int customClass, int year){
        firstName = name;
        lastName = surname;
        totalPurchase = purchase;
        customerClass = customClass;
        lastPurchaseYear = year;
    }
}
