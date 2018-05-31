package myabstractproject;

public class Human extends LivingThing {
   
    public Human(String name){
        super(name);
    }
   
    // Provide implementation of the abstract method.
    @Override
    public void walk(){
        System.out.println("Human " + getName() + " walks...");
    }
   
}
