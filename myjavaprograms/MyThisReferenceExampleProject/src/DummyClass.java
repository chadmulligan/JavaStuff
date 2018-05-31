/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class DummyClass {
    String hello ="Hello";
    String bye = "Bye";
    
    void myMethod1(){
    String s1 = myMethod2("chadmulligan");
    String s2 = this.myMethod2("chadmulligan"); 
    
    System.out.println("s1 = "+s1+" s2= " +s2); 
    
    // Pass the current object instance as a parameter
        String s3 = this.mymethod3(this, this.hello);
        System.out.println("s3 = " + s3);
        
        s3 = this.mymethod3(this, this.bye);
        System.out.println("s3 = " + s3);
}
    
    String myMethod2(String name){
        return "Hello " +name; 
    } 
    
    String mymethod3(Object o1, String s){
        return s+" "+o1.getClass().getName();
    }
}
