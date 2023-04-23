/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.abstraksi;

/**
 *
 * @author user
 */
public class Abstraksi {

   public static void main(String[] args) {
        
            Encapsulaiton objek = new Encapsulaiton();
            objek.ModifNama("Muhammad Sulthon");
            objek.ModifAddress("Jalan Kauman Selatan");
            objek.ModifNim(21195030);
            
            System.out.println("Nama:"+objek.getNama());
            System.out.println("Nama:"+objek.getAddress());
            System.out.println("Nama:"+objek.getNim());
            
            
        
    }
}
