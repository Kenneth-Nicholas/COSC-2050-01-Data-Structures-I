/*
 * This program demonstrates how to create a method
 * to calculate the average of three numbers and return the
 * result to the calling program
 */
package methods_final;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 */
public class Methods_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x, y, z;
        double avg;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        avg = average(x,y,z);
        System.out.println("The average is: "+avg);
        
    }
    public static double average(double num1, double num2, double num3)
    {
        double avg = (num1 + num2 + num3)/3;
        return avg;
    }
    
}
