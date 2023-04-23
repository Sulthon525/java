/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exceptionhandling;
// Nama file InsufficientFundsException.java
import java.io.*;

/**
 *
 * @author user
 */
public class contoh6a extends Exception {
    private double amount;
   public contoh6a(double amount)
   {
      this.amount = amount;
   } 
   public double getAmount()
   {
      return amount;
   }

}
