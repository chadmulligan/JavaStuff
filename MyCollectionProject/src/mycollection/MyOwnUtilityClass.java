/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mycollection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author laz
 */ 

class MyOwnUtilityClass {

   
  // myMethod() copies an Object[] to a Collection and iterates through it 
  static void myMethod(Collection c, Object[] o){
    
    // Copying the Object[] to the Collection     
    c.addAll(Arrays.asList(o));
   
    
    System.out.println(c.getClass().getName() + " iteration : \r"); 
    
    // Iterating through the Collection 
    // Using polymorphic behavior of iterator()
    Iterator itr = c.iterator();    
    while(itr.hasNext()){
      System.out.print(itr.next() + " ");
      
    }
    
    System.out.println("\n");
   
  }
  
}
