/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myonlineshop;

/**
 *
 * @author laz
 */
public class Product { 
    
    private double regularPrice;
   
    /** Creates a new instance of Product */
    public Product(double regularPrice) {
        this.regularPrice = regularPrice;
    }
   
    // Method that will be overridden
    public double computeSalePrice(){
        return 0;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    } 
    
    public double computeSpecialCustomerPrice(){
        return 0; 
    }
}
