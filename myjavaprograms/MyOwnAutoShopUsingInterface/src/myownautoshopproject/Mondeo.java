/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myownautoshopproject;

/**
 *
 * @author laz
 */
public class Mondeo extends Ford{
    
    // Number of horsepowers of the Mondeo car object
    int horsePower; 
    
    Mondeo(int speed, double regularPrice, String color, int year, int manufacturerDiscount, int horsePower){
        super(speed, regularPrice, color, year, manufacturerDiscount); 
        this.horsePower = horsePower; 
    }
    
    @Override
    public double getSalePrice(){
        return super.getregularPrice()*0.6;
    }
    
}
