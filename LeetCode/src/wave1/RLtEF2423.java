package wave1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RLtEF2423 {

	/* 
	 * SO MANY EDGE CASES...
	Checking every edge case is adding way too much code, 
	because we have to delete one char lets delete a char an than check
	*/
    
    
    //Works but is too slow
    public static boolean equalFrequency(String word) {
    	int len = word.length();
    	for(int i = 0; i < len; i ++) {
    		
    		String WOOneChar = word.substring(0, i) + word.substring(i+1, len);
    		Map<Character, Integer> hm = new HashMap<Character, Integer>();
    		
    		int min = Integer.MAX_VALUE;
    		int max = 0;
    		
    		for(char c: WOOneChar.toCharArray() ) {
    			hm.put(c,  hm.getOrDefault(c, 0) + 1 );
    		}
    		
    		for(char c: hm.keySet()) {
    			min = Math.min(min, hm.get(c));
    			max = Math.max(max, hm.get(c));
    		}
    		
    		if(max == min) {
    			return true;
    		}
    	}
    	
    	return false;
    }
    
    //fast
    public static boolean equalFrequency2(String word) {
    	
    	int[] countInWord = new int[26];
    	
    	for(char c: word.toCharArray()) {
    		countInWord[c-'a']++;
    	}
    	
    	for(int i = 0; i< 26; i++) {
    		if(countInWord[i] > 0) {
    			countInWord[i]--; // we 'delete' that char
    			if(checkIfAcceptable(countInWord)) return true;
    			countInWord[i]++; // we 'bring' it back
    		}
    	} 
    	    	
    	return false;
    }
    
    private static boolean checkIfAcceptable(int[] countInWord) {
    	int currentCount = 0;
    	
    	for(int c : countInWord) {
    		if(c > 0) {
    			if(currentCount == 0) {
    				currentCount = c;
    			}else if(currentCount != c) {
    				return false;
    			}
    				
    		}
    	}
    	return true;
    }
    

	
}
