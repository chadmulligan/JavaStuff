/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myownautoshopproject;

/**
 *
 * @author laz
 */
public class Car implements CarInterface {
    private int speed;
    private double regularPrice;
    private String color;
    
    // Car constructor 
    Car(int speed, double regularPrice, String color){
        this.speed = speed; 
        this.regularPrice = regularPrice; 
        this.color = color; 
    }
    
    @Override
    public double getSalePrice(){
        return 0; 
    } 
    
    @Override
    public double getregularPrice(){
        return regularPrice; 
    }
        
    @Override
    public void setRegularPrice(double regularPrice){
        this.regularPrice = regularPrice; 
    }
}

