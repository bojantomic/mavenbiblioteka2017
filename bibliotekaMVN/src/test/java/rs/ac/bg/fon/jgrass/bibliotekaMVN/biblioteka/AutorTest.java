package rs.ac.bg.fon.jgrass.bibliotekaMVN.biblioteka;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AutorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetIme() {
		Autor a = new Autor();
		
		a.setIme("Pera");
		
		assertEquals("Pera", a.getIme());
	}

	@Test
	public void testSetPrezime() {
		Autor a = new Autor();
		
		a.setPrezime("Peric");
		
		assertEquals("Peric", a.getPrezime());
	}

}
