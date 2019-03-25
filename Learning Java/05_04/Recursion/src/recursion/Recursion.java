/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author Peggy Fisher
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        countdown(10);
    }
    public static void countdown(int num)
    {
        if(num == 0)
           System.out.println("Blast Off!");
        else
        {
            System.out.println(num);
            countdown(num-1);            
        }
       
    }
    
}
