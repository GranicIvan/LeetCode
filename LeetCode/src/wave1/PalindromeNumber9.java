package wave1;

public class PalindromeNumber9 {

	
    public boolean isPalindrome(int x) {
        
        String s = String.valueOf(x);

        int sLen = s.length();

        for(int i = 0 ;  i< sLen /2; i++ ) {
        	if( s.charAt(i) != s.charAt(sLen-i-1)) {
        		return false;
        	}
        }
        return true;

    }
	
	
}
