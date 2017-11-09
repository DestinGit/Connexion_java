/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author formation
 */
public class Connect2Single {
 
    private static String str;
    private static Connection lcn;

    /**
     *
     * @param asServeur
     * @param asBD
     * @param asPort
     * @param asUT
     * @param asMdp
     * @return
     */
    public static Connection getConnection(String asServeur, String asBD, String asPort, String asUT, String asMdp) {

        if (lcn == null) {
            try {
                Class.forName("org.gjt.mm.mysql.Driver");
                str = "jdbc:mysql://" + asServeur + ":" + asPort + "/" + asBD;
                lcn = DriverManager.getConnection(str, asUT, asMdp);
                lcn.setAutoCommit(false);
            } catch (ClassNotFoundException | SQLException e) {

            }
        }
        return lcn;
    }

    /**
     *
     * @param pcnx
     */
    public static void seDeconnecter(Connection pcnx) {
        if (lcn != null) {
            try {
                pcnx.close();
                pcnx = null;
            } catch (SQLException e) {
            }
        }

    }

    public static String tostring() {
        String out = str;
        return out;
    }
   
}
