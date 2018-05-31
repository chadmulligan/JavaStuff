/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class tThreeVariableTypes {

    static String myStaticVariable = "static variable"; 
    
    String myInstanceVariable = "instance variable";
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String myLocalVariable = "local variable";
        
        System.out.println("myStaticVariable = " + myStaticVariable);
        //System.out.println("myInstanceVariable = " + myInstanceVariable);//
        System.out.println("myLocalVariable = " + myLocalVariable);
    }
}
