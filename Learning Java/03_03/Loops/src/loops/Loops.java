/*
 * This program demonstrates the three types of loops
 */
package loops;

/**
 *
 * @author Peggy Fisher
 */
public class Loops {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //do while
        System.out.println("Results of do/while loop: ");
        int count = 0; 
        do {
            System.out.println("Hello World");
            count++;
        } while (count < 3);
        
        //while loop
        System.out.println("Results of while loop: ");
        count = 0;
        while(count < 3) {
            System.out.println("Hello World");
            count++;
        }
        
        //for loop
        System.out.println("Results of for loop: ");
        for(int i = 0; i < 3; i++)
        {
            System.out.println("Hello World");
            count++;
        }
    }
    
}
