/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import javax.swing.JOptionPane;
/**
 *
 * @author laz
 */
public class inputfromkeyboardjoptionpane {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String name;
        String age; 
        String result; 
        name=JOptionPane.showInputDialog("Please enter your name");
        age=JOptionPane.showInputDialog("Please enter your age");
        int ageint=Integer.parseInt(age); 
        result = (ageint<100)?"You are young!":"Your are old!"; 
        String msg = "Hello " + name + "! ";
        JOptionPane.showMessageDialog(null, msg + result);
    }
    }
