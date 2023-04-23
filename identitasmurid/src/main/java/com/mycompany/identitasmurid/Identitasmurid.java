/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.identitasmurid;

/**
 *
 * @author user
 */
public class Identitasmurid {
        private String nama;
        private String alamat;
        private int umur;
        private int nim;
        private String jurusan;
        private double nilaimat;
        private double nilaiingg;
        private double nilaiipa;
        private double ratarata;
        
       
        private static int muridCount;

 
 public void setNama (String temp)
 {
     nama = temp;
 }
//menghasilkan nama murid
 public String getNama()
 {
 return nama;
 }
 
 
 
 
 // menhasilkan dan mengubah alamat
 public void setAlamat(String temp)
 {
    alamat = temp; 
 }
 
 public String getAlamat()
 {
     return alamat;
     
 }
 
 
 public void setUmur (int temp)
 {
umur = temp;
 }
 // menhasilkan dan mengubah umur
 public int getUmur()
 {
     return umur;
 }
 
public void setNim (int temp)
 {
nim = temp;
 }
 // menhasilkan dan mengubah nim
 public int getNim()
 {
     return nim;
 }
 
// menhasilkan dan mengubah jurusan
 public void setJurusan(String temp)
 {
    jurusan = temp; 
 }
 
 public String getJurusan()
 {
     return jurusan;
     
 }
 
 
 public void setNilaimat (double temp)
 {
     nilaimat = temp;
 }
 public double getNilaimat()
 {
     return nilaimat;
 }
 
 
  public void setNilaiingg (double temp)
 {
     nilaiingg = temp;
 }
 public double getNilaiingg()
 {
     return nilaiingg;
 }
 
  public void setNilaiipa (double temp)
 {
     nilaiipa = temp;
 }
 public double getNilaiipa()
 {
     return nilaiipa;
 }
 
 //Menghitung rata rata nilai murid matematika, ingris, ipa
 public double getRatarata(){
     double result = 0;
     result = (nilaimat+nilaiingg+nilaiipa) /3;
     
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
         Identitasmurid MuhammadRecord = new Identitasmurid();
         Identitasmurid SulthonRecord = new Identitasmurid();
         MuhammadRecord.setNama("Muhammad");
         SulthonRecord.setNama("Sulthon");
         MuhammadRecord.setAlamat("pekauman");
         SulthonRecord.setAlamat("kauman");
         MuhammadRecord.setUmur(19);
         SulthonRecord.setUmur(18);
         MuhammadRecord.setNim(211930);
         SulthonRecord.setNim(211950);
         MuhammadRecord.setJurusan("TI");
         SulthonRecord.setJurusan("TI");
         
         
         System.out.println(MuhammadRecord.getNama());
         System.out.println(SulthonRecord.getNama());
         System.out.println(MuhammadRecord.getAlamat());
         System.out.println(SulthonRecord.getAlamat());
         System.out.println(MuhammadRecord.getUmur());
         System.out.println(SulthonRecord.getUmur());
         System.out.println(MuhammadRecord.getNim());
         System.out.println(SulthonRecord.getNim());
         System.out.println(MuhammadRecord.getJurusan());
         System.out.println(SulthonRecord.getJurusan());
         
         
     }
 }
 
    public void print (String temp)
    {
        System.out.println("Nama :"+nama);
        System.out.println("Alamat :"+alamat);
        System.out.println("Umur :"+umur);
        System.out.println("NIM :"+nim);
        System.out.println("Jurusan :"+jurusan);    
    }
   
}
