/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myownautoshopproject;

/**
 *
 * @author laz
 */
public class Truck extends Car {
    private int weight; 
    
    Truck(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight; 
    }
    
    @Override
    public double getSalePrice(){
        if(weight>2000){
            return super.getregularPrice()*0.9; 
        } else {
            return super.getregularPrice()*0.8; 
        }
    }
    
}
