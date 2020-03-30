/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package absensi;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author didan
 */
public class Koneksi {
    Connection connection;
    private final String DB_NAME = "absensi"; // ganti dengan nama Database
    private final String DB_URL = "jdbc:mysql://localhost/"+DB_NAME+"?useTimezone=true&serverTimezone=UTC";
    private final String DB_USER = "adminer"; //ganti dengan username MYSQL
    private final String DB_PASSWORD = "adminer"; //ganti dengan password MYSQL
    public Connection getConnection() {
        try {
            //Membuat Koneksi dengan config DB diatas
            connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
