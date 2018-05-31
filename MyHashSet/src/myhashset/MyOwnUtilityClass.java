/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myhashset;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author laz
 */ 

class MyOwnUtilityClass {

  // Defining the array of Objects that will be copied to HashSet, LinkedHashSet and ArrayList 
  // I had to make it static..  could not find another way, as myMethod() must be static. 
  static Object[] o1 = {"StringOne", 
                        "StringTwo", 
                        new MyOwnClass("chad", 28),
                        new MyOwnClass("jeremy", 27),
                        new Integer(1), 
                        new Integer(2), 
                        new Integer(3)
                        };
 
  
  // Using polymorphic behavior of iterator() (??)
  static void myMethod(Collection c){
    
  // Copying the Object[] to the Collection     
    c.addAll(Arrays.asList(o1));
   
    /*
    MyOwnClass moc1 = (MyOwnClass)o1[3];
    System.out.println(moc1.name);
    */
    
    System.out.println(c.getClass().getName() + " iteration : \r"); 
    
    // Iterating through the Collection 
    Iterator itr = c.iterator();    
    while(itr.hasNext()){
      System.out.print(itr.next() + " ");
      
    }
    
    System.out.println("\n");
   
  }
  
}
