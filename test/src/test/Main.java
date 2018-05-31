/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author laz
 */
class Alpha {
String getType() { return "alpha"; }
}
class Beta extends Alpha {
String getType() { return "beta"; }
}
class Main extends Beta {
String getType() { return "gamma"; }
public static void main(String[] args) {
Main g1 =  new Main();
Main g2 =  new Main();
System.out.println(g1.getType() + " "
+ g2.getType());
}
}



