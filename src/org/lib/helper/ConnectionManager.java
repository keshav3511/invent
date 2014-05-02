/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.lib.helper;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Neha
 */
public class ConnectionManager {
    
    static Connection c=null;
     static Boolean status=false;
    public static Connection getConnection()
    {
    try
    {
    Class.forName("com.mysql.jdbc.Driver");
c= DriverManager.getConnection("jdbc:mysql://localhost:3306/invent","root","root");
    }catch(Exception e)
     {
                System.out.println(e);
            }
return c;    
    }
}
