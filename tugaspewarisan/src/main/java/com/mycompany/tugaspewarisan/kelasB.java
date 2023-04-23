/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspewarisan;

/**
 *
 * @author user
 */
class kelasB extends kelasA {
    void hasil(){
        System.out.println("1. Volume Kubus : "+s*s*s);
        System.out.println("2. Volume Balok : "+p*a*t);
        System.out.println("3. Volume Tabung : "+phi*r*r*t);
        System.out.println("4. Volume Kerucut : "+0.3*phi*r*r*t);
        System.out.println("5. Volume Limas : "+0.3*lAlas*t);
        System.out.println("6. Volume Prisma : "+a*t/2*tPrisma);
        System.out.println("7. Volume Bola : "+0.75*phi*r*r*r);
    }
}