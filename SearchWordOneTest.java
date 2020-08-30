package interviewpractice;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SearchWordOneTest {

	SearchWordOne obj;
	
	@BeforeEach
	void init() {
		obj = new SearchWordOne();
	}
	
	@Test
	void testExist() {
		assertEquals(true,obj.exist(new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "ABCCED"));
		assertEquals(true,obj.exist(new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "SEE"));
		assertEquals(false,obj.exist(new char[][] {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}}, "SED"));
	}

}
