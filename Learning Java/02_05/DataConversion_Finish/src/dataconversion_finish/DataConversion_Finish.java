/*
 * This program demonstrates implicit and explicit data conversion
 */
package dataconversion_finish;

/**
 *
 * @author Peggy Fisher
 */
public class DataConversion_Finish {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // System.out.println((3 + 5 + 8)/3);
       // System.out.println((3 + 5 + 8)/3.0);
        double volume = 4/3 * Math.PI * 10*10*10;
        double real_volume = 4/3.0 * Math.PI * 10*10*10;
        System.out.println("The volume of a sphere with radius 10 is: "+ volume);
        System.out.println("The real volume of a sphere with a radius of 10 is: "+
                real_volume);
        double fahrenheit = 500;
        double celsius = (fahrenheit - 32) * (5/9.0);
        System.out.println("Celsius is: "+ celsius);
    }
    
}
