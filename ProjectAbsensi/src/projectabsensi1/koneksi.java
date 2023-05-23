/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projectabsensi1;

/**
 *
 * @author minya
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class koneksi {
    public static void main(String[] args) {
        System.out.println("Masuk Ke Server...........");
        koneksi p = new koneksi();
        Connection conn = p.getConnection();
        
        try{
            conn.close();
        }
        catch (SQLException ex){
            System.out.println(ex.getMessage());
    }
    }
    static java.sql.Connection getConnection() {
            Connection conn = null;
            String user = "root";
                String pass = "";
            try{
                Class.forName("com.mysql.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost/laporan_absensi", user, pass);
                System.out.println("Koneksi Berhasil");
            }catch (Exception e) {
                System.out.println("Koneksi Gagal");
            }
        
        return conn;
    }
}

    

