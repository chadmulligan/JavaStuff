import javax.swing.JOptionPane;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class JavaArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] fullNames = new String[3];
        String[][] firstNames = new String[3][2];
        int counter=3; 
        int i; 
        int j; 
        int maxlength=0; 
        int maxposition=0; 
        
        /**
     * building the array of FULL names
     */
        for(i=0; i<counter; i++){
        fullNames[i]=JOptionPane.showInputDialog("Enter family member number " + (i+1) + " full name." );
        } 
        
         /**
     * building the array of FIRST names splitting names in 2-dimension array through enshrined loops
     */
        for(i=0; i<counter; i++){
        String[] tempNames=fullNames[i].split(" ");
        
             for(j=0; j<2; j++){
                firstNames[i][j]=tempNames[j];
            }
                /**
     * finding longest first name  
     */
        if (firstNames[i][0].length()>maxlength){
            maxlength=firstNames[i][0].length();
            maxposition=i; 
            }
        }
        
     System.out.println(fullNames[maxposition] +" has the longest first name");
        
        
    }
}
