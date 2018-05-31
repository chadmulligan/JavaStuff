/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mypersoninterfaceproject;

/**
 *
 * @author laz
 */


public class AddressImpl implements AddressInterface {
    
    private int streetNumber;
    private String streetName;
    private String country;
    
    AddressImpl(int streetNumber, String streetName, String country) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.country = country; 
    }
    
    @Override
    public int getStreetNumber(){
        return this.streetNumber;
    }
    
    @Override
    public void setStreetNumber(int streetNumber){
        this.streetNumber = streetNumber; 
    }
    
    @Override
    public String getStreetName(){
        return this.streetName;
    }
    
    @Override
    public void setStreetName(String streetName){
        this.streetName = streetName; 
    };
    
    @Override
    public String getCountry(){
        return this.country; 
    };
    
    @Override
    public void setCountry(String country){
        this.country = country; 
    };
}
