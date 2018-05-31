/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class Main_1 {
    
    public static void main(String[] args) {
     
    // Creating 3 instances of Student_1() 
    // and increasing studentCount accordingly 
    Student_1 student1 = new Student_1(1, "chad");
    Student_1 student2 = new Student_1(2, "stan");
    Student_1 student3 = new Student_1(3, "mary");
    
    // Displaying Student_1() instances' name and studentID 
    System.out.println("student1's name: " +student1.getName()+". ID is "+student1.getID());
    System.out.println("student2's name: " +student2.getName()+". ID is "+student2.getID());
    System.out.println("student3's name: " +student3.getName()+". ID is "+student3.getID()); 
    
    // Displaying the studentCount 
    System.out.println("number of students is: "+ Student_1.getStudentCount());
    
    }
}
