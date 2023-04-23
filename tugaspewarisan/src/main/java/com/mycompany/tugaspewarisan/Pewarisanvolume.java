
package com.mycompany.tugaspewarisan;
/**
 *
 * @author user
 */

public class Pewarisanvolume  {
    public static void main(String[] args) {
        kelasA superClass = new kelasA();
        kelasB subClass = new kelasB();
        
        System.out.println("kelasX adalah SuperClass");
        superClass.s = 9;
        superClass.p = 12;
        superClass.a = 8;
        superClass.r = 10;
        superClass.t = 7;
        superClass.lAlas = 12;
        superClass.tPrisma = 14;
        superClass.nilaivolume();
        System.out.println(" ");
        System.out.println("kelasY adalah SubClass ");
        subClass.s = 11;
        subClass.p = 12;
        subClass.a = 6;
        subClass.r = 5;
        subClass.t = 13;
        subClass.lAlas = 10;
        subClass.tPrisma = 12;
        subClass.nilaivolume();
        System.out.println(" ");
        System.out.println("Volume Bangun Ruang");
        subClass.hasil();
    }
}
