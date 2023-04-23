/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraksi;

/**
 *
 * @author user
 */
public class pemangilan_data {
    public static void main(String[] args) {
        
            data_siswa objek = new data_siswa();
            objek.ModifNama("Muhammad Sulthon");
            objek.ModifAlamat("Jalan Kauman Selatan");
            objek.ModifNim(21195030);
            objek.ModifJurusan("Teknik Informatika");
            objek.ModifFakultas("lmu Komputer");
            objek.ModifUniversitas("STMIK TEGAL");
            objek.ModifEmail("MuhammadSulthon12345@gmail.com");
            objek.ModifPekerjaan("pedagang");
            objek.ModifHobi("Adventure");
            objek.ModifKeahlian("Tidur sepanjang hari");
            objek.ModifKarya("Jurnal ilmiah");
            
            System.out.println("Data Siswa");
            System.out.println("Nama:"+objek.getNama());
            System.out.println("Alamat:"+objek.getAlamat());
            System.out.println("NIM:"+objek.getNim());
            System.out.println("Jurusan:"+objek.getJurusan());
            System.out.println("Fakultas:"+objek.getFakultas());
            System.out.println("Universitas:"+objek.getUniversitas());
            System.out.println("Email:"+objek.getEmail());
            System.out.println("Pekerjaan:"+objek.getPekerjaan());
            System.out.println("Hobi:"+objek.getHobi());
            System.out.println("Keahlian:"+objek.getKeahlian());
            System.out.println("Karya:"+objek.getKarya());
            
        
    }
    
}
