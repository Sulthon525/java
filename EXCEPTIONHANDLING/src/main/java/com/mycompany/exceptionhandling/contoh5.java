/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;
import java.io.*;

/**
 *
 * @author user
 */
public class contoh5 {
      public static void main(String args[]){
    int a[] = new int[2];
    try {
      System.out.println("Elemen ketiga :" + a[3]);
    }
    catch(ArrayIndexOutOfBoundsException e) {
      System.out.println("Exception yg dilempar  :" + e);
    }
    finally{
         a[0] = 6;
         System.out.println("Elemen pertama: " + a[0]);
    }
  }

}
