package interviewpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

class StringToIntegerTest {
	
	StringToInteger obj;
	@BeforeEach
	void init() {
		obj = new StringToInteger();
	}

	@Test
	void testConvert() {
		
		assertEquals(0,obj.convert(" "));
		assertEquals(0,obj.convert(""));
		assertEquals(42,obj.convert("42"));
		assertEquals(-42,obj.convert("      -42"));
		assertEquals(4193,obj.convert("4193 with words"));
		assertEquals(0,obj.convert("words and 987"));
		assertEquals(Integer.MAX_VALUE,obj.convert("91283472332"));
		assertEquals(Integer.MIN_VALUE,obj.convert("-91283472332"));

	}
	
	@Test
	void testIsNumeral() {
		assertEquals(4,obj.isNumeral('4'));
		assertEquals(8,obj.isNumeral('8'));
		assertEquals(0,obj.isNumeral('0'));
		assertEquals(-1,obj.isNumeral('-'));
	}

}
