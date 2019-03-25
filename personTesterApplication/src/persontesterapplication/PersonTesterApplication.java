package persontesterapplication;

import java.util.Scanner;

public class PersonTesterApplication {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to the Person Tester application \n");
        
        Scanner sc = new Scanner(System.in);
        
        String choice = "y";
        
        while(choice.equalsIgnoreCase("y")){
            System.out.print("Create customer or employee? (c/e): ");
            
            String customerOrEmployee = sc.nextLine();
            
            System.out.println("");
            
            if (customerOrEmployee.equalsIgnoreCase("c")){
                
                Customer c = new Customer();
                
                System.out.print("Enter first name: ");
                String firstName = sc.nextLine();
                
                c.setFirstName(firstName);
                
                System.out.print("Enter last name: ");
                String lastName = sc.nextLine();
                
                c.setLastName(lastName);
                
                System.out.print("Enter email address: ");
                String emailAddress = sc.nextLine();
                
                c.setEmailAddress(emailAddress);
                
                System.out.print("Enter customer number: ");
                String customerNumber = sc.nextLine();
                
                System.out.println("");
                
                c.setCustomerNumber(customerNumber);
                
                System.out.println("You entered:");
                
                System.out.println(c.getDisplayText());
                System.out.println();
                
                System.out.print("Continue? (y/n): ");
            
                choice = sc.nextLine();
                
                System.out.println("");
            }
            else if(customerOrEmployee.equalsIgnoreCase("e")){
                
                Employee e = new Employee();
                
                System.out.print("Enter first name: ");
                String firstName = sc.nextLine();
                
                e.setFirstName(firstName);
                
                System.out.print("Enter last name: ");
                String lastName = sc.nextLine();
                
                e.setLastName(lastName);
                
                System.out.print("Enter email address: ");
                String emailAddress = sc.nextLine();
                
                e.setEmailAddress(emailAddress);
                
                System.out.print("Enter phone number: ");
                String phoneNumber = sc.nextLine();
                
                System.out.println("");
                
                e.setPhoneNumber(phoneNumber);
                
                System.out.println("You entered:");
                
                System.out.println(e.getDisplayText());
                System.out.println();
                
                System.out.print("Continue? (y/n): ");
            
                choice = sc.nextLine();
                
                System.out.println();
            }

        }
    
    }
    
}
