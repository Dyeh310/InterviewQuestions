package programmingknowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class addTest {

	@Test
	public void test() {
		myJUnitClass junit = new myJUnitClass();
		int result = junit.add(100, 200);
		assertEquals(300,result);
	}

}
