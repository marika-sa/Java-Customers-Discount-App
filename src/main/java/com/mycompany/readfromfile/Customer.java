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
    double totalPurchase;
    int customerClass;
    int lastPurchaseYear;
    
    public Customer(String name, String surname, double purchase, int customClass, int year){
        firstName = name;
        lastName = surname;
        totalPurchase = purchase;
        customerClass = customClass;
        lastPurchaseYear = year;
    }
}