/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myrelationinterface;

/**
 *
 * @author laz
 */ 

// Define an interface with three abstract methods.
// Any class that implements this interface has to
// implement all three methods.
public interface RelationInterface {
    public boolean isGreater( Object a, Object b);
    public boolean isLess( Object a, Object b); 
    public boolean isEqual( Object a, Object b);
}
