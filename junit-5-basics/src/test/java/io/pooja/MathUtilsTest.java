package io.pooja;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class MathUtilsTest {

	MathUtils mathUtils;
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("This needs to run before eveything");
	}
	
	@BeforeEach
	void init() {
		 mathUtils = new MathUtils();
	}
	
	@AfterEach
	void cleanup() {
		System.out.println("cleanup...");
	}
	
	@Nested
	class AddTest{
		
		@Test
		@DisplayName("Testing add method positive")
		void testAddPositive() {
			int expected = 2;
			int actual = mathUtils.add(1, 1);
			assertEquals(expected,actual);
		}
		
		@Test
		@DisplayName("Testing add method negative")
		void testAddNegative() {
			int expected = 2;
			int actual = mathUtils.add(1, 1);
			assertEquals(expected,actual);
		}	
	}
	
	@Test
	void testCircleArea() {
		//int expected = 1;
		//int actual = mathUtils.add(1, 1);
		assertEquals(314.1592653589793,mathUtils.computeCircleArea(10),"should return area of circle");
		
	}
	
	@Test
	void testDivide() {
		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1, 0),"Divide by 0 should throw");
	}
	
	@Test
	@Disabled
	@DisplayName("Testing diabled for TDD")
	void testDisabled() {
		fail("The test should fail");
	}
	
	@Test
	@DisplayName("Testing multiply")
	void testMultiply() {
		assertAll(
				() -> assertEquals(4,mathUtils.multiply(2, 2)),
				() -> assertEquals(0,mathUtils.multiply(2, 0)),
				() -> assertEquals(-4,mathUtils.multiply(2, -2))
				);
	}
}
