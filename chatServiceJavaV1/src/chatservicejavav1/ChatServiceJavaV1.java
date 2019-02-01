/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chatservicejavav1;

import java.util.Scanner;
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
        
        Scanner scanner = new Scanner( System.in );
        System.out.println("Anmeldung");
        
        System.out.println("User:");
        String user = scanner.nextLine();
        
        System.out.println("Password:");
        String pw = scanner.nextLine();
                
        DataBaseHelper dsh = new DataBaseHelper("127.0.0.1","5432","chatDB","postgres","");
        
        if(dsh.login(user, pw)){
            dsh.connect();
        }        
    }    
}
