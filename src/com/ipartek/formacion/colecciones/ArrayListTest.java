package com.ipartek.formacion.colecciones;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class ArrayListTest {

	@Test
	public void test() {
		ArrayList<String> paises = new ArrayList<String>();
		if (paises.isEmpty()) {
			paises.add("eeuu");
			paises.add("korea la buena");
			paises.add("barakaldo");
		}

		try {
			if (paises.size() == 3) {
				if (paises.contains("barakaldo")) {
					if (paises.contains("eeuu")) {
						Collections.sort(paises);
						for (int i = (paises.size() - 1); i >= 0; i--) {
							if (paises.get(i).contentEquals("barakaldo"))
								paises.add((i + 1), "el nombre raro de cual nombre no me acuerdo");
						}
					}
				}
			}

			if (paises.contains("korea la buena"))
				paises.remove("korea la buena");
			paises.add("barakaldo");
			Collections.sort(paises);

			paises.removeAll(paises);
			assertTrue(paises.isEmpty());
		} catch (Exception e) {
			fail("Menudo manco ni hacer funcionar un array sabes!");
		}

	}

}
