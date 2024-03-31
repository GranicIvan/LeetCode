package wave1;

import java.util.HashMap;

public class TwoSum1 {

	//Basic
    public int[] twoSum(int[] nums, int target) {
    	int len = nums.length;
    	for(int i =0; i < len-1; i++) { 
    		for(int j = i+1; j<len; j++) { // Can't be same element + faster
    			if(target == nums[i] + nums[j] ) {
    				return new int[] {i, j};
    			}
    		}
    	}
        return null;
    }
    
    
    //Hash map (10x faster)
    public int[] twoSumHash(int[] nums, int target) {
    	int len = nums.length;
    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	
    	for(int i = 0; i< len; i++) {
    		hm.put(nums[i], i);
    	}
    	
    	for(int i = 0; i< len-1; i++) {
    		int part = target - nums[i];
    		if(hm.containsKey(part) && hm.get(part) != i) {
    			return new int[] {i, hm.get(part)};
    		}
    	}
        return null;
    }

    //Hash map single pass (20x faster)
    public int[] twoSumHashOnePass(int[] nums, int target) {
    	int len = nums.length;

    	HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	
    	for(int i=0; i< len; i++) {
    		int part = target - nums[i];
    		if(hm.containsKey(part)) { 
    			return new int[] {i,hm.get(part)};
    		}
    		hm.put(nums[i], i);
    	}
    	
        return null;
    }
}
