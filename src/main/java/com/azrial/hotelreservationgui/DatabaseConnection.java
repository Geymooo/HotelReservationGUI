/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.azrial.hotelreservationgui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Azrial
 */
public class DatabaseConnection {
    private static Connection conn;

    public static Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/hotel";
        String user = "root";
        String password = "";

        if (conn == null || conn.isClosed()) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Koneksi Berhasil");
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
                throw new SQLException("Koneksi Gagal", ex);
            }
        }
        return conn; 
    }
}
