/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import com.mysql.jdbc.Connection;
import java.sql.*;

/**
 *
 * @author Emmanuel
 */
public class Conexion {
    //Valores de conexion a MySql
    private static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static String JDBC_URL = "jdbc:mysql://localhost/escuela?serverTimezone=UTC&useSSL=false";
    private static String JDBC_USER = "root";
    private static String JDBC_PASS = "";
    private static Driver driver = null;

    //Usamos synchronized para evitar problemas de conexión concurrente
    public static synchronized Connection getConnection() throws SQLException {
            if (driver == null) {
                try {
                    Class jdbcDriverClass = Class.forName(JDBC_DRIVER);
                    driver = (Driver) jdbcDriverClass.newInstance();
                    DriverManager.registerDriver(driver);
                 } catch (Exception e) {
                    System.out.println("Error al cargar driver JDBC");
                    e.printStackTrace();
                 }
            }
        return (Connection) DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }
    
    //Cerrar resultSet
    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    //Cerrar PrepareStatement
    public static void close(PreparedStatement stmt) {
        try {
            if (stmt != null) {
                stmt.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }

    //Cerrar conexion
    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}

