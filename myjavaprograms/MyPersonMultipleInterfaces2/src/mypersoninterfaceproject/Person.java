package mypersoninterfaceproject;

public class Person implements PersonInterface, AnotherInterface, ThirdInterface {
   
    int cashSaving;
    int retirementFund;
    String firstName;
    String lastName;
   
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
        System.out.println(cashSaving + retirementFund);
        return (cashSaving + retirementFund);
    }
   
    // Get person's name
    @Override
    public String getName(){
        return firstName + " " + lastName;
    }
   
    // Implement method of AnotherInterfaceExample
    @Override
    public int measureIntelligence(String name){
        if (name.startsWith("smart")){
            return 100;
        }
        else{
            return 50;
        }
    } 
    
    @Override 
    public int computeFirstNameLength(String name) {
        return this.firstName.length(); 
    }
   
}