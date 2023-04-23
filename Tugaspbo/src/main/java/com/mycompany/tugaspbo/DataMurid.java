/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspbo;

/**
 *
 * @author user
 */
public class DataMurid {
   
    private String stuNama;
    private String stuAlamat;
    private int stuAge;
    private int stuNim;
    private String stuJurusan;
     private double mathGrade;
        private double englishGrade;
        private double scienceGrade;
        private double average;
    
    
    DataMurid()
    {
        stuNama = "Muhammad sulthon";
        stuAlamat = "kauman";
        stuAge = 19;
        stuNim = 21195030;
        stuJurusan = "TI";
   
    }
     
    
    DataMurid (int num1, String str, int num2 )
    {
        stuNama = str;
        stuAlamat = str;
        stuAge = num1;
        stuNim = num2;
        stuJurusan = str;
    }
    
  
     
     
     public String getstuNama()
    {
        return stuNama;
    }
     public void setStuNama(String stuNama)
     {
     this.stuNama = stuNama;
     }
     
      public String getstuAlamat()
    {
        return stuAlamat;
    }
     public void setAlamat(String stuAlamat)
     {
     this.stuAlamat = stuAlamat;
     }
     
     
      public int getStuAge()
    {
        return stuAge;
    }
     public void setStuAge(int stuAge)
     {
     this.stuAge = stuAge;
     }
     
     public int getStuNim()
    {
        return stuNim;
    }
     public void setStuNim(int stuNim)
     {
     this.stuNim = stuNim;
     }
     
     public String getstuJurusan()
    {
        return stuJurusan;
    }
     public void setJurusan(String stuJurusan)
     {
     this.stuJurusan = stuJurusan;
     }
     
  
 
 
 public void setMathGrade (double temp)
 {
     mathGrade = temp;
 }
 public double getMathGrade()
 {
     return mathGrade;
 }
 
 
  public void setEnglishGrade (double temp)
 {
     englishGrade = temp;
 }
 public double getEnglishGrade()
 {
     return englishGrade;
 }
 
  public void setScienceGrade (double temp)
 {
     scienceGrade = temp;
 }
 public double getScienceGrade()
 {
     return scienceGrade;
 }
 
 //Menghitung rata rata nilai murid matematika, ingris, ipa
 public double getAverage(){
     double result = 0;
     result = (mathGrade+englishGrade+scienceGrade) /3;
     
     return result;
 }
     
     
     
     
     public static void main(String[] args) {
        DataMurid data1 = new DataMurid();
         System.out.println("Nama Murid adalah :"+data1.getstuNama());
         System.out.println("Umur Murid adalah :"+data1.getStuAge());
         System.out.println("Alamat Murid adalah :"+data1.getstuAlamat());
         System.out.println("NIM Murid adalah :"+data1.getStuNim());
         System.out.println("Jurusan Murid adalah :"+data1.getstuJurusan());
         System.out.println("Nilai mat: "+data1.getAverage());
         System.out.println("Nilai ipa adalah : "+data1.());
         System.out.println("Nilai ingg adalah : "+data1.getEnglishGrade());
         System.out.println("Nilai rata rata adalah : "+data1.getAverage());
        
        DataMurid data2 = new DataMurid();
        System.out.println("Nama Murid adalah :"+data2.getstuNama());
         System.out.println("Umur Murid adalah :"+data2.getStuAge());
         System.out.println("Alamat Murid adalah :"+data1.getstuAlamat());
         System.out.println("NIM Murid adalah :"+data1.getStuNim());
         System.out.println("Jurusan Murid adalah :"+data1.getstuJurusan());
        
     }
     
     
     
}
