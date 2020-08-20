package interviewpractice;

import java.util.HashMap;

public class TwoIndices {

	public int[] twoindices(int[] ar, int target) {
		
		int[] retArr = new int[] {-1,-1};
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0; i< ar.length; i++) {
			if(map.containsKey(target - ar[i]) && i != map.get(target - ar[i])) {
				retArr[0] = Math.min(i,map.get(target - ar[i]));
				retArr[1] = Math.max(i, map.get(target-ar[i]));
			}
			else {
				map.put(ar[i],i);
			}
		}
		//System.out.println(retArr[0]);
		return  retArr;
	}
}
