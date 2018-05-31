

public class MyEventExample {
   
    public static void main(String[] args) {
       
        int i; 
        
        
        // Create an event source
        MyEventSource s1 = new MyEventSource(); 
        
        // Create an event listener handler 
        MyEventListenerImpl myEventListenerImpl = new MyEventListenerImpl();
        
        // Register an event listener to the event source
        s1.addMyEventListener(myEventListenerImpl); 
       
        // Triger an event
        s1.triggerSomethingEvent("I won the lottery!");
       
        // Trigger another event
        s1.triggerSomethingEvent("She said Yes!"); 
        
        for(Object item: s1.a1) {
            System.out.println("s1.a1 item: " +item) ; 
        }
       
    }
   
}