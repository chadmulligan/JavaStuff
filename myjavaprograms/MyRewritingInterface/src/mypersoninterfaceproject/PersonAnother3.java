/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypersoninterfaceproject;

/**
 *
 * @author laz
 */
public class PersonAnother3 extends Person implements PersonInterface, PersonInterfaceAnother, PersonInterface3 {
    
    PersonAnother3(int cashSaving,
           int retirementFund,
           String firstName,
           String lastName){
        super(cashSaving, retirementFund, firstName, lastName) ; 
    }
    
    @Override
    public String toChangeNameToUpperCase() {
        return getName().toUpperCase(); 
    }

    @Override
    public int computeTotalWealth() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getName() {
         return firstName + " " + lastName;
    }

    @Override
    public void newMethod() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
