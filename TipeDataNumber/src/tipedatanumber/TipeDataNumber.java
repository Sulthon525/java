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
public class TipeDataNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //tipedata byte -128 +127 1 byte
        byte intByte = 100;
        
        //tipedata short -32768 +32767 2 byte
        short iniShort =1_000;
        
        //tipedata int -2147483648 +2147483648 4 byte
        int iniInt = 10_000_000;
        //tipedata long -9223372036854775808 +9223372036854775807 8 byte
        long iniLong = 1_000_000_000L;
       
        
        
        //tipe data koma (float dan double)
        //float = 3.4e-038  4 byte
        float iniFloat = 10.10F;
        //double = 1.7e-308  8 byte
        double iniDouble = 10.10100;
    }
    
}
