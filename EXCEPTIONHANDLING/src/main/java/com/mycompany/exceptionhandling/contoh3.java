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
public class contoh3 {
    public static void main(String[] args) throws IOException{
    DataInputStream dis = new DataInputStream(System.in);
    String s = dis.readLine();
    // IOException harus ditangkap
    int a = 0;
    try{
      a = Integer.parseInt(s);
    }catch(NumberFormatException e){}
    System.out.println(a);
  }

}
