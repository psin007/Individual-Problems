package interviewpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class UniquePathsTest {
	
	UniquePaths obj;
	
	@BeforeEach
	void init() {
		obj = new UniquePaths();
	}
	

	@Test
	void testUniquePaths() {
		assertEquals(3, obj.uniquePaths(3, 2));
		assertEquals(28, obj.uniquePaths(7, 3));
	}

}
