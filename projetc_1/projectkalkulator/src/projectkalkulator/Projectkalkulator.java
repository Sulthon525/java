/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectkalkulator;
import java.util.Scanner;

/**
 *
 * @author bangsul
 */
public class Projectkalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a, b, c;
         int pilih;
        Scanner scanner = new Scanner(System.in);
        //Creating infinite while loop
        while(true) {
 // menu
            System.out.println("M E N U  P I L I H A N ");
            System.out.println("===========================");
            System.out.println("1. Mencari Luas Persegi");
            System.out.println("2. Mencari Luas Persegi Panjang");
            System.out.println("3. Mencari Luas Jajargenjang");
            System.out.println("4. Mencari Keliling Segitiga Samasisi");
            System.out.println("5. Mencari Luas Lingkaran");
            System.out.println("Tekan angka 0 untuk keluar");
            System.out.println("===========================");
 
            //Asking user to make choice
            System.out.println("Silakan Pilih salah satu dari menu diatas dengan menekan angka");
            pilih = scanner.nextInt();
 
            //Creating switch case branch
            switch (pilih) {
 
 
              
               //KESATU
                case 1:
                    System.out.println("Masukan Nilai sisi A =");
                    a = scanner.nextInt();
                    c = a * 2;
                    System.out.println("Mencari Luas Persegi adalah = " + c +"\n");
                    break;
 
                // KEDUA
                case 2:
                    System.out.println("Masukan Nilai  Panjang A=");
                    a = scanner.nextInt();
                    System.out.println("Masukan Nilai Lebar B =");
                    b = scanner.nextInt();
                    c = (a + b)*2;
                    System.out.println("Mencari Luas Persegi Panjang adalah =  = " + c +"\n");
                    break;
                    
                // KETIGA
                    case 3:
                 
                    System.out.println("Masukan Alas A =");
                    a = scanner.nextInt();
                    System.out.println("Masukan Tinggi B =");
                    b = scanner.nextInt();
                    c = a * b; 
                    System.out.println("Mencari Luas Jajargenjang adalah =  " + c + "\n");
                    break;
 
                //KEEMPAT
                case 4:
 
                    System.out.println("Masukan Nilai Sisi Segitiga A=");
                    a = scanner.nextInt();
                    c = a * 3;
                    System.out.println("Mencari Keliling Segitiga Samasisi adalah =  " + c +"\n");
                    break;
                            
              
 
                //KELIMA
                    case 5:
                    double l,phi=3.14;
                    int r;
                    System.out.println("Masukan Nilai Jari-jari =");
                    r = scanner.nextInt();
                    //System.out.println("Masukan Nilai B =");
                    //b = scanner.nextInt();
                    l = phi*r*r;
                    System.out.println("Luas Lingkaran adalah =  " + l +"\n");
                    break;
                    //KELUAR
                case 0:
                    System.exit(0);
 
                //default case to display the message invalid choice made by the user
                default:
                    System.out.println("Anda Memilih Untuk Keluar.");
            }
        }
    }
    }
