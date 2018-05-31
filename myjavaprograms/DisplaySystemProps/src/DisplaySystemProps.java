/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Properties;

/**
 *
 * @author laz
 */
public class DisplaySystemProps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Properties p1 = System.getProperties();
        p1.list(System.out);
    }
}
