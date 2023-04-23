/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.array2dimensi;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class Array2dimensi {
  public static void main(String[] args) {
    int a, b;
    int matriksY[][] = new int[2][2];
    int matriksX[][] = new int[2][2];
    int hasil[][] = new int[2][2];
    
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan nilia matriks X : ");
    for (a = 0; a < 2; a++) {
      for (b = 0; b < 2; b++) {
        matriksX[a][b] = scan.nextInt();
      }
    }
    System.out.print("Masukkan nilai matriks Y : ");
    for (a = 0; a < 2; a++) {
      for (b = 0; b < 2; b++) {
        matriksY[a][b] = scan.nextInt();
      }
    }
      System.out.println("=======================");
      System.out.println("Menu Kalkulator Matrix");
      System.out.println("1. Penambahan Matrix");
      System.out.println("2. Pengurangan Matrix");
      System.out.println("3. Perkalian Matrix");
       System.out.println("=======================");
      System.out.println(" pilih dengan masukan angka");
      
      int pilih;
      pilih = scan.nextInt();
      
      
      switch (pilih){
          case 1:
    System.out.println("Hasil penjumlahan matriks: ");
    for (a = 0; a < 2; a++) {
      for (b = 0; b < 2; b++) {
        hasil[a][b] = matriksX[a][b] + matriksY[a][b];
        System.out.print(hasil[a][b] + "\t");
      }
      System.out.println();
      break;
    }
          case 2:
    System.out.println("Hasil pengurangan matriks: ");
    for (a = 0; a < 2; a++) {
      for (b = 0; b < 2; b++) {
        hasil[a][b] = matriksX[a][b] - matriksY[a][b];
        System.out.print(hasil[a][b] + "\t");
      } 
      System.out.println();
      break; 
}
          case 3:
    System.out.println("Hasil perkalian matriks: ");
      for (a = 0; a < 2; a++) {
        for (b = 0; b< 2; b++) {
          System.out.print(hasil[a][b] + "\t");
        }
        System.out.println();
      break; 
  }
          default : System.out.println("kalkulator Matrix Selesai~~~~~~~~~~~~~~``");
}
  }
}

