package com.springboot.junitTestCase;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AssertTest {

	@Test
	public void test() {
		boolean cond=true;
		int[] arr1= {1,2,3};
		int[] arr2= {1,2,3};
		Object a =null;
		assertEquals(true,cond);
		assertTrue(cond);
		//assertFalse(cond);
		assertNull(a);
		//assertNotNull(a);
		assertArrayEquals(arr1,arr2);
	}

}
