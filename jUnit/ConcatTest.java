package programmingknowledge;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConcatTest {

	@Test
	public void ConcatTest() {
		myJUnitClass junit = new myJUnitClass();
		String result = junit.ConCat("Hello", "World");
		assertEquals("HelloWorld",result);
	}

}
