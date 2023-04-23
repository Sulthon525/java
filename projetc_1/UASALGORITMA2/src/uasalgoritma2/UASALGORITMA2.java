/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uasalgoritma2;

import java.util.Scanner;

/**
 *
 * @author sulthon
 */
public class UASALGORITMA2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 Scanner pilihan = new Scanner(System.in);
    int x,y,z;
    int totbayar;
        System.out.println("Masukan Jumlah Beli=");
        x=pilihan.nextInt();
        System.out.println("Masukan Harga Satau barang=");
        y=pilihan.nextInt();
        z=x*y;
        System.out.println("Jumlah Total Bayar=" + z +"\n");
        
        
        if(z<=150000){ //ekpresi 1
            System.out.println("=========================================" );
            System.out.println("Anda Mendapat Diskon 5%");
            System.out.println("Jumlah Pembelian                =" + x +"");
            System.out.println("Harga Satuan Barang             =" + y +"");  
            System.out.println("Jumlah Bayar Sebelum Diskon     =" + z +"");
            System.out.println("Jumlah Potongan                 = " + z * 5/100 +"");//statemen 1
            totbayar=z - z*5/100;
            System.out.println("-----------------------------------  -");
            System.out.println("Jumlah Bayar setelah diskon     =" + totbayar +"");
            System.out.println("=========================================");
            System.out.println("**TERIMA KASIH TELAH BERBELANJA DI KAMI**" );
            
        }else if(z>150000&&z<500000){ //ekpresi 2
            System.out.println("========================================" );
            System.out.println("Anda Mendapat Diskon 10%");//stetment
            System.out.println("Jumlah Pembelian                =" + x +"");
            System.out.println("Harga Satuan Barang             =" + y +"");
            System.out.println("Jumlah Bayar Sebelum Diskon     =" + z +"");
            System.out.println("Jumlah Potongan                 = " + z * 10/100 +"");//statemen 1
            totbayar=z - z*10/100;
            System.out.println("-----------------------------------  -");
            System.out.println("Jumlah Bayar setelah diskon     =" + totbayar +"");
            System.out.println("=========================================");
            System.out.println("**TERIMA KASIH TELAH BERBELANJA DI KAMI**" );
            
        }else if(z>=500000&&z<700000){
            System.out.println("=========================================" );
            System.out.println("Anda mendapat Diskon 15%");//stetment
            System.out.println("Jumlah Pembelian                =" + x +"");           
            System.out.println("Harga Satuan Barang             =" + y +"");
            System.out.println("Jumlah Bayar Sebelum Diskon     =" + z +"");
            System.out.println("Jumlah Diskon                   = " + z * 15/100 +"");//statemen 1
            totbayar=z - z*15/100;
            System.out.println("-----------------------------------  -");
            System.out.println("Jumlah Bayar setelah diskon     =" + totbayar +"\n");
            System.out.println("=========================================" );
            System.out.println("**TERIMA KASIH TELAH BERBELANJA DI KAMI**" );
            
        }else if(z==4){
            System.out.println("nilai  x= 4");
        }else if(z==5){
            System.out.println("Nilai x=5");
        }else if(z==6){
            System.out.println("Ini adalah Benar");
        }else{
            System.out.println("Anda tidak dapat DISKON");
        }
    }
    }
