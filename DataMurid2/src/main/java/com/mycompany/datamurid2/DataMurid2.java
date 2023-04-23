/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.datamurid2;

/**
 *
 * @author user
 */
public class DataMurid2 {
   
    private String stuNama;
    private String stuAlamat;
    private int stuAge;
    private int stuNim;
    private String stuJurusan;
     private double mathGrade;
        private double englishGrade;
        private double scienceGrade;
        private double average;
    
    
    DataMurid2()
    {
        stuNama = "jamal";
        stuAlamat = "pekauman";
        stuAge = 18;
        stuNim = 21195036;
        stuJurusan = "TI";
        mathGrade = 96;
        englishGrade = 79;
        scienceGrade = 86;
        
   
    }
     
    
    DataMurid2 (String strnama, int num1, String stralamat, int num2, String strjurusan, int num3, int num4, int num5)
    {
        stuNama = strnama;
        stuAlamat = stralamat;
        stuAge = num1;
        stuNim = num2;
        stuJurusan = strjurusan;
         mathGrade = num3;
        englishGrade = num4;
        scienceGrade = num5;
        
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
        DataMurid2 data1 = new DataMurid2();
         System.out.println("Nama Murid adalah :"+data1.getstuNama());
         System.out.println("Umur Murid adalah :"+data1.getStuAge());
         System.out.println("Alamat Murid adalah :"+data1.getstuAlamat());
         System.out.println("NIM Murid adalah :"+data1.getStuNim());
         System.out.println("Jurusan Murid adalah :"+data1.getstuJurusan());
         System.out.println("Nilai mat: "+data1.getMathGrade());
         System.out.println("Nilai ipa adalah : "+data1.getScienceGrade());
         System.out.println("Nilai ingg adalah : "+data1.getEnglishGrade());
         System.out.println("Nilai rata rata adalah : "+data1.getAverage());
         
         
   
        
        DataMurid2 data2 = new DataMurid2("Muhammad sulthon", 18, "kauman", 21195030, "TI", 89, 90, 99);
        System.out.println("Nama Murid adalah :"+data2.getstuNama());
         System.out.println("Umur Murid adalah :"+data2.getStuAge());
         System.out.println("Alamat Murid adalah :"+data2.getstuAlamat());
         System.out.println("NIM Murid adalah :"+data2.getStuNim());
         System.out.println("Jurusan Murid adalah :"+data2.getstuJurusan());
         System.out.println("Nilai mat: "+data2.getMathGrade());
         System.out.println("Nilai ipa adalah : "+data2.getScienceGrade());
         System.out.println("Nilai ingg adalah : "+data2.getEnglishGrade());
         System.out.println("Nilai rata rata adalah : "+data2.getAverage());
        
        
     }

}
