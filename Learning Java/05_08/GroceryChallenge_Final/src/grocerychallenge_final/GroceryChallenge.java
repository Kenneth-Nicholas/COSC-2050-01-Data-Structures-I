/*
 * This is the solution to the challenge on beyond basics. 
 * This program creates a string arraylist and then adds 5 grocery items to 
 * the list.  Then, it prompts the user to enter another item, it searches the 
 * list, if it is not found, it adds it to the list, otherwise it displays
 * a message that the item is already in the list.
 */
package grocerychallenge_final;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 */
public class GroceryChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> groceries = new ArrayList<String>();
        groceries.add("Bananas");
        groceries.add("Wheat Bread");
        groceries.add("1% milk");
        groceries.add("Crackers");
        groceries.add("Oatmeal");
        System.out.println("Here is the current list: \n" + 
                groceries.toString());
        System.out.println("Enter another item or \"quit\" to exit");
        String newItem = in.nextLine();
        boolean found = false;
        while (newItem.equalsIgnoreCase("quit")==false)
        {
            for(int i = 0; i<groceries.size();i++)
            {
                if(newItem.equalsIgnoreCase(groceries.get(i)))
                {
                    System.out.println("This item is already in the list.");
                    found = true;
                }
            }
            if(found == false)
            {
                groceries.add(newItem);
            }
            System.out.println("Enter another item or \"quit\" to exit");
            newItem = in.nextLine();
            found=false;
        }
         System.out.println("\nHere is the final list: \n" + 
                groceries.toString());
    }
    
}
