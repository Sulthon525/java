/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihantugas1muhammadsulthon;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Latihantugas1MuhammadSulthon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner userInput=new Scanner(System.in);
       
       //Deklarasi variabel
       double phi=3.14;
       int panjang, luas, alas, tinggi, sisi;
       float r; 
       
       //Mencari Keliling Lingkaran
        System.out.println("Keliling Lingkaran");
        System.out.println("Masukan Jari-Jari Lingkaran =");
        r= userInput.nextFloat();
        
        //RUMUS
        luas = (int) (phi*r*r);
        System.out.println("Hasil Keliling Lingkaran ="+luas);
       
       //Mencari Luas Segitiga
       System.out.println("Luas Segitiga");
       System.out.println("Masukan Alas = ");
       alas= userInput.nextInt();
       System.out.println("Masukan Tinggi = ");
       tinggi= userInput.nextInt();
       
       //RUMUS
       luas = (int) (0.5*alas*tinggi);
       System.out.println("Hasil Luas Segitiga = "+luas);
       
      //Mencari Luas BujurSangkar
      System.out.println("Luas Bujur Sangkar");
      System.out.println("Masukan Sisi = ");
      sisi= userInput.nextInt();
      
      //RUMUS
      luas= sisi*sisi;
      System.out.println("Hasil Luas Bujur Sangkar = "+luas);
    }
    
}
