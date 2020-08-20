package interviewpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MinStackTest {

	MinStack obj;
	@BeforeEach
	void init() {
		obj = new MinStack();
	}
	
	@Test
	void test() {
		obj.push(3);
		obj.push(2);
		obj.push(1);
		obj.push(9);
		obj.push(2);
		assertEquals(1,obj.getMin());
		assertEquals(2,obj.top());
		obj.pop();
		obj.pop();
		obj.pop();
		assertEquals(2,obj.getMin());
		
	}

}
