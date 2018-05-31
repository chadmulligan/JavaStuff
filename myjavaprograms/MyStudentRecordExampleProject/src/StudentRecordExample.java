/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class StudentRecordExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        // Create an object instance of StudentRecord class.
        StudentRecord annaRecord =new StudentRecord();
       
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
       
        // Create another object instance of StudentRecord class.
        StudentRecord beahRecord =new StudentRecord();
       
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
       
        // Create the 3rd object instance of StudentRecord class.
        StudentRecord crisRecord =new StudentRecord();
       
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
       
        StudentRecord myOwnRecord = new StudentRecord(); 
        StudentRecord.increaseStudentCount();
        myOwnRecord.setName("chadmulligan");
        myOwnRecord.getName(); 
        myOwnRecord.setMathGrade(18);
        myOwnRecord.setEnglishGrade(19);
         myOwnRecord.setScienceGrade(17);
        System.out.println("average grade : " +myOwnRecord.getAverage()); 
        
        // Set the names of the students.
        annaRecord.setName("Anna");
        beahRecord.setName("Beah");
        crisRecord.setName("Cris");
       
        // Print anna's name.
        System.out.println("Name = " + myOwnRecord.getName());
       
        // Print number of students.
        System.out.println("Student Count = "+StudentRecord.getStudentCount()); 
        
        // Set Anna'a grades 
        annaRecord.setEnglishGrade(95.5);
        annaRecord.setScienceGrade(99); 
        
        // Invoke overloaded methods 
        annaRecord.myPrint(); 
        annaRecord.myPrint(annaRecord.getName()); 
        annaRecord.myPrint(annaRecord.getName(), annaRecord.getAverage(), StudentRecord.getStudentCount()); 
    }
   
}
