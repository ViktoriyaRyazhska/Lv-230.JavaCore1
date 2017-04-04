
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.edu.ErrorsClass;



public class ErrorsClassTest {

		@Test
		public void testErrors1() {
			ErrorsClass tester2 = new ErrorsClass(400);
			
			assertEquals("Bad_Request", tester2.logicErrors());
	}
		
		@Test
		public void testError2() {
			ErrorsClass tester = new ErrorsClass(403);
			
			assertEquals("Forbidden", tester.logicErrors());
	}
		@Test
		public void testError3() {
			ErrorsClass tester = new ErrorsClass(300);
			
			assertEquals("We dont have information about this error.", tester.logicErrors());
	}
}
