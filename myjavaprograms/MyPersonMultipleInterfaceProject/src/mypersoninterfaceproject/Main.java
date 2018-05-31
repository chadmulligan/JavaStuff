package mypersoninterfaceproject;

public class Main {
   
    public static void main(String[] args) {
       
        // Create an object instance of Person class.
        Person person1 = new Person(100000, 250000, "chad", "mulligan", 
                                                    755, "chemin des Vérans", 
                                                    "France");
       
        
       // Display adress through the AddressImpl object that getAddress() returns 
        System.out.println(person1.getName()+"'s address is " + person1.getAddress().getStreetNumber() 
                                                   + " " + person1.getAddress().getStreetName()
                                                    + " " + person1.getAddress().getCountry()); 
    }
   
}
