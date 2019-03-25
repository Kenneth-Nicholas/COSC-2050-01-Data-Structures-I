/*
 * This program provides a challenge for reading and writing data to a file.
 */
package filechallenge_final;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 */
public class FileChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File menuItems = new File("menuNoPrices.txt");
        File menuPrices = new File("menuWithPrices.txt");
        String menuItem;
        double price;
        try {
            Scanner input = new Scanner(menuItems);
            PrintWriter output= new PrintWriter(menuPrices);
            Scanner in = new Scanner(System.in);
            while(input.hasNextLine())
            {
                menuItem = input.nextLine();
                System.out.println("What is the price of this item: "+ menuItem);
                price = in.nextDouble();
                in.nextLine();
                output.print(menuItem);
                output.print("\t");
                output.println(price);
            }
            output.close();
            
        } catch (Exception e)
        {
            System.out.println("There was an error: "+ e.toString());
        }
    }
    
}
