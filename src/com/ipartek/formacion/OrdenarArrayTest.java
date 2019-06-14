package com.ipartek.formacion;

import static org.junit.Assert.*;

import org.junit.Test;

public class OrdenarArrayTest {

	@Test
	public void testArrayOrd() throws Exception {
		int[] x= {3,5,1,7,8,9,6,4,2};
		int [] y=OrdenarArray.arrayOrd(x);
		
		for (int i = 0; i < y.length; i++) {
			assertEquals(i+1, y[i]);
		}
	}

}
