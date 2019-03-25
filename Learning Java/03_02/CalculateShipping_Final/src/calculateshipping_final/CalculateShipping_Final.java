/*
 * This program uses decision logic to determine shipping costs
 * Shipping rates: 
 * Over $75 free
 * Between $50 and $75 the cost is $5
 * Over $25 but less than $50 is $10
 * Less than $25 is $15
 */
package calculateshipping_final;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 */
public class CalculateShipping_Final {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double totalSale = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter total for the sale: ");
        totalSale = in.nextDouble();
        if(totalSale < 25)
        {
            totalSale = totalSale + 15;
        }
        else if(totalSale < 50)
        {
            totalSale = totalSale + 10;
        }
        else if(totalSale <= 75)
        {
            totalSale = totalSale + 5;
        }
        System.out.println("Total cost for your sale is: "+totalSale);

        
        
    }
    
}
