/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo;

/**
 *
 * @author user
 */
public class Identitasmurid {
    private String nama;
    private String address;
    private int age;
    private double matematikaGrade;
    private double englishGrade;
    private double ipaGrade;
    private double average;
    private static int muridCount;


 
//menghasilkan nama murid
 public String getNama()
 {
 return nama;
 }
 public void setNama (String temp)
 {
     nama = temp;
 } 
 
//
// // menhasilkan dan mengubah alamat
// public void setAlamat(String temp)
// {
//    alamat = temp; 
// }
// 
// 
// 
// public void setUmur (int temp)
// {
//umur = temp;
// }
// // menhasilkan dan mengubah umur
// public int getUmur()
// {
//     return umur;
// }

 
 
//  public void setMatematikaGrade (double temp)
// {
//     matematikaGrade = temp;
// }
// public double getMatematikaGrade()
// {
//     return matematikaGrade;
// }
// 
// 
//  public void setEnglishGrade (double temp)
// {
//     englishGrade = temp;
// }
// public double getEnglishGrade()
// {
//     return englishGrade;
// }
// 
//  public void setIpaGrade (double temp)
// {
//     ipaGrade = temp;
// }
// public double getIpaGrade()
// {
//     return ipaGrade;
// }
// 
 //Menghitung rata rata nilai murid matematika, ingris, ipa
 public double getAverage(){
     double result = 0;
     result = (matematikaGrade+englishGrade+ipaGrade) /3;
     
     return result;
 }
 
  //menghasilkan jumlah instance identitas murid
 public static int getMuridCount()
 {
     return muridCount;
 }


 public class namamurid
 {
     public static void main(String[] args) {
         Identitasmurid rantiRecord = new Identitasmurid();
         Identitasmurid yantoRecord = new Identitasmurid();
         Identitasmurid husenRecord = new Identitasmurid();
         Identitasmurid jubaedahRecord = new Identitasmurid();
         
         rantiRecord.setNama("Ranti");
         yantoRecord.setNama("Yanto");
         husenRecord.setNama("Husen");
         jubaedahRecord.setNama("Jubaedah");
         
         System.out.println(rantiRecord.getNama());
         
         System.out.println("Count"+Identitasmurid.getMuridCount());
         
     }
 }

// public class identitasmuridcontoh
// {
//    public void print (String temp)
//    {
//        System.out.println("Naman :"+nama);
//        System.out.println("Alamat :"+alamat);
//        System.out.println("Umur :"+umur);  
//    }
//    public void print (double mGrade, double eGrade, double iGrade )
//    {
//        System.out.println("Nama :" +nama);
//        System.out.println("Nilai Matematika :"+mGrade);
//        System.out.println("Nilai English :"+eGrade);
//        System.out.println("Nilai Ipa :"+iGrade);
//    }
// }


}