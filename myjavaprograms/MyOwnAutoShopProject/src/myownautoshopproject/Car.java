/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myownautoshopproject;

/**
 *
 * @author laz
 */
public class Car {
    private int speed;
    private double regularPrice;
    private String color;
    
    // Car constructor 
    Car(int speed, double regularPrice, String color){
        this.speed = speed; 
        this.regularPrice = regularPrice; 
        this.color = color; 
    }
    
    public double getSalePrice(){
        return regularPrice*0.8; 
    } 
    
    public double getregularPrice(){
        return regularPrice; 
    }
}
