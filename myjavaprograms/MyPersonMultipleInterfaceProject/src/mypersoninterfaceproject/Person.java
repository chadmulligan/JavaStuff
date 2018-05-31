package mypersoninterfaceproject;

public class Person implements PersonInterface, MyOwnInterface {
   
    int cashSaving;
    int retirementFund;
    String firstName;
    String lastName;
    int streetNumber;
    String streetName;
    String country;

   
    // Constructor with arguments
    Person(int cashSaving,
           int retirementFund,
           String firstName,
           String lastName, 
           int streetNumber,
           String streetName,
           String country){
        this.cashSaving = cashSaving;
        this.retirementFund = retirementFund;
        this.firstName = firstName; 
        this.lastName = lastName;
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.country = country;
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
    
    
    // Implement getAddress : return type MUST BE AddressIinterface type 
    //(or else AddressImpl type)
    // as stated in MyOwnInterface: AddressInterface getAddress() 
    @Override
    public AddressInterface getAddress(){
        AddressImpl address = new AddressImpl(streetNumber, streetName, country); 
        return address; 
    }
   
} 