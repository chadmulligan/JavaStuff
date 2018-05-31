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
        
        // Create an array of cars
        Car[] cars = new Car[5] ;        
        
        // Create an instance of Sedan
        cars[0] = new Sedan(100, 12500, "blue", 22);
        
        // Create 2 instances of Ford 
        cars[1] = new Ford(95, 11000, "red", 2006, 15);
        cars[2] = new Ford(105, 17000, "black", 2008, 15); 
             
        // Create an instance of the Mondeo class 
        cars[3] = new Mondeo(85, 8000, "green", 2011, 13, 145);
        cars[4] = new Mondeo(115, 18000, "purple", 2010, 12, 150);
                
        
        // Compute total regularprice and total sale price 
        double totalRegularPrice = 0; 
        double totalSalePrice = 0; 
        
        
        for(int i=0; i<cars.length; i++){ 
            
            totalRegularPrice += cars[i].getregularPrice();
            
             // runtime polymorphic behavior 
            totalSalePrice += cars[i].getSalePrice(); 
            
            System.out.println("Car number " + i+ ". Type: " 
                        + cars[i].getClass().getName()+"."
                        + " Regular price is : "+cars[i].getregularPrice()
                        + " Sale price is : " 
                        + cars[i].getSalePrice()); 
        }
        
        System.out.println("totalRegularPrice = " + totalRegularPrice);
        System.out.println("totalSalePrice = " + totalSalePrice);
        
    }
}
