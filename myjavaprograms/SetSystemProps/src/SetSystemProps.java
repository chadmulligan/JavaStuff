/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Map;
/**
 *
 * @author laz
 */
public class SetSystemProps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        FileInputStream propFile = null;
        Properties p = null;
System.gc(); 
        // set up new properties object
        // from file "myProperties.txt"
        try {
            propFile = new FileInputStream(
                    "myProperties.txt");
            p = new Properties(System.getProperties());
            p.load(propFile);
        } catch (IOException e) {
            System.out.println(e);
        }
        
         // set a property through setProperty() method
        p.setProperty("myKey1", "myValue1");

        // set the system properties
        System.setProperties(p);

        // display new properties
        System.getProperties().list(System.out);
        String s2 = p.getProperty("myKey1")  ; 
        System.out.println(s2) ; 
        
        Map m1 = System.getenv();
       System.out.println("System environment variables = " + m1);
    }
}
