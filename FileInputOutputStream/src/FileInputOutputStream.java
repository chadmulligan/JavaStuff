import java.io.*;

public class FileInputOutputStream {
    
    public static void main(String[] args) throws IOException {
        
        FileReader in = null;
        FileWriter out = null;
        
        try{
          in = new FileReader("farrago.txt");
          out = new FileWriter("outagain.txt");
          int c;
        
          while ((c = in.read()) != -1){

            char b = (char)c; 
            System.out.println(c + "  " + b);  
            //System.out.printf("%x\n", b);
            out.write(c);
          } 
        } finally { 
          
        if( in != null){
        in.close();
        
        } 
        if(out != null){
        out.close();
        } 
        
        System.out.println("FileInputStream is used to read a file and FileOutPutStream is used for writing.");
    }
  }
}