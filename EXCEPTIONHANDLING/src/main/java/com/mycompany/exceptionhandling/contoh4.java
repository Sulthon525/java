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
public class contoh4 {
    public static void main(String[] args)throws Exception{
    DataInputStream dis = new DataInputStream(System.in);
    System.out.print("Input tanggal:");
    try{
      int tgl = Integer.parseInt(dis.readLine());  
      if(tgl<1 || tgl>31)
        throw new Exception("Tanggal tdk benar!");
    }catch(NumberFormatException e){
      System.out.println("Nilai yg diinput bukan angka!");
    }catch(IOException e){
      System.out.println("Kesalan penginputan!");
    }

    }
}
