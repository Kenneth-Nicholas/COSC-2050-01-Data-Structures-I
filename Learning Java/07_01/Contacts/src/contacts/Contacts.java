/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacts;
import javax.swing.JFrame;
/**
 *
 * @author Peggy Fisher
 */
public class Contacts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       JFrame frame = new ContactUI();
       frame.setTitle("GUI Test");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setVisible(true);
    }
    
}
