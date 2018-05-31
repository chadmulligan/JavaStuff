/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myownautoshopproject;

/**
 *
 * @author laz
 */
public class Ford extends Car {
    private int year;
    private int manufacturerDiscount;
    
    Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount){
        super(speed, regularPrice, color);
        this.year = year; 
        this.manufacturerDiscount = manufacturerDiscount; 
    } 
    
    @Override
    public double getSalePrice(){
        return super.getSalePrice()-super.getregularPrice()*0.1;
    }
}
