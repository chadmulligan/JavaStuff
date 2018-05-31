/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class NewName {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        int argsLength = args.length; 
        
        // Checking number of arguments 
        if(args.length>6) {
            System.out.println("Too many arguments");
            System.exit(0);
                }
        
        if(args.length<3) {
            System.out.println("Too few arguments");
            System.exit(0);
            }
        
        getNewName(args) ; 
        
      }
    
    // Public Method getNewName 
     public static void getNewName(String[] s) { 
        
         int i ;
         int j; 
         String newName = "" ;
         int sLength= s.length; 
         
    // Append character 1 at newName
            for(i=0; i<sLength; i++) {
            newName = newName + s[i].substring(1, 2) ; 
         }
    
    // Print arguments passed in comand line 
        for(j=0; j<sLength; j++) {
            System.out.println(s[j]) ;
            }
        
        System.out.println("New name is " + newName) ; 
        
     } 
     
         
     } 