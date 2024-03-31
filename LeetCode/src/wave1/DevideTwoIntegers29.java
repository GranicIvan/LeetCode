package wave1;

public class DevideTwoIntegers29 {

	
    public int divide(int dividend, int divisor) {
        
    	if(dividend ==0) return 0;
    	if(dividend == divisor) return 1;
    	
    	if( dividend > 0 && divisor >0 ) {// x / y
    		int result = 0;
    		while(dividend >= divisor) {
    			dividend -= divisor;
    			result++;
    			if(result == Integer.MAX_VALUE ) return Integer.MAX_VALUE;
    		}
    		return result;
    	}else if(dividend < 0 && divisor <0){  // -x /-y
    		int result = 0;
    		while(dividend <= divisor) {
    			dividend -= divisor;
    			result++;
    			if(result == Integer.MAX_VALUE ) return Integer.MAX_VALUE;
    		}
    		return result;
    	}else if(dividend < 0 && divisor > 0){ // -x / y
    		int result = 0;
    		while(dividend <= divisor && dividend<0) {
    			dividend += divisor;
    			result--;
    			if(result == Integer.MIN_VALUE ) return Integer.MIN_VALUE;
    		}
    		return result;	
    	}else { // x/ -y
    		int result =0;
    		while(dividend >= 0 && dividend >= divisor*(-1)) {
    			dividend += divisor;
    			result--;
    			if(result == Integer.MIN_VALUE ) return Integer.MIN_VALUE;
    		}
    		return result;
    	}    	
    }
    
    
    
 public int divide2(int dividend, int divisor) {
        
    	if(dividend ==0) return 0;
    	if(dividend == divisor) return 1;
    	
    	boolean positive = true;
    	
    	if(dividend > 0) {
    		dividend *= -1;
    		positive = false;
    	}
    	
    	if(divisor > 0 ) {
    		positive = !positive ? true : false;
    		divisor *= -1;
    	}
    	
    	int result = 0;
    	while(dividend <= divisor) {
    		dividend -= divisor;
    		result--;
    		if(positive && result == -Integer.MAX_VALUE) return Integer.MAX_VALUE;
    		    	
    	}
    	
    	return positive ? -result : result;    	
    }
    
    
	
}
