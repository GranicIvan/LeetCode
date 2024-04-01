package wave1;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RLtEF2423 {

    public boolean equalFrequency(String word) {
        
    	Map<Character, Long> charCounts = word.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    	Map<Long, Long> mapOfOcurences = new HashMap<Long, Long>();
    	    	
    	
    	for (Long value : charCounts.values()) {
    		mapOfOcurences.put(value, mapOfOcurences.getOrDefault(value, 0L) + 1L);
        }
    	
    	//if(mapOfOcurences.size() == 1) return true;
    	if(mapOfOcurences.size() >2) return false;

    	Long nums[] = new Long[2];
    	int i = 0;
    	
    	for (Long l : mapOfOcurences.values()) {
    		nums[i] =  l;
    		i++;
    	}
    	
    	if(nums[0] + 1 == nums[1] || nums[1] + 1 == nums[0]) return true;
    	
    	
    	return false;
    }
	
}
