/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.forlooping;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Forlooping {

    public static void main(String[] args) {
        int a, b, c, bagi, nilaiawal, nilaiakhir;
       Scanner inputUser = new Scanner(System.in);
        System.out.println("masukan nilai akhir =\n");
        nilaiakhir= inputUser.nextInt();
        
                String prima = " ";
		String genap = " ";
		String ganjil = " ";
		
		for(a = 1; a<=1000; a++){
			bagi =0;
			for(b=1; b<=a; b++){
				if(a%b == 0){
					bagi++;
				}
                        }
                        if(bagi == 2){ 
				prima += a + " ";
                             
		}
		
		for(c=1; c<=nilaiakhir; c++){
			if(c%2==0){
				genap += c + " ";
			}else {
				ganjil += c + " ";
			}
		}
		
		System.out.println("Bilangan prima= " + prima + " \n");
		System.out.println("Bilangan genap= " + genap + " \n");
		System.out.println("Bilangan ganjil= " + ganjil + " \n");
                {
                    break;
                }
	} 
        
            System.out.println("program berakhir");
        }
    }
       
    

