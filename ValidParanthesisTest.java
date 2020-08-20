package interviewpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ValidParanthesisTest {
	
	ValidParanthesis obj;
	@BeforeEach
	void init() {
		obj = new ValidParanthesis();
	}
	
	@Test
	void testValid() {
		assertEquals(true,obj.testValid("()"));
		assertEquals(false,obj.testValid("("));
		assertEquals(false,obj.testValid(")"));
		assertEquals(false,obj.testValid(")("));
		assertEquals(true,obj.testValid(""));
		assertEquals(false,obj.testValid(" "));
		assertEquals(true,obj.testValid("({})"));
		assertEquals(true,obj.testValid("({}[])"));
		assertEquals(false,obj.testValid("[({}])"));
		assertEquals(false,obj.testValid("[{{]}]"));
	}
	
}
