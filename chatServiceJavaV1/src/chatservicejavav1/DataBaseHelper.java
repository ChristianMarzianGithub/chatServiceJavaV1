/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatservicejavav1;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Christian
 */
public class DataBaseHelper {
    
    private String server;
    private String database;    
    private String usr;
    private String password;

    public DataBaseHelper(String server, String database, String usr, String password) {
        this.server = server;
        this.database = database;
        this.usr = usr;
        this.password = password;
    }
    
    public void connect(){        
        String url = "jdbc:sqlserver://MYPC\\SQLEXPRESS;databaseName=" + database;
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection conn = DriverManager.getConnection(url, usr, password);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public String getServer() {
        return server;
    }

    public void setServer(String server) {
        this.server = server;
    }

    public String getDatabase() {
        return database;
    }

    public void setDatabase(String database) {
        this.database = database;
    }

    public String getUsr() {
        return usr;
    }

    public void setUsr(String usr) {
        this.usr = usr;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
   
}
