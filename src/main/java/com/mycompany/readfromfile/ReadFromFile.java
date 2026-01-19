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
}
