/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.pewarisan;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Pewarisan {

    public static void main(String[] args) {
        kelasA superClass  = new kelasA ();
        kelasB subClass  = new kelasB ();
        Scanner input = new Scanner (System.in);
        
        System.out.println(" Super class adalah kelas A");
        superClass.x = 100;
        superClass.y = 125;
        superClass.tampilannilaixy();
        
        System.out.println("\n Subclass adalah kelas B");
        subClass.x = 13;
        subClass.y = 15;
        subClass.tampilannilaixy();
        
        System.out.println("\n Masukan nilia z=");
        subClass.z = input.nextInt();
        subClass.tampilkanjumlah();
       
    }
}
