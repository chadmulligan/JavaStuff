/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class CommandLineArguments {

     public static boolean isNumeric(String s) {
            try { 
                Integer.parseInt(s); 
            } catch(NumberFormatException e) { 
                return false; } 
             return true; 
        }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here      
        int agessum=0; 
        int numberofint=0; 
        
        if(args.length < 6){
            System.out.println("Please enter more than 3 people and ages!");
            System.exit(0);
        } 
        
        if (args.length > 12){
            System.out.println("Please enter less than 6 people and ages!");
            System.exit(0);
        }
        
        for (int i=0; i<args.length; i++) {
            if (isNumeric(args[i])) {
            agessum=agessum+Integer.parseInt(args[i]);
            numberofint++;
            } else { 
                }        
            }    
        
        // Display the average age
    System.out.println("Average age is " + agessum/numberofint);    
    }                
           }