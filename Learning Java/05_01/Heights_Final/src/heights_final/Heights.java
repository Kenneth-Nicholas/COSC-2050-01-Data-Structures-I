/*
 * This program asks the user for the heights of each student in class. 
 * Then finds the height of the tallest student, and the average height of all 
 * students.
 */
package heights_final;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 */
public class Heights {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numStudents;
        double [] heights;
        System.out.println("How many students do you have? ");
        numStudents = in.nextInt();
        heights = new double[numStudents];
        for(int i = 0;i<numStudents;i++)
        {
            System.out.println("Enter height: ");
            heights[i] = in.nextDouble();
        }
        double maxHeight = heights[0];
        for(int i = 1; i<heights.length;i++)
        {
            if(maxHeight < heights[i])
                maxHeight = heights[i];
        }
        double total=0;
        for (int i = 0;i<heights.length;i++)
        {
            total += heights[i];            
        }
        System.out.println("The tallest student is: "+ maxHeight + " inches");
        System.out.println("The average height of all students is "+(total/numStudents)
        + " inches");
        
    }
    
}
