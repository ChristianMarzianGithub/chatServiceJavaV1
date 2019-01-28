/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatservicejavav1;

import java.sql.*;

/**
 *
 * @author Christian
 */
public class DataBaseHelper {
    
    private String server;
    private String port;    
    private String database;    
    private String usr;
    private String password;

    public DataBaseHelper(String server, String port,String database, String usr, String password) {
        this.server = server;
        this.port = port;
        this.database = database;
        this.usr = usr;
        this.password = password;
    }    
    
    public void connect(){                
        try{            
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection("jdbc:postgresql://" 
                    + this.server 
                    +":"
                    + this.port 
                    + "/"
                    + this.database, this.usr,this.password);
            
            PreparedStatement pst = con.prepareStatement("SELECT * FROM USR");
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
               System.out.println(rs.getInt(1) + ";" + rs.getString(2) + ";" + rs.getString(3));
            }
            
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

    
    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
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
