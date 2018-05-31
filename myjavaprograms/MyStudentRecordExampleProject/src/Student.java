/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class Student { 
    private int studentID; 
    private static int studentCount = 0;
    
    StudentRecord studentRecord = new StudentRecord(); 
    
    // Constructor that takes a parameter int 
    public Student(int studentID){
        this.studentID = studentID;
    }
}
