package wave2;

public class RemDuplFSortArray26 {


	
	//one pass 
	static public int removeDuplicates(int[] nums) {

		int result = 0;

		for (int i = 1; i < nums.length ; i++) {
			if (nums[result] != nums[i]) {
				result++;
				nums[result] = nums[i];
			}			
		}				
		return result+1;
	}
		

	


}
