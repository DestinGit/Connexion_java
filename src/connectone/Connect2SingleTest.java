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
public class Connect2SingleTest {
    public static void main(String[] args) {
               Connection cn = Connect2Single.getConnection("127.0.0.1","cours","3306","root","");
    
        System.out.println(Connect2Single.tostring());  
//        Connexion.seDeconnecter(cn);
//         System.out.println(cn);  
         
           Connection connec = Connect2Single.getConnection("mysql-getim.alwaysdata.net","getim_cours","3306","getim","TGentil1!");
    
        System.out.println(Connect2Single.tostring());  
//        Connexion.seDeconnecter(connec);
//         System.out.println(cn);  
    
    }
    
}
