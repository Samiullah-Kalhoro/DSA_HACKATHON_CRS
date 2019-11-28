/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carreservationsystem;

/**
 *
 * @author 18sw111
 */
public class Carreservationsystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Enter Username & Password");
        Login l = new Login();
        l.varification();
        carlist cl = new carlist();
        cl.cars();
    }
    
}
