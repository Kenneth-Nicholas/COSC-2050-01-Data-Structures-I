package persontesterapplication;

public abstract class Person {

    private String firstName;
    private String lastName;
    private String emailAddress;
    
    public Person(){
        firstName = "";
        lastName = "";
        emailAddress = "";
    }
    
    public void setFirstName(String firstName){
        this.firstName = firstName; 
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    
    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public String getEmailAddress(){
        return emailAddress;
    }
    
    @Override
    public String toString(){
        return "Name: " + firstName + " " + lastName 
               + "\n" + "Email: " + emailAddress + "\n";
    }
    
    public abstract String getDisplayText();
}
