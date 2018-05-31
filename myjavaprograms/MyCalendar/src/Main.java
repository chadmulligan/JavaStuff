import java.util.Calendar;
import java.util.TimeZone;/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Getting Timezones object for Paris and Berlin
        TimeZone tzParis = TimeZone.getTimeZone("Europe/Paris");
        TimeZone tzBerlin = TimeZone.getTimeZone("Europe/Berlin");
        
        // Setting Calendar object for time of Paris and printing out HOUR and DATE
        Calendar rightnowParis = Calendar.getInstance(tzParis);
        System.out.println("Calendar.HOUR of Paris:" + rightnowParis.get(Calendar.HOUR)) ; 
        System.out.println("Calendar.DATE of Paris:" + rightnowParis.get(Calendar.DATE)) ;
        
        // Setting Calendar object for time of Berlin and printing out HOUR and DATE
        Calendar rightnowBerlin = Calendar.getInstance(tzBerlin);
        System.out.println("Calendar.HOUR of Berlin:" + rightnowBerlin.get(Calendar.HOUR)) ; 
        System.out.println("Calendar.DATE of Berlin:" + rightnowBerlin.get(Calendar.DATE)) ;
    }
}
