/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrayduadimensi;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Arrayduadimensi {

    public static void main(String[] args) {
       Scanner inputan = new Scanner (System.in);
       int i,j;
       int A[][] = new int [2] [2];
        int B[][] = new int [2] [2];
         int C[][] = new int [2] [2];
         
         System.out.println(" Masukan Nilai Matrix X");
         System.out.println("==================");
         for(i=0; i<2; i++)
         {
             for(j=0; j<2; j++)
             {
                 System.out.print("["+(i+1)+"]["+(j+1)+"]:");
             A[i][j] = inputan.nextInt();
             }
            
         }
         System.out.println(" Masukan Nilai Matrix Y");
         System.out.println("==================");
         for(i=0; i<2; i++)
         {
             for(j=0; j<2; j++)
             {
                 System.out.print("["+(i+1)+"]["+(j+1)+"]:");
             B[i][j] = inputan.nextInt();
             }
            int pilih;
            pilih = inputan.nextInt();
            
            switch(pilih){
                case 1:
         // MELAKUKAN PENJUMLAHAN MATRIX(RUMUS)
         for(i=0; i<2; i++);
         {
             for(j=0; j<2; j++);
             {
       
          C[i][j]=A[i][j]+B[i][j];
             }
         }
          System.out.println(" \n Hasil Penjumlahan Matrix Y");
         System.out.println("==================");
         for(i=0; i<2; i++)
         {
             for(j=0; j<2; j++)
             {
                 System.out.println(+(C[i][j])+" ");
                 break;
             }
             
             default : System.out.println("kalkulator Matrix Selesai~~~~~~~~~~~~~~``");
             
            

         }
            }
         }
    }
}
    
