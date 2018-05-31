/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myonlineshop;

/**
 *
 * @author laz
 */
public class Book extends Product {
    private String publisher;
    private int yearPublished;
   
    /** Creates a new instance of Book */
    public Book(double regularPrice,
            String publisher,
            int yearPublished) {
        super(regularPrice);
        this.publisher = publisher;
        this.yearPublished = yearPublished;
    }
   
    // Override this method
    @Override
    public double computeSalePrice(){
        return super.getRegularPrice() * 0.5;
    } 
    
    @Override
    public double computeSpecialCustomerPrice(){
        return computeSalePrice()-2; 
    }
   
    public String getPublisher() {
        return publisher;
    }
   
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
   
    public int getYearPublished() {
        return yearPublished;
    }
   
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }
}
