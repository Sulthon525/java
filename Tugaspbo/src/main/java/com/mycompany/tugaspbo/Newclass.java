/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo;

/**
 *
 * @author user
 */
public class Newclass {
        private String nama;
        private String ident;
        private int nim;
        private String prodi;
        private double basisdata;
        private double pbo;
        private double web1;
        private double total;
        private double average;
 public void setNama (String temp)
 {
     nama = temp;
 }
 public String getNama()
 {
 return nama;
 
 }
 
 
 
 
 public void setIdent (String temp)
 {
     ident = temp;
 }
 public String getIdent()
 {
 return ident;
 }
 
 
 
 

public void setNim (int temp)
 {
nim = temp;
 }
 public int getNim()
 {
     return nim;
 }
 
 
 
 
 

 public void setProdi(String temp)
 {
    prodi = temp; 
 }
 
 public String getProdi()
 {
     return prodi;
     
 }
 
 
 public void setBasisdata (double temp)
 {
     basisdata = temp;
 }
 public double getBasisdata()
 {
     return basisdata;
 }
 
 
  public void setPbo(double temp)
 {
     pbo = temp;
 }
 public double getPbo()
 {
     return pbo;
 }
 
  public void setSWeb1 (double temp)
 {
     web1 = temp;
 }
 public double getWeb1()
 {
     return web1;
 }
 
 
 
 public double getTotal(){
     double result = 0;
     result = (basisdata+pbo+web1);
     
     return result;
 }
 
 
 
 public double getAverage(){
     double result = 0;
     result = (basisdata+pbo+web1) /3;
     
     return result;
 }
 
  
public void print (String temp)
    {
        System.out.println("Nama :"+nama);
        System.out.println("NIM :"+nim);
        System.out.println("Prodi :"+prodi); 
        System.out.println("Nilai Pemograma Web1"+web1);
        System.out.println("Nilai PBO"+pbo);
        System.out.println("Nilai Basis Data 2"+basisdata);
    }
   
    
    
 }

