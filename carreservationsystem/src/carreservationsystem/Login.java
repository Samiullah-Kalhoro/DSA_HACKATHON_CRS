/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreservationsystem;

import java.util.*;


public class Login {
    
    String username="badmas";
    String password="badmas";
    /*System.out.print("sami");*/
            
    
    Scanner sc = new Scanner(System.in);
    String uN = sc.nextLine();
    String pass = sc.nextLine();
    public void varification(){
    if(uN.equals(username) && pass.equals(password)){
    
    System.out.println("Username & Password is Correct");
}
    else{
    System.out.println("Username OR Password is incorrect");
}
}
}