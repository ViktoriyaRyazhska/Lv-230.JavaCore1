package oiu.poi;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;
import pack.oiu.Dog;

public class TestDog {

	
	Dog dog= new Dog();
	@Test
	public void testGetAge() {
	Assert.assertEquals(17, dog.getAge());   ////!!!!!!!!!
	}

	@Test
	public void testSetAge() {
		Assert.assertNotNull(dog);;
	}

	
	// незрозуміло шо можна перевірити
}
