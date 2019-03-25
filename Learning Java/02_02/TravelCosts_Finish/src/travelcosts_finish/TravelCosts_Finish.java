/*
 * This program uses total distance of the trip, 
 * the mpg of vehicle, and the current price of
 * gas to calculate the total cost of the trip.
 */
package travelcosts_finish;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 */
public class TravelCosts_Finish {

    public static void main(String[] args) {
//        double distance;
//        double mpg;
//        double pricePerGallon;
//        double totalCost;
          String vehicleType;
        double distance, mpg, pricePerGallon, totalCost;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total distance in miles: ");
        distance = in.nextDouble();
        System.out.println("Enter the mpg for the vehicle: ");
        mpg = in.nextDouble();
        System.out.println("Enter the price of one gallon of gas: ");
        pricePerGallon = in.nextDouble();
        System.out.println("Please enter the vehicle type: ");
        vehicleType = in.next();
        
             
        totalCost = (distance/mpg)*pricePerGallon;
        System.out.printf("The trip is going to cost $%5.2f since you are"
                + " driving a "+vehicleType + " car.",totalCost);
        System.out.println();
    }
    
}
