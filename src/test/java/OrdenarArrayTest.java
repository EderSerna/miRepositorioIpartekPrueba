

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.ipartek.formacion.OrdenarArray;

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
