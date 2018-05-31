/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myownautoshopproject;

/**
 *
 * @author laz
 */
public class Sedan extends Car {
    
    private int length; 
    
    Sedan(int speed, double regularPrice, String color, int length){
        super(speed, regularPrice, color); 
        this.length = length; 
    } 
    
    @Override
    public double getSalePrice(){
        if(length>20){
            return super.getregularPrice()*0.95;
        } else {
            return super.getregularPrice()*0.9; 
        }
    }
}
