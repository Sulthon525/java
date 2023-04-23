/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;
import java.text.DecimalFormat;
/**
 *
 * @author user
 */
public class TugasPBO {

    DecimalFormat df = new DecimalFormat("#.##");
    private int tinggi, jarijari;
    private double volume, luasPermukaan;
    public void setTinggi(int t)
    {
        tinggi = t;
    }
    public void setJariJari(int r)
    {
        jarijari = r;
    }
    public void setVolume()
    {
        volume =  Math.PI * Math.pow(jarijari, 2) * tinggi;
    }
    public void setLuasPermukaan()
    {
        luasPermukaan = 2 * Math.PI * jarijari * (jarijari + tinggi);
    }
    public int getJariJari()
    {
        return jarijari;
    }
    public int getTinggi()
    {
        return tinggi;
    }
    public double getVolume()
    {
        return volume;
    }
    public double getLuasPermukaan()
    {
        return luasPermukaan;
    }
}
