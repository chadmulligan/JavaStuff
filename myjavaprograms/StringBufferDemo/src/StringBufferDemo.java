/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class StringBufferDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
StringBuffer sb = new StringBuffer("Jonathan");
System.out.println("sb = " + sb);
/* initial capacity is 16 */
System.out.println("capacity of sb: "+sb.capacity());
System.out.println("append \'O\' to sb: " + sb.append('O'));
System.out.println("sb = " + sb);
System.out.println("3rd character of sb: " +  sb.charAt(2)); 
Properties p1 = System.getProperties(); 
p1.list(System.out);
    }
}
