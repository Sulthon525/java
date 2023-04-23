/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstraksi;

/**
 *
 * @author user
 * 
 */

public class data_siswa {
    
    private String nama;
    private String alamat;
    private int nim;
    private String jurusan;
    private String fakultas;
    private String universitas;
    private String email;
    private String pekerjaan;
    private String hobi;
    private String keahlian;
    private String karya;
    
    public String getNama()
    {
        return this.nama;
        
    }
    
    
    public String getAlamat()
    {
        return this.alamat;
        
    }
    
    
    public int getNim()
    {
        return this.nim;
        
    }
    
    public String getJurusan()
    {
        return this.jurusan;
        
    }
    
    
    public String getFakultas()
    {
        return this.fakultas;
        
    }
    
    public String getUniversitas()
    {
        return this.universitas;
        
    }
    
    public String getEmail()
    {
        return this.email;
        
    }
    // get itu object
    public String getPekerjaan()
    {
        return this.pekerjaan;
        
    }
    
    public String getHobi()
    {
        return this.hobi;
        
    }
    
    public String getKeahlian()
    {
        return this.keahlian;
        
    }
    
    public String getKarya()
    {
        return this.karya;
        
    }
    
    
    public void ModifNama (String nama){
        this.nama = nama;
        
    }
    
    public void ModifAlamat (String alamat){
        this.alamat = alamat;
    }
    
    public void ModifNim (int nim){
        this.nim = nim;
    }
    
    public void ModifJurusan (String jurusan){
        this.jurusan = jurusan;
    }
    
    public void ModifFakultas (String fakultas){
        this.fakultas = fakultas;
    }
    
    public void ModifUniversitas (String universitas){
        this.universitas = universitas;
    }
    
    public void ModifEmail (String email){
        this.email = email;
    }
    
    public void ModifPekerjaan (String pekerjaan){
        this.pekerjaan = pekerjaan;
    }
    
    public void ModifHobi (String hobi){
        this.hobi = hobi;
    }
    
    public void ModifKeahlian (String keahlian){
        this.keahlian = keahlian;
    }
    
    public void ModifKarya (String karya){
        this.karya = karya;
    }
    
}
