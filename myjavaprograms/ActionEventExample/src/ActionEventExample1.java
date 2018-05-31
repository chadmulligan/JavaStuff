import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;



public class ActionEventExample1 {
   
    public static void main(String[] args) {
       
        JFrame frame = new JFrame( "Button Handler" );
        JTextArea area = new JTextArea( "Fire Event ", 2, 20 );
        JTextArea area1 = new JTextArea("Get Date "); 
        //JTextArea area2 = new JTextArea( "area 2");
        JButton button = new JButton( "Fire Event" );
        JButton mybutton = new JButton("Get Date"); 
       
        // Register an ActionListener object to the event source
        button.addActionListener(new ButtonEventHandler(area)); 
        mybutton.addActionListener(new ButtonEventHandler_1(area1)); 
        
 
        
        frame.add( button, BorderLayout.EAST );
        frame.add( mybutton, BorderLayout.WEST) ;
        frame.add( area, BorderLayout.SOUTH );
        frame.add(area1, BorderLayout.NORTH); 
        frame.pack();
        frame.setDefaultCloseOperation( WindowConstants.DISPOSE_ON_CLOSE );
        frame.setLocationRelativeTo( null );
        frame.setVisible( true );
    }
   
}