/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pewarisan;

/**
 *
 * @author user
 */
class Bentukwajah {
    public String respons()
    {
        return ("perhatikan reaksi wajah saya");
        
    }      
}

class Senyum extends Bentukwajah{
    public String respons()
    {
        return ("saya senyum karena senang");
        
    } 
}

class Tertawa extends Bentukwajah{
    public String respons()
    {
        return ("saya tertawa karena bahagia");
        
    } 
}


class Marah extends Bentukwajah{
    public String respons()
    {
        return ("saya marah karena kesal");
        
    } 
}


class Sedih extends Bentukwajah{
    public String respons()
    {
        return ("saya sedih karena pulpennya ilang");
        
    } 
}

public class ProgramPolimorpis{
    public static void main(String[] args) {
      Bentukwajah objBentuk = new Bentukwajah();
      Senyum objSenyum = new Senyum();
      Tertawa objTertawa = new Tertawa();
      Marah objMarah = new Marah();
      Sedih objSedih = new Sedih();
      
      Bentukwajah [] Bentuk = new Bentukwajah [5];
      Bentuk[0] = objBentuk;
      Bentuk[1] = objSenyum;
      Bentuk[2] = objTertawa;
      Bentuk[3] = objMarah;
      Bentuk[4] = objSedih;
      
      
        System.out.println("Bentuk [0] = "+ Bentuk[0].respons());
        System.out.println("Bentuk [1] = "+ Bentuk[1].respons());
        System.out.println("Bentuk [2] = "+ Bentuk[2].respons());
        System.out.println("Bentuk [3] = "+ Bentuk[3].respons());
        System.out.println("Bentuk [4] = "+ Bentuk[4].respons());
    }
 
}

