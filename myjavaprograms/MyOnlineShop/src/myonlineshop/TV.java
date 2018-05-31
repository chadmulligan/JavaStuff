/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myonlineshop;

/**
 *
 * @author laz
 */
public class TV extends Electronics {
    int size;
   
    /** Creates a new instance of TV */
    public TV(double regularPrice,
              String manufacturer,
              int size) {
        super(regularPrice, manufacturer);
        this.size = size;
    }
   
    // Override this method
    @Override
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.8;
    } 
    
    @Override
    public double computeSpecialCustomerPrice(){
        return computeSalePrice()-100; 
    }
}
