/*
 * This program is used to demonstrate the concepts of call by value and 
 * call by reference.
 */
package mealplan;
import java.util.Arrays;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 */
public class MealPlan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //call getTotalMealWeeks method, which returns the number of weeks
        int numWeeks = getTotalMealWeeks(); 
        double[] dailyMealCost = new double[7];        
        //print array contents before calling the method, should be all zeros
        System.out.println("Before calling the method: " +
                Arrays.toString(dailyMealCost)); 
        //call getDailyMealCost method - uses call by reference
        getDailyMealCost(dailyMealCost); 
        //print array contents after calling the method
        System.out.println("After calling the method: " + 
                Arrays.toString(dailyMealCost)); 
        //use the number of weeks and daily meal cost array to find the total
        //note, the numweeks is a call by value, but the dailyMealCost is
        //an array, so it is passing the address of the variable to the method
        double totalCost = computeMealPlanCost(numWeeks, dailyMealCost);
        //use a method to print the total cost.
        printTotalMealPlanCost(totalCost);
    }
    public static int getTotalMealWeeks()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("How many weeks are in your semester? ");
        int totalWeeks = in.nextInt();
        return totalWeeks;
    }
    public static void getDailyMealCost(double[] dailyCost)
    {
        Scanner in = new Scanner(System.in);
        //note the use of the arrays length, this allows it to vary depending 
        //on the value passed in the parameter list.  
        for(int i = 0;i < dailyCost.length; i++)
        {
            System.out.println("Enter the estimated cost for day "+ (i+1));
            dailyCost[i] = in.nextDouble();
        }
    }
    public static double computeMealPlanCost(int numWeeks, double[] dailyCost)
    {
        double totalCost = 0, weeklyCost = 0;
        for(int i = 0; i < dailyCost.length; i++)
        {
            weeklyCost += dailyCost[i];
        }
        totalCost = weeklyCost * numWeeks;
        return totalCost;
    }
    public static void printTotalMealPlanCost(double total)
    {
        System.out.printf("Your estimated total meal plan cost for the "
                + "semester is: $%5.2f", total);
        System.out.println();
    }
    
}
