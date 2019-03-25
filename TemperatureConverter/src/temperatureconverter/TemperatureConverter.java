// Kenneth Nicholas
// COSC 2050 01
// Professor Sun
// Assignment 1
// Due: 1/23/2018

package temperatureconverter;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.InputMismatchException;

public class TemperatureConverter
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
            
        String choiceYOrN = "y";
        
        float degrees = 0,
              conversion = 0;
        
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMaximumFractionDigits(2);
        
        System.out.println("Welcome to the Temperature Converter");
        System.out.println();
        
        while (choiceYOrN.equalsIgnoreCase("y"))
        {
       
        try
        {
            System.out.print("Enter degrees in Fahrenheit: ");
            degrees = sc.nextFloat();
        }
        catch (InputMismatchException e)
        {
            System.out.println("Error! Invalid number. Try again.\n");
            sc.nextLine();
            continue;
        }
        
        conversion = ((degrees - 32f) * (5f / 9f));
        
        String result = number.format(conversion);
        
        System.out.print("Degrees in Celsius: " + result);
        System.out.println();
        System.out.println();
            

        System.out.print("Continue? (y/n): ");
        choiceYOrN = sc.next();
        
        System.out.println();
        }
    }   
}
