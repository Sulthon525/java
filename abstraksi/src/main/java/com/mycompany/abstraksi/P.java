/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraksi;
import java.*;
import java.io.*;

/**
 *
 * @author user
 */
abstract class P {
    abstract public void menthod2();
    int x, y, z;
    public void method1()
    {
        System.out.println("Menthod asli dari class abstrak1");
        System.out.println("Nilai x, y , z di input dalam class P ");
        x= 12;
        y= 10;
        
    }
    
}
class Q extends P{
    public void method2 ()
    {
        System.out.println("Menthod abstract yang sudah asli dalam class P");
        z = x+ y ;
        
        System.out.println("hasil perhitungan x+y ="+z);
        System.out.println(" ");
    }
    
}

class abstraksi_sederhana{
    public static void main(String[] args) {
        Q object = new Q();
        object.method1 ();
        object.method2 ();
        
    }
}