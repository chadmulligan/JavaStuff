package myabstractproject;

public class Monkey extends LivingThing {
   
    public Monkey(String name){
        super(name);
    }
   
    // Provide implementation of the abstract method.
    @Override
    public void walk(){
        System.out.println("Monkey " + getName() + " walks...");
    }
   
}
