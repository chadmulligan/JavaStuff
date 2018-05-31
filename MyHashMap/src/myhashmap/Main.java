/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myhashmap;

import java.util.HashMap;

/**
 *
 * @author laz
 */
public class Main {

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    
    HashMap hm = new HashMap();
    
    hm.put("1st", "Hello");
    hm.put("2nd", "Goodbye");
    hm.put("3rd", new MyOwnClass());
    hm.put("4rd", new MyOwnClass());
    hm.put("5th", new Integer(56));
    
    System.out.println(hm);
  }
}
