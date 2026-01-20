/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.readfromfile;

/**
 *
 * @author Marika
 */
public class Customer {
    String firstName;
    String lastName;
    String totalPurchase;
    String customerClass;
    String lastPurchaseYear;
    
    public Customer(String name, String surname, String purchase, String customClass, String year){
        firstName = name;
        lastName = surname;
        totalPurchase = purchase;
        customerClass = customClass;
        lastPurchaseYear = year;
    }
}