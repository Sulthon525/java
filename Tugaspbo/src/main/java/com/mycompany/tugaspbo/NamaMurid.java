/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo;

/**
 *
 * @author user
 */
public class NamaMurid {
   public static void main(String[] args) {
         Identitasmurid rantiRecord = new Identitasmurid();
         Identitasmurid yantoRecord = new Identitasmurid();
         Identitasmurid husenRecord = new Identitasmurid();
         Identitasmurid jubaedahRecord = new Identitasmurid();
         
         rantiRecord.setNama("Ranti");
         yantoRecord.setNama("Yanto");
         husenRecord.setNama("Husen");
         jubaedahRecord.setNama("Jubaedah");
         
         System.out.println(rantiRecord.getNama());
         
         System.out.println("Count"+Identitasmurid.getMuridCount());
         
     }
}
    

