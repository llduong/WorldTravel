/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duong.db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hp
 */
public class MyConnection implements Serializable {

    public static Connection getMyConnection() throws Exception {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost\\LLEDUONG:1433; "
                    + "databaseName = Presentation; "
                    + "user = sa; password= lamleduong");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
