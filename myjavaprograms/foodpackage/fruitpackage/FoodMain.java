package foodpackage.fruitpackage;

 

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class FoodMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Food order1 = new Food("peaches", 4);
        
        System.out.println("Order " + Food.getNumberOfCommands() + " consists of " + order1.getNumber()+ " "+ order1.getName()); 
        
    }
}
