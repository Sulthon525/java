/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumetabung;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Volumetabung {
 // Menggunakan OOP
    public void volTabung() {
        Scanner input = new Scanner(System.in);
        
        double phi = 3.14;
        double r, t, volume;
        
        System.out.println("========================");
        System.out.println("Menghitung Volume Tabung");
        System.out.println("========================");
        
        System.out.println("Masukkan jari-jari tabung: ");
        r = input.nextDouble();
        
        System.out.println("Masukkan tinggi tabung: ");
        t = input.nextDouble();
        
        volume = (phi * r * r) * t;
        System.out.println("Volume tabung = " + volume);
    }
    
    public static void main(String[] agrs) {
        
        // Menggunakan Preosedural
        Scanner input = new Scanner(System.in);
        
        double phi = 3.14;
        double r, t, volume;
        
        System.out.println("========================");
        System.out.println("Menghitung Volume Tabung");
        System.out.println("========================");
        
        System.out.println("Masukkan jari-jari tabung: ");
        r = input.nextDouble();
        
        System.out.println("Masukkan tinggi tabung: ");
        t = input.nextDouble();
        
        volume = (phi * r * r) * t;
        System.out.println("Volume tabung = " + volume);
        
        // Menggunakan OOP java
        
        // Membuat 
        volTabung objek = new volTabung();
        // Memanggil oMethod volTabung
        objek.Volumetabung();
    }
}
