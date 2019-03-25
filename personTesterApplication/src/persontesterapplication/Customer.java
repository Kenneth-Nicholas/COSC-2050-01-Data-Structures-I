package persontesterapplication;

public class Customer extends Person {

    private String customerNumber;
    
    public Customer(){
        customerNumber = "";
    }
    
    public void setCustomerNumber(String customerNumber){
        this.customerNumber = customerNumber;
    }
    
    public String getCustomerNumber(){
        return customerNumber;
    }
    
    @Override
    public String getDisplayText() {
        return super.toString() + "Customer number: " + customerNumber;
    }
    
}
