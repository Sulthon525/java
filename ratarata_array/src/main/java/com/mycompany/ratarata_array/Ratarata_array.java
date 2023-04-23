/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ratarata_array;

/**
 *
 * @author user
 */
public class Ratarata_array {

    public static void main(String[] args) {
       int javaku[];
       javaku = new int[8];
       int i;
       int bd;
       float total;
       float avarage;
       bd = 8;
       total = 0;
       
        javaku[0] = 14;
        javaku[1] = 12;
        javaku[2] = 3;
        javaku[3] = 24;
        javaku[4] = 86;
        for (i = 0; i<bd; i++)
        {
            System.out.println("javaku["+i+"]"+javaku[i]);
            total = total + javaku[i];
            
        }
        avarage = total/bd;
        System.out.println("total ="+ total);
        System.out.println("rata-rata"+avarage);
    }
}
