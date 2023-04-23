/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraksi;

/**
 *
 * @author user
 */
public class Belajar_Enkapulasi {
    public static void main(String[] args) {
        
            Encapsulaiton objek = new Encapsulaiton();
            objek.ModifNama("Muhammad Sulthon");
            objek.ModifAlamat("Jalan Kauman Selatan");
            objek.ModifNim(21195030);
            
            System.out.println("Nama:"+objek.getNama());
            System.out.println("Nama:"+objek.getAlamat());
            System.out.println("Nama:"+objek.getNim());
            
            
        
    }
    
}
