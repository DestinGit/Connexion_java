/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectone;

import java.sql.Connection;

/**
 *
 * @author formation
 */
public class ConnectSingleTest {
    public static void main(String[] args) {
        Connection cn = ConnectSingle.getInstance("jdbc:mysql://127.0.0.1:3306/cours", "root", "");
        System.out.println(cn);
        Connection cn2 = ConnectSingle.getInstance("jdbc:mysql://127.0.0.1:3306/cours", "root", "");
        System.out.println(cn2);
    }    
}
