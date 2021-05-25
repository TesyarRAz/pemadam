/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemadam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author raz
 */
public class Koneksi {
    private static Connection koneksi;
    
    public static Connection getKoneksi() throws SQLException {
        // mengecek sudah ada koneksi apa belum
        if (koneksi == null) {
            // Meregistrasikan driver mysql
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            // Menginisialisasi koneksi dari database
            koneksi = DriverManager.getConnection("jdbc:mysql://localhost:3306/pemadam", "root", "");
        }
        
        return koneksi;
    }
}
