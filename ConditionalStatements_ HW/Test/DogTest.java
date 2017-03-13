import static org.junit.Assert.*;

import org.junit.Test;

import com.edu.Dog;

import com.edu.CheckDogs;

public class DogTest {

    Dog doggy1 = new Dog("Alfi","Affenpinscher", 5);
	Dog doggy2 = new Dog("Body","Cane_Corso", 6);
	Dog doggy3 = new Dog("Alfi","Affenpinscher", 8);
	
	@Test
	public void testNegative() {
				assertFalse( doggy1.equals(doggy2));
	}

	@Test
	public void testPositive() {
				assertTrue( doggy1.equals(doggy3));
	}
	
	@Test
	public void testPositiveForCheckingOldestDog() {
		CheckDogs dog2 = new CheckDogs();
				assertEquals("The oldest dog are third.", dog2.checkOldestDog());
	}
}
