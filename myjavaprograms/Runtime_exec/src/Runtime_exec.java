
class Runtime_exec {
    
    public static void main(String args[]) {
        
        Runtime rt = Runtime.getRuntime();
        Process proc;
        
        try {
            
            if (System.getProperty("os.name").startsWith("Windows")){
                // Run a OS specific program
                proc = rt.exec("notepad");
            }
            else{
                proc = rt.exec("TextEdit.app");
            }
            
            System.out.println("Before calling waitFor() method");
            proc.waitFor();    // try removing this line
            System.out.println("After calling waitFor() method");
        } catch (Exception e) {
            System.out.println("notepad is an unknown command.");
        } 
        
        Runtime rt2 = Runtime.getRuntime();
        
        long maxMemory = rt2.maxMemory();
        long totalMemory = rt2.totalMemory();
        System.out.println("Maximum amount of memory that the Java virtual machine will attempt to use = " + maxMemory + " bytes");
        System.out.println("Total amount of memory currently available for current and future objects, measured in bytes = " + totalMemory + " bytes");
        System.out.println(rt2); 
        
        Runtime 
    }
    
}