/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Properties;

/**
 *
 * @author laz
 */
public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Properties myProperties = new Properties();
      
         // set properties through setProperty() method
        myProperties.setProperty("mykey20", "myvalue20");
        myProperties.setProperty("mykey30", "myvalue30");
        myProperties.setProperty("mykey40", "myvalue40");
        
        // set the system properties
        myProperties.list(System.out) ;
         
        
    }
}
