/*
 * This program is setup to create instances of the House class 
 * for a real estate company.  
 */
package realestatelistings_final;

/**
 *
 * @author Peggy Fisher
 */
public class RealEstateListings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Property land = new Property(10000,"Land", 2.1);
      Property estate = new Property(250000, "Estate", 1.5, 3, 4);
      System.out.println(land.toString());
      System.out.println(estate.toString());
      estate.setAskingPrice(230000);
      System.out.println(estate.toString());
    }
    
}
