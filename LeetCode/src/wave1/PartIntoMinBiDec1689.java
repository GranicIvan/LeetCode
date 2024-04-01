package wave1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PartIntoMinBiDec1689 {
	
	//slow one
    public int minPartitions(String n) {
    	int len = n.length();
        int res = 0;
        for(int i=0; i<len; i++) {
        	int cur = Character.getNumericValue(n.charAt(i));  
        	if(cur > res) res = cur;
        	
        }
        return res;
    }
    
    // still slow
    public int minPartitions2(String n) {
    	int len = n.length();
        long res = 0;
        long num = Long.parseLong(n);
        for(int i=0; i<len; i++) {
        	long cur = num % 10L;
        	if(cur > res) res = cur;
        	num = num / 10;
        	
        }
        return (int) res;
    }
    
    //Fast
    public int minPartitions3(String n) {
    	       
    	int res=-1;
        char chars[] = n.toCharArray();
        int len = n.length();
        for(int i=0; i<len; i++) {
        	if(res < chars[i]-'0') res = chars[i]-'0';             			
        }
                    
        return  res;
    }
    
    //Fastest
    public int minPartitions4(String n) {
	           	
        for(char c='9'; c>='0'; c--) {
        	int i = n.indexOf(c);
        	if(i!=-1) {
        		return (c-'0');
        	}
        }                    
        return  0;
    }
    
    
    
    
}
