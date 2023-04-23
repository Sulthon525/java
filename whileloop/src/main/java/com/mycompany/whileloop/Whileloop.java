/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.whileloop;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Whileloop {

    public static void main(String[] args) {
       int a, b, c, angka;
        String prima = " ";
        String genap = " ";
        String ganjil = " ";
       
       {
        Scanner inputUser = new Scanner(System.in);
        System.out.println("Mencari nilai prima");
        System.out.println("masukan nilai akhir =");
        angka = inputUser.nextInt();
        a = 2 ;
        angka = 1;
        
       while(a <= 1000){
			angka = 0;
			b=1;
			while(b <= a){
			
				if(a%b== 0){
					angka++;
				}
			b++;
			}
			
			if(angka==2){
			prima += a + " ";
			}
			a++;
		}
		
		c=1;
		while( c <= 1000){
			
			if( c%2 == 0 ){
				genap += c + " ";
			}else{
				ganjil += c + " ";
			}
			c++;
             } {
           
                System.out.println("nilai prima = " + prima + "");
                System.out.println("nilai genap = " + genap + "");
                System.out.println("nilai ganjil = " + ganjil + "");
                
            System.out.println("==================================");
       
        }
        }
    }
}

