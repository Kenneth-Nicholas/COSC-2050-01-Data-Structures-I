// CustomerApp.java is main from project 16-1 Customer Viewer - put try and catch in here
package javaapplication;

/**
 *
 * @author Admin
 */
public class JavaApplication {

    public static void main(String[] args) {
        
int number = 1000;

        try{
            Customer c = CustomerDB.getCustomer(number);
            System.out.println(c.getNameAndAddress());
        } catch (NoSuchCustomerException e) {
            System.out.println(e.getMessage());
        }
    }
    
}


