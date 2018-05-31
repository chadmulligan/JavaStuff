/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myhashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 *
 * @author laz
 */
public class Main {
    
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    HashSet hs = new HashSet(7); 
    MyOwnUtilityClass.myMethod(hs);
    
    LinkedHashSet lhs = new LinkedHashSet();
    MyOwnUtilityClass.myMethod(lhs);
    
    ArrayList al = new ArrayList();
    MyOwnUtilityClass.myMethod(al); 
       
  }
}
