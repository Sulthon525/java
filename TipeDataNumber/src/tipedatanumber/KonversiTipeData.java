/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tipedatanumber;

/**
 *
 * @author minya
 */
public class KonversiTipeData {
    public static void main(String[] args) {
        
         //Konversi nilai byte -> short -> int -> long -> float -> double
         
         //Otomatis Increase (Menambahi)
         byte iniByte = 100;
         short iniShort = iniByte;
         long iniLong = iniShort;
         float iniFloat = iniLong;
         double iniDouble = iniFloat;
                 
                 
         //Manual decrease (Mengurangi)
         //Tidak boleh melebihi batas dari nilai tipe data nomer itu sendiri contoh Byte tidak boleh melebihi 127
         float iniFloat2 = (float) iniDouble;
         double iniDouble2 = (double) iniLong;
         long iniLong2 = (long) iniShort;
         short iniShort2 = (short) iniByte;
         
         
    }
    
}
