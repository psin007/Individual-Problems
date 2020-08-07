package interviewpractice;

public class SingleNumber {

	int solution(int[] nums) {
		int a = 0;
		for(int i:nums) {
			a ^= i;
		}
		return a;
	}
}
