
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author user
 */
public class NewClass {
    Scanner input = new Scanner(System.in);
    
    public void kelilingLingkaran(){
        double phi = 3.14;
        double r, keliling;
        
        System.out.println("=============================");
        System.out.println("Menghitung Keliling Lingkaran");
        System.out.println("=============================");
        
        System.out.println("Masukkan jari-jari: ");
        r = input.nextDouble();
        
        keliling = 2 * phi * r;
        System.out.println("Keliling Lingkaran = " + keliling);
    }
    
    public void luasTrapesium() {
        double a, b, t, luas;
        
        System.out.println("=========================");
        System.out.println("Menghitung Luas Trapesium");
        System.out.println("=========================");
        
        System.out.println("Masukkan alas atas: ");
        a = input.nextDouble();
        
        System.out.println("Masukkan alass bawah: ");
        b = input.nextDouble();
        
        System.out.println("Masukkan tinggi trapesium: ");
        t = input.nextDouble();
        
        luas = 0.5 * (a+b) * t;
        System.out.println("Luas Trapesium = " + luas);
    }
    
    public void luasPrismaSegitiga() {
        double lAlas, kAlas, t, luas;
        
        System.out.println("===============================");
        System.out.println("Menghitung Luas Prisma Segitiga");
        System.out.println("===============================");
        
        System.out.println("Masukkan luas alas prisma: ");
        lAlas = input.nextDouble();
        
        System.out.println("Masukkan keliling alas prisam: ");
        kAlas = input.nextDouble();
        
        System.out.println("Masukkan tinggi prisma: ");
        t = input.nextDouble();
        
        luas = (2 * lAlas) + (kAlas * t);
        System.out.println("Luas Prisma Segitiga = " + luas);
    }
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Scannerr obj = new Scannerr();
        
        System.out.println("-----------MENU PILIHAN-----------");
        System.out.println("==================================");
        System.out.println("1. Menghitung Keliling Lingkaran");
        System.out.println("2. Menghitung Luas Trapesium");
        System.out.println("3. Menghitung Luas Prisma Segitiga");
        System.out.println("==================================");

        // pilih menu diatas menggunak angka yang dimasukkan user
        System.out.println("Silahkan pilih Menu diatas dengan menekan angka: ");
        int pilih = input.nextInt();
        
        switch(pilih) {
            case 1 -> obj.kelilingLingkaran();
            case 2 -> obj.luasTrapesium();
            case 3 -> obj.luasPrismaSegitiga();
            default -> System.out.println("Angka yang Anda inputkan tidak sesuai!");
                    
        }
    }
}
   
