/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class GetClassMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        String str1 = "Life is worth living... with Passion!"; 
          Class str1Class = str1.getClass();
        System.out.println("Class of str1 object instance is " + str1Class);
         
           // the String name of the Class object instance.
        String str1ClassName = str1Class.getName();
        System.out.println("Class of str1 object instance is " + str1Class);
        // Create Integer object instance
        Integer int1 = new Integer(34);
        
        // Find out the class information of Integer object instance
        // via getClass() method.  Note that it returns Class object instance.
        Class int1Class = int1.getClass();
        System.out.println("Class of int1 object instance is " + int1Class); 
        
              // the String name of the Class object instance.
        String int1ClassName = int1Class.getName();
        System.out.println("Class of int1 object instance is " + int1Class); 
        
        boolean ex1 = "Texas" instanceof String; // true
        System.out.println(ex1);  
        
        
        // Create String object instance
        String str3 = "Life is worth living... with Passion!";
        Integer int3 = new Integer(40); 
        
        boolean b1 = str1 instanceof String;
        System.out.println("str3 is String type: " + b1);
        boolean b2 = str1 instanceof Object;
        System.out.println("str3 is Object type: " + b2); 
        
         b1 = int3 instanceof Integer;
        System.out.println("int1 is Integer type: " + b1);
        b2 = int3 instanceof Object;
        System.out.println("int1 is Object type: " + b2);
        b2 = int3 instanceof Number;
        System.out.println("int1 is Number type: " + b2);
        
    }
}
