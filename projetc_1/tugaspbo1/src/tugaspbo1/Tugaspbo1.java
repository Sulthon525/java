/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tugaspbo1;
//nama project
import java.util.Scanner;
// mengimport scanner ke program 
// author =
public class Tugaspbo1 {
// rangkaian 

     private static int Luas;
     // privat untuk memanggil rumus luas (kelas utama)
    
    public static void main(String[] args) {
      //Deklarasi kelas utama
      int a,b,c,d,t,r,panjang,lebar,luas,tinggi,sisi,volume,rusuk1,rusuk2,hasil1,hasil2,nilai;
      // tipe data int untuk memasukan data yang berupa bilangan bulat 
      int pilih;
      // variabel data untuk switch (bilangan bulat)
      double phi = 3.14;
      // tipe data int untuk memasukan data yang berupa bilangan desimal
      Scanner scanner = new Scanner(System.in);
      //creating infinite while loop
      while(true) {
          // while(penggulanggan) untuk menampilkan output (menu)
          
          //menu
          System.out.println("M E N U P I L I H A N");
          System.out.println("=====================");
          System.out.println("1. Mencari Luas Isi Tabung");
          System.out.println("2. Mencari Luas Persegi Panjang");
          System.out.println("3. Mencari Luas Trapesium");
          System.out.println("4. Tekan Angka 4 Untuk Keluar");
          System.out.println("======================");
          
          //Asking user to make choice
          System.out.println("Silahkan pilih salah satu menu diatas dengan menekan angka");
          pilih = scanner.nextInt();
          
          //creating switch case branch
          
          switch (pilih) { 
              // swicth untuk memilih antara case satu dengan yang lainya
            
              case 1:
                  // pilihan satu
                  System.out.println("Masukan Jari-Jari Alas = ");
                  r = scanner.nextInt();
                  System.out.println("Masukan Tinggi Tabung = ");
                  t = scanner.nextInt();
                  
                  //Rumus luas isi tabung 
                  luas = (int) (2 * (phi * r * r) + (2 * phi * r * r * t));
                  
                  //output
                  System.out.println("Luas Tabung = "+luas);
                  break;
                  
              case 2: 
                  System.out.println("Masukan Panjang = ");
                  // untuk mencetak output kata "Masukan Panjang"
                  panjang = scanner.nextInt();
                  // untuk memasukan input panjang
                  
                  System.out.println("Masukan Lebar = ");
                  // untuk mencetak output kata "Masukan Lebar"
                  lebar = scanner.nextInt();
                  // untuk memasukan input lebar
                  
                  luas = panjang*lebar;
                  //Rumus luas persegi panjang
                  
                  
                  //output
                  System.out.println("Luas persegi panjang adalah = "+luas);
                  // arti tulisan (+) menyambungkan rumus  
                  break;
                  // menghentikan program dan kembali ke switch menu
                  
              case 3:
                  System.out.println("Masukan Panjang Rusuk Atas = ");
                  rusuk1 = scanner.nextInt();
                  System.out.println("Masukan Panjang Rusuk Bawah = ");
                  rusuk2 = scanner.nextInt();
                  System.out.println("Masukan Tinggi Trapesium = ");
                  tinggi = scanner.nextInt();
                  
                  //Rumus luas trapesium
                  luas = (int) (0.5 * (rusuk1 + rusuk2) * tinggi);
                  
                  //output
                  System.out.println("Luas trapesium adalah = "+luas);
                  break;
                  
              case 4:
                  System.exit(0);
                  System.out.println("Anda Memilih Untuk Keluar");
                  //case default untuk menampilkan pesan pilihan tidak valid yang dibuat pengguna
                  
              default:
                  // default untuk memilih angka yang tidak terdapat dalam menu/case
                  System.out.println("Anda Memilih Untuk Keluar");
          }
    }
    }
}
