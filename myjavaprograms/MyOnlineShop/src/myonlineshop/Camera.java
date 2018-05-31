/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myonlineshop;

/**
 *
 * @author laz
 */
public class Camera extends Electronics {
    
    public Camera(double regularPrice,
              String manufacturer){
        super(regularPrice, manufacturer); 
    } 
    
    @Override
    public double computeSalePrice() {
        return super.getRegularPrice()*0.7; 
    }
}
