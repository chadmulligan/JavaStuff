/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrom;

/**
 *
 * @author laz
 */
public class Palindrom {

    public static boolean isPalindrome(String str) {
		
                boolean palindrome = false;
		
		str = str.toLowerCase();

		// Loop from the start and end and compare the letter from the front to the one from the end.
		// Once the start is equal to or greater than the end, and it hasn't returned false, it must be a palindrome.
		for (int i = 0, j = str.length() - 1; i < str.length(); i++, j-- ) {
			System.out.println(i);
                        if (i < j) {
				if (str.charAt(i) != str.charAt(j)) {
					return false;
				}
			}
			else { 	return true; }
		}
                return palindrome;
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String str = "racecar"; 
        System.out.println(isPalindrome(str)); 
                
    }
}
