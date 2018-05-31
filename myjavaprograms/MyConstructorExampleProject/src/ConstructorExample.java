/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class ConstructorExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an object instance of StudentRecord class.
        StudentRecord annaRecord = new StudentRecord("Anna", "Belgium", 65);
       
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
       
        // Create another object instance of StudentRecord class.
        StudentRecord beahRecord =new StudentRecord("Beah", 45);
       
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
       
        // Create the 3rd object instance of StudentRecord class.
        StudentRecord crisRecord =new StudentRecord("Cris", 23.3, 67.45, 56);
       
        // Increament the studentCount by invoking a static method.
        StudentRecord.increaseStudentCount();
       
        // Print Cris' name and average
        System.out.println("Name = " + crisRecord.getName() + " Average = " + crisRecord.getAverage());
       
        // Print number of students.
        annaRecord.getAverage2();
    }
}
