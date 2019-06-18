import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Hashtable;
import java.util.Iterator;

import org.junit.Test;

public class DiccionarioTest {

	@Test
	public void test() {
		int cont=0;
		Hashtable<String,String> paises=new Hashtable<String,String>();
		
		if(paises.isEmpty()) {
			paises.put("bk", "barakaldo");
			paises.put("eu","eeuu");
			paises.put("kr", "korea");
		}
		System.out.println(paises.keySet());
		assertEquals("barakaldo",paises.get("bk"));
		
		Iterator<String> it=paises.values().iterator();
		while(it.hasNext()) {
			if(paises.contains("barakaldo"))
				cont++;
		}
		
		assertTrue(cont==1);
		
	}
	
	/*@Test
	public void test2() {
		fail("Not yet implemented");
	}*/

}
