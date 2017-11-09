/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author formation
 */
public class Connect2DB {
    private static Connect2DB instance;
    
    private Connect2DB(String asServer, String asBd, String asPort, String asUt, String asMdp) {
         Connection lcn = null;
        try {
            Class.forName("org.gjt.mm.mysql.Driver");
            String lsDSN = "jdbc:mysql://" + asServer + ":" + asPort + "/" + asBd;
            lcn = DriverManager.getConnection(lsDSN, asUt, asMdp);
            lcn.setAutoCommit(false);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Connection failed : " + e.getMessage());
        }
//        return lcn;
//       
    }
    public static Connect2DB getInstance(String asServer, String asBd, String asPort, String asUt, String asMdp) {
        if(instance == null) {
            
        }
        
        return instance;
    }
    
}
