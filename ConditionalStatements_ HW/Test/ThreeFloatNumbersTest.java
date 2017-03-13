import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.edu.ThreeFloatNumbers;

public class ThreeFloatNumbersTest {
	
	@Test
	public void testPositiveLogic() {
		ThreeFloatNumbers tester = new ThreeFloatNumbers(4.5f, -1.5f, 4.5f);
		assertEquals("All three numbers are belong to the range [-5;5]", tester.logic());
	}
	
	@Test
	public void testNegativeLogic() {
		ThreeFloatNumbers tester = new ThreeFloatNumbers(5.5f, 1.5f, 2.5f);
		assertEquals("All three numbers are not belong to the range [-5;5]", tester.logic());
	}

}
