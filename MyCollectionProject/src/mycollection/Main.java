/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mycollection;

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
       
    Object[] o1 = {"StringOne", 
                    "StringTwo", 
                    new MyOwnClass("chad", 28),
                    new MyOwnClass("jeremy", 27),
                    new Integer(1), 
                    new Integer(2), 
                    new Integer(3)
                    };
    
    HashSet hs = new HashSet(7); 
    MyOwnUtilityClass.myMethod(hs, o1);
    
    LinkedHashSet lhs = new LinkedHashSet();
    MyOwnUtilityClass.myMethod(lhs, o1);
    
    ArrayList al = new ArrayList();
    MyOwnUtilityClass.myMethod(al, o1); 
       
  }
}
