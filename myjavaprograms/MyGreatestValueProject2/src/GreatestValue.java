/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class GreatestValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 23;
        int num3 = 82;
        int min ; 
        String greater = "greater or equal to 10!" ; 
        String smaller = "smaller than 10" ;
        String result ; 
        
        
        //determines the smallest number
        min = (num1<num2)?num1:num2;
        min = (min<num3)?min:num3;
        result= (min<10)?smaller:greater; 
        
        //prints the output on the screen
        System.out.println("number 1 = "+num1);
        System.out.println("number 2 = "+num2);
        System.out.println("number 3 = "+num3);
        System.out.println("The smallest number is = "+min);
        System.out.println("The smallest number is " +result);
    }
}
