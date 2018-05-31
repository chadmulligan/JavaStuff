
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class Main {
  public static void main(String[] args) {
      
    Set s = new HashSet(); // Order is not guaranteed 
      MyOwnUtilityClass.checkDuplicate(s, args);
      
      s = new TreeSet(); // Order according to values
      MyOwnUtilityClass.checkDuplicate(s, args);
      
      s = new LinkedHashSet(); // Order according to insertion
      MyOwnUtilityClass.checkDuplicate(s, args); 
      
  }
}

class MyOwnUtilityClass {
// Note that the first parameter type is set to
// Set interface not a particular implementation
// class such as HashSet. This makes the caller of 
// this method to pass instances of different
// implementations of Set interface while
// this function picks up polymorphic behavior
// depending on the actual implementation type
// of the object instance passed.
    public static void checkDuplicate(Set s, String[] args){ 
      for (int i=0; i<args.length; i++){
          if (!s.add(args[i])){
            System.out.println("Duplicate detected: "+args[i]);
      }
      }
      System.out.println(s.size()+" distinct words detected: "+s); 
  }
} 

