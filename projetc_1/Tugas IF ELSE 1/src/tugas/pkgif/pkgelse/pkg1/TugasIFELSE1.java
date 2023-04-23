/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.pkgif.pkgelse.pkg1;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class TugasIFELSE1 {

    /**
     * @param args the command line arguments
     * @param nim
     * @param kelas
     * @param nama
     */
    public static void main(String[] args, String nim, String kelas, String nama) {
        // TODO code application logic here

        
        System.out.println("Masukkan Nama : " + nama);
        System.out.println("Masukkan Kelas : " + kelas);
        System.out.println("Masukkan NIM : " + nim);
    Scanner masuk=new Scanner(System.in);
        int nilai;
        System.out.print("Masukkan Nilai : ");
        nilai=masuk.nextInt();
        
        if (nilai>=95){
            System.out.println("A+"); 
        }else if (nilai>=90){
             System.out.println("A"); 
        }else if (nilai>=80){
             System.out.println("B"); 
        }else if (nilai>=70){
             System.out.println("C");
        }else if (nilai>=60){
             System.out.println("D");
        }else if (nilai<=60){
             System.out.println("E");
        }else {
            System.out.println("SEMANGGAT BELAJARNYA!"); 
        }    
    }

    
        }
    

    

