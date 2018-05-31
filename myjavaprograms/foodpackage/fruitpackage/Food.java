package foodpackage.fruitpackage;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author laz
 */
public class Food {
        private int numberOfFruits;
	private String nameOfFruit; 
	private static int numberOfCommands; 
	
	public Food(String nameOfFruit, int numberOfFruits){
		this.numberOfFruits = numberOfFruits; 
		this.nameOfFruit = nameOfFruit;
                numberOfCommands++;
        } 
        
        public static int getNumberOfCommands(){
            return numberOfCommands; 
        } 
        
        public String getName(){
            return nameOfFruit; 
        } 
        
        public int getNumber(){
            return numberOfFruits; 
        }
                
}
