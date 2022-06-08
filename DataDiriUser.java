/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datadiriuser;

/**
 *
 * @author Hennita Gultom
 */
import javax.swing.JOptionPane;
public class DataDiriUser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
String username = "";
String password = "";

username = JOptionPane.showInputDialog("Please enter your username! !");
password = JOptionPane.showInputDialog("Please enter your password! !");

String msg = ("You'r Data USER" + "\nUSER      : " + username + "\nPASS        : ");
JOptionPane.showMessageDialog(null, msg);
}
}
