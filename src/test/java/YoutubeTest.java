

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ipartek.formacion.Youtube;

public class YoutubeTest {
	Youtube y1;
	public static final String TITULO = "Scorpions --- No one like you";
	public static final String CODIGO = "fRmbCIAz4c8";

	@Before
	public void setUp() throws Exception {
		y1 = new Youtube(TITULO, CODIGO);
	}

	@After
	public void tearDown() throws Exception {
		y1 = null;
	}

	@Test
	public void testGetTitulo() {
		assertEquals(TITULO, y1.getTitulo());
	}

	@Test
	public void testSetTitulo() throws Exception {
		y1.setTitulo("asdf");
		assertEquals("asdf", y1.getTitulo());
	}

	@Test
	public void testGetCod() {
		assertEquals(CODIGO, y1.getCod());
	}

	@Test
	public void testSetCod() throws Exception {
		y1.setCod("x7bIbVlIqEc");
		assertEquals("x7bIbVlIqEc", y1.getCod());
	}

	@Test
	public void testGetRepro() {
		assertEquals(Youtube.REP_DEF, y1.getRepro());
	}

	@Test
	public void testAbrirVideo() throws Exception {
		y1.abrirVideo();
	}

}
