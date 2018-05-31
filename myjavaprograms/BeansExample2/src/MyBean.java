import java.io.Serializable ; 
        
        /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class MyBean implements Serializable {
    
    public MyBean(){}
        
        private String title; 
        
        public String getTitle(){
            return this.title;
        }
        
        public void setTitle(String title){
            this.title = title;
        }
}
