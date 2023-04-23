/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspewarisan;

/**
 *
 * @author user
 */
class BangunRuang
{
    double phi = 3.14, v;
    
    public double tampilHasil()
    {
        return v;
    }
}

class Kubus extends BangunRuang
{
    double s;
    
    public void tampilVol(double s)
    {
        this.s = s;
        v = s * s * s;
        
        System.out.println("Volume Kubus = " + v);
    }
 
}

class Balok extends BangunRuang
{
    double p, l, t;
     
    public void tampilVol(double p, double l, double t)
    {
        this.p = p;
        this.l = l;
        this.t = t;
        v = p * l * t;
        
        System.out.println("Volume Balok = " + v);
    }
}

class Tabung extends BangunRuang
{
    double r;
    
    public void tampilVol(double r)
    {
        this.r = r;
        v = phi * r * r * r;
        
        System.out.println("Volume tabung = " + v);
    }
}

class Kerucut extends BangunRuang
{
    double r;
    
    public void tampilVol(double r)
    {
        this.r = r;
        v =(phi * r * r * r) * 1/3;
        
        System.out.println("Volume Kerucut = " + v);
    }
}

class Limas extends BangunRuang
{
    double la, t;
    
    public void tampilVol(double la, double t)
    {
        this.la = la;
        this.t = t;
        v =(la * t)* 1/3;
        
        System.out.println("Volume Limas = " + v);
    }
}

class Prisma extends BangunRuang
{
    double la, t;
    
    public void tampilVol(double la, double t)
    {
        this.la = la;
        this.t = t;
        v = la * t;
        
        System.out.println("Volume Prisma = " + v);
    }
}

class Bola extends BangunRuang
{
    double r;
    
    public void tampilVol(double r)
    {
        this.r = r;
        v =(phi * r * r * r)* 4/3;
        
        System.out.println("Volume Bola = " + v);
    }
}

public class TugasPbovolume {
    public static void main(String[] args) {
        Kubus kubus = new Kubus();
        Balok balok = new Balok();
        Tabung tabung = new Tabung();
        Kerucut kerucut = new Kerucut();
        Limas limas = new Limas();
        Prisma prisma = new Prisma();
        Bola bola = new Bola();
        
        
        kubus.tampilVol(10);
        balok.tampilVol(10, 10, 10);
        tabung.tampilVol(10);
        kerucut.tampilVol(10);
        limas.tampilVol(10, 10);
        prisma.tampilVol(10, 10);
        bola.tampilVol(10);
        
       
    }
}

