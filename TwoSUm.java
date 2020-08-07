package interviewpractice;

import java.util.HashMap;

public class TwoSUm {
	
	public int[] add(int[] nums,int target){
		int[] returnArray = {-1,-1};
		int targetElem = -1;
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i < nums.length;i++) {
			targetElem =  target - nums[i];
			if(!searchTargetElemInHash(targetElem,map)) {
				map.put(nums[i],i);
			}
			else {
				returnArray[0] = Math.min(i, map.get(targetElem));
				returnArray[1] = Math.max(i, map.get(targetElem));
			}
		}
		return returnArray;
	}
	
	public boolean searchTargetElemInHash(int targetElem, HashMap<Integer,Integer>map) {
		if(map.containsKey(targetElem))
			return true;
		return false;
	}
	

}
