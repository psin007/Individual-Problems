package interviewpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwoIndicesTest {
	
	TwoIndices obj;
	
	@BeforeEach
	void init() {
		obj = new TwoIndices();
	}
	

	@Test
	void testtwoindices() {
		
		int[] ar1 = new int[]{2,7,9,1};
		int[] ret1 = new int[]{0,1};
		assertArrayEquals(ret1,obj.twoindices(ar1,9));
		
		int[] ar2 = new int[] {2,7,1,1};
		int[] ret2 = new int[] {2,3};
		assertArrayEquals(ret2,obj.twoindices(ar2,2));
		
	}

}
