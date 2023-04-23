/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dowhile;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Dowhile {

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
        a = 1;
		do{
			angka = 0;
			
			b = 1;
			do{
				if(a%b== 0){
					angka++;
				}
				b++;
			}while(b<=a);
			
			if(angka==2){
				prima += a + " ";
			}
			a++;		
		}while(a<=1000);
			
		c = 1;
		do{
			if( c%2 == 0 ){
				genap += c + " ";
			}else{
				ganjil += c + " ";
			}
			c++;
		}while(c<=1000);
		
		
		System.out.println("Bilangan prima: \n" + prima + " \n");
		System.out.println("Bilangan genap: \n" + genap + " \n");
		System.out.println("Bilangan ganjil:  \n" + ganjil + " \n");
    }
}
}
