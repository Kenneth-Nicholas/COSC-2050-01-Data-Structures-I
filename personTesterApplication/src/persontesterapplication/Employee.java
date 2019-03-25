package persontesterapplication;

public class Employee extends Person{

    private String phoneNumber;
    
    public Employee(){
        phoneNumber = "";
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    @Override
    public String getDisplayText() {
        return super.toString() + "Phone number: " + phoneNumber;
    }
     
}
