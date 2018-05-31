/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sethashsetadd;
import java.util.HashSet; 
/**
 *
 * @author laz
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    HashSet hs = new HashSet(5, 0.5f);
    System.out.println(hs.add("one"));
    System.out.println(hs.add("two"));
    System.out.println(hs.add("three"));
    System.out.println(hs.add("four"));
    System.out.println(hs.add("five"));
    
    // Print out the HashSet object - random order
    System.out.println(hs);
      
    // Add a duplicate item to the HashSet
    Boolean b = hs.add("one");   // Should return false since it is a duplicate
    System.out.println("Duplicate item allowed = " + b);
    System.out.println(hs);   
    
  }
}
