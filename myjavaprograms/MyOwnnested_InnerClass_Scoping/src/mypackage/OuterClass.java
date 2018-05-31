package mypackage;

public class OuterClass {

    // Define variables in the outer class
    int data = 5;


    // Define an inner class
    class InnerClass {

        int data2 = 10;

        void method() {
            System.out.println("data from OuterClass = " + data);
            System.out.println("data2 from InnerClass =" + data2); 
        }
        
        
     // Create an inner class within Innerclass 
        class InnerInnerClass {
            
            int data3 = 15; 
            
            void method2() {
            System.out.println("data from OuterClass = " + data);
            System.out.println("data2 from InnerClass =" + data2);
            System.out.println("data3 from InnerInnerClass =" + data3);
            }
        }
    }
}
