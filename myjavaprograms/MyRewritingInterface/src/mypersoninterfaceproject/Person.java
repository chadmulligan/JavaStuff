package mypersoninterfaceproject;

public class Person implements PersonInterface, PersonInterfaceAnother {
   
    int cashSaving;
    int retirementFund;
    String firstName;
    String lastName;
   
    // Constructor with no arguments, so PersonAnother2 can compile 
    Person() {
    }
    
    // Constructor with arguments   
    Person(int cashSaving,
           int retirementFund,
           String firstName,
           String lastName){
        this.cashSaving = cashSaving;
        this.retirementFund = retirementFund;
        this.firstName = firstName; 
        this.lastName = lastName;
    }
   
    // Compute person's total wealth
    @Override
    public int computeTotalWealth(){
        //System.out.println(cashSaving + retirementFund);
        return (cashSaving + retirementFund);
    }
   
    // Get person's name
    @Override
    public String getName(){
        return firstName + " " + lastName;
    }
    
    @Override
    public void newMethod() {
        // some code
    }
   
}