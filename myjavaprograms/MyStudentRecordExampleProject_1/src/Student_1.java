/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeremy
 */
public class Student_1 { 
    private int studentID; 
    private static int studentCount = 0;  
    private StudentRecord_1 studentRecord ;
    
    public Student_1(int ID, String name){
        this.studentID = ID; 
        studentRecord = new StudentRecord_1(name); 
        studentCount++; 
    }
             
    public String getName(){
        return studentRecord.getName(); 
    }
    
    public int getID(){
        return studentID;
    } 
        
     public static int getStudentCount(){
        return studentCount;
    }
        
}
