package mypersoninterfaceproject;

public interface PersonInterface {
   
   // Compute person's total wealth
   int computeTotalWealth();
  
   // Get person's name
   String getName(); 
   
   // Add another method to the interface, produces a compile error in Person.java
   //as long as newMethod() is not implemented 
   //void newMethod(); 
   
} 