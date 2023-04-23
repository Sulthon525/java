/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utsmuhammadsulthon;

import java.util.Scanner;

/**
 *
 * @author MAS SULTHON
 */
public class UTSALGORITMADANPEMOGRAMAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userInput=new Scanner(System.in);
       
       //Deklarasi variabel
       double phi=3.14;
       float r; 
       
       //MENGHITUNG LUAS LINGKARAN
        System.out.println("---------------------------------");
        System.out.println("RUMUS LUAS LINGKARAN");
        System.out.println("---------------------------------");
        System.out.println("Masukan Nilai Jari-Jari Lingkaran =");
        r= userInput.nextInt();
       
        //RUMUS LUAS LINGKARAN
        int luas = (int) (phi*r*r);
        
        //TAMPILKAN HASIL 
        System.out.println("Maka LUAS LINGKARAN ="+luas);
    }
    
}
/**/