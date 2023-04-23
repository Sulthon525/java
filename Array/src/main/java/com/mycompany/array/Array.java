/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array;

/**
 *
 * @author user
 */
public class Array {

    public static void main(String[] args) {
        int java[];
        java = new int[5];
        int i;
        java[0] = 14;
        java[1] = 12;
        java[2] = 3;
        java[3] = 24;
        java[4] = 86;
        
        for(i=0 ; i<java.length;i++)
        {
            System.out.println("java["+i+"]"+java[i]);
        }
      
    }
}
