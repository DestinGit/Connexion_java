/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectone;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author formation
 */
public class ConnectSingle {

    private static ConnectSingle cnx;
    private static Connection cn;

    /**
     *
     */
    private ConnectSingle(String url, String user, String pwd) {
        System.out.println("First");
        try {
            cn = DriverManager.getConnection(url, user, pwd);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     *
     * @param url
     * @param user
     * @param pwd
     * @return
     */
    public static Connection getInstance(String url, String user, String pwd) {
        if (cnx == null) {
            cnx = new ConnectSingle(url, user, pwd);
        } else {
            System.out.println("After First");
        }
        return cn;
    }    
}
