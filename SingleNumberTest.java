package interviewpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SingleNumberTest {

	SingleNumber obj;
	@BeforeEach
	void init() {
		obj = new SingleNumber();
	}
	
	@Test
	void testSoluition() {
		assertAll(
				() -> assertEquals(1,obj.solution(new int[] {2,2,1})),
				() -> assertEquals(4,obj.solution(new int[] {4,1,2,1,2}))
		);
	}

}
