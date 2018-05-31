/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypeopleexample;

/**
 *
 * @author laz
 */
public class Student extends Person {
    public Student() {
        // System.out.println("Student: constructor is called");
    } 
    
    public Student(String name, String school, double grade) {
        super(name);
        this.school = school;
        this.grade = grade;
        // System.out.println("Student: constructor 2 is called");
    }
    
    protected String school;
    protected double grade;

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    } 
    
    // A overriding method
    @Override
    public void myMethod(String t){
        System.out.println("myMethod(" + t + ") in Student class");
    }
}
