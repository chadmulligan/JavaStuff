/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypeopleexample;

/**
 *
 * @author laz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("---- Observe overriding method behavior ----");

        Person person1 = new Person();
        person1.myMethod("test1"); 
       
        Student student1 = new Student();
        student1.myMethod("test2");
       
        InternationalStudent internationalStudent1 =
                new InternationalStudent();
        internationalStudent1.myMethod("test3");  
        
        // Polymorphic behavior
        System.out.println("---- Observe polymorphic behavior ----");
       
        Person person2 = new Teacher(); 
        person2 = new Teacher();                        // Example 2
        person2.myMethod("test4"); 
        // Do the casting only when the type is verified
        if (person2 instanceof Student) {
            Student student2 = (Student) person2;
            System.out.println("person2 instanceof Student = " + true);
        } else{
            System.out.println("person2 instanceof Student = " + false);
        } 
       
        Person person3 = new InternationalStudent(); 
        person3 =  internationalStudent1;                       // Example 4
        person3.myMethod("test5");
       
        Student student2 = new InternationalStudent(); 
        student2 = internationalStudent1;                        // Example 6
        student2.myMethod("test6");
       
    }
}
