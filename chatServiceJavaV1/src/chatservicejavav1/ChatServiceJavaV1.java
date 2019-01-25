/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatservicejavav1;

/**
 *
 * @author Christian
 */
public class ChatServiceJavaV1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        DataBaseHelper dsh = new DataBaseHelper("","","","");
        
        dsh.connect();
        
        
    }
    
}
