package tabung;

import java.lang.Math;
import java.text.DecimalFormat;
class tabung
{
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
 
class tabungTestDrive
{
    public static void main(String[] tabung)
    {
        tabung T = new tabung();
        System.out.println("Bangun Tabung");
        T.setJariJari(7);
    T.setTinggi(5);
        T.setVolume();
        T.setLuasPermukaan();
        System.out.println("Jarijari tabung = "+ T.getJariJari());
        System.out.println("Tinggi tabung = "+ T.getTinggi());
        System.out.println("Volume tabung = "+ T.df.format(T.getVolume()));
        System.out.println("Luas permukaan tabung = "+ T.df.format(T.getLuasPermukaan()));
    }
}