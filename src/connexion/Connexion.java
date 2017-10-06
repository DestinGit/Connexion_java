/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.*;

/**
 *
 * @author formation
 */
public class Connexion {

    /**
     *
     * @param asServer
     * @param asBd
     * @param asPort
     * @param asUt
     * @param asMdp
     * @return
     */
    public static Connection getConnectionMySQL(String asServer, String asBd, String asPort, String asUt, String asMdp) {
        Connection lcn = null;
        try {
            String lsDSN = "jdbc:mysql://" + asServer + ":" + asPort + "/" + asBd;
            lcn = DriverManager.getConnection(lsDSN, asUt, asMdp);
            lcn.setAutoCommit(false);
        } catch (SQLException e) {
            System.out.println("Connection failed : " + e.getMessage());
        }
        return lcn;
    }

    /**
     *
     * @param pcnx
     */
    public static void disconnection(Connection pcnx) {
        try {
            pcnx.close();
        } catch (SQLException e) {
            System.out.println("Close connection failed : " + e.getMessage());
        }
    }

}
