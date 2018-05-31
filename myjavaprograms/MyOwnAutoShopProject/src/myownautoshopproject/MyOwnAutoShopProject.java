/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myownautoshopproject;

/**
 *
 * @author laz
 */
public class MyOwnAutoShopProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Create an instance of Sedan
        Car sedan1 = new Sedan(100, 12500, "blue", 22);
        
        // Create 2 instances of Ford 
        Car ford1 = new Ford(95, 11000, "red", 2006, 15);
        Car ford2 = new Ford(105, 17000, "black", 2008, 15); 
        
        // Create an instance of the Car class 
        Car car1 = new Car(85, 8000, "green"); 
        
        Car[] cars = {sedan1, ford1, ford2, car1} ; 
        
        for(int i=0; i<cars.length; i++){
            System.out.println("Car number " + i+ ". Type: " 
                        + cars[i].getClass().getName()+"."
                        + " Regular price is : "+cars[i].getregularPrice()
                        + " Sale price is : " 
                        + cars[i].getSalePrice());
        }
    }
}
