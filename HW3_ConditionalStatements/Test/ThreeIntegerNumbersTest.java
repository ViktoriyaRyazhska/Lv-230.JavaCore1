import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.edu.ThreeIntegerNumbers;

public class ThreeIntegerNumbersTest {

		@Test
		public void testMaxNumber() {
			ThreeIntegerNumbers tester = new ThreeIntegerNumbers(-5, 0, 999);
			assertEquals(999, tester.logicForMaxNumber());
		}
		
		@Test
		public void testMinNumber() {
			ThreeIntegerNumbers tester = new ThreeIntegerNumbers(555,-10,7777);
			assertEquals(-10, tester.logicForMinNumber());
		}
}
