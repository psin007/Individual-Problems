package interviewpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class TwoSUmTest {

	TwoSUm obj;
	
	@BeforeEach
	void init() {
		obj = new TwoSUm();
	}
	
	@Test
//	@Disabled
	void testAdd() {
		int[] nums1 = new int[]{2,7,11,15}; //target = 9
		int[] ret1 = new int[]{0,1};
		int[] nums2 = {3,1,5,2,6}; //target = 3
		int[] ret2 = {1,3};
		int[] nums3 = {-2,7,6,-7};//target = -9
		int[] ret3 = {0,3};
	//	assertArrayEquals(ret1,obj.add(nums1, 9));
		assertAll(
				() -> assertArrayEquals(ret1,obj.add(nums1, 9)),
				() -> assertArrayEquals(ret2,obj.add(nums2, 3)),
				() -> assertArrayEquals(ret3,obj.add(nums3, -9))
				);
	}
}
