/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package realestatelistings_final;

/**
 *
 * @author Peggy Fisher
 */
public class Property {
    private double askingPrice;
    private String propertyType;
    private double lotSize;
    private int numBaths;
    private int numBeds;
    public Property(double askingPrice, String propertyType, double lotSize)
    {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        numBaths = 0;
        numBeds = 0;
    }
    public Property(double askingPrice, String propertyType, double lotSize, 
            int numBaths, int numBeds)
    {
        this.askingPrice = askingPrice;
        this.propertyType = propertyType;
        this.lotSize = lotSize;
        this.numBaths = numBaths;
        this.numBeds = numBeds;
    }
    public String toString()
    {
        return "Asking price: $" + askingPrice + 
                "\nProperty Type: " + propertyType + 
                "\nLot Size: " + lotSize + 
                "\nNumber of baths: " + numBaths + 
                "\nNumber of bedrooms: "+numBeds;
    }
    
}
