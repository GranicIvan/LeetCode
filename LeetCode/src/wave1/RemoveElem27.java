package wave1;

public class RemoveElem27 {

	//Remove all occurrences in-place
	
	
    public int removeElement(int[] nums, int val) {
        
    	int res = nums.length;
    	int len = res;
    	
    	for(int i = 0; i < res; i++) {
    		if(nums[i] == val) {    			
    			deleteElement(nums, i, len, res);
    			res--; //length of array is now less for 1
    			i--; // to check that index again 
    		}
    	}
    	
    	return res;
    }

	private void deleteElement(int[] nums, int i, int len, int res) {
		for(int j = i; j< res-1; j++) {
			nums[j] = nums[j+1];
		}		
	}
	
	
	// different way
	 public int removeElement2(int[] nums, int val) {
		 int j=0; // num of elements that are not val
		 
		 for(int i = 0; i < nums.length; i++) {
			 if(nums[i] != val) {
				 nums[j] = nums[i];
				 j++;
			 }
		 }
		 
		 return j;
	 }
	
	
}
