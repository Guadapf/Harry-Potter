package ar.edu.unlam.pb2.hp;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.hp.LibroHechizos;

public class LibroHechizosTest {

	@Test
	public void queSePuedanAgregarHechizosAlLibro() {
		LibroHechizos libro = new LibroHechizos();
		Hechizo expelliarmus = new Expelliarmus("expelliarmus");
		Hechizo enormuvus = new Enormuvus("enormuvus");
		
		assertTrue(libro.agregarHechizo(expelliarmus));
		assertTrue(libro.agregarHechizo(enormuvus));
	}
	
	@Test (expected = NoSePuedeEncontrarElHechizoException.class)
	public void queLanzeUnaExcepcionSiNOEncuentraElHechizo() throws Exception {
		LibroHechizos libro = new LibroHechizos();
		
		libro.buscar("normandus");
	}
	
	@Test
	public void queNoSePuedanAgregarHechizosDuplicados() {
		LibroHechizos libro = new LibroHechizos();
		Hechizo h1 = new Expelliarmus("expelliarmus");
		Hechizo h2 = new Expelliarmus("expelliarmus");
		
		assertTrue(libro.agregarHechizo(h1));
		assertFalse(libro.agregarHechizo(h2));
	}
	
	@Test
	public void queUnHechizoCrezca() {
		LibroHechizos libro = new LibroHechizos();
		Hechizo h1 = new Enormuvus("enormuvus");
		Hechizable silla = new Mueble();
		
		libro.agregarHechizo(h1);
		h1.aplicarHechizo(silla);
		
		String valorEsperado = "Ahora soy mas grande";
		String valorObtenido = silla.getEstado();
		
		assertEquals(valorEsperado, valorObtenido);
	}
	
	@Test
	public void queUnHechizableSeDesarme() {
		LibroHechizos libro = new LibroHechizos();
		Hechizo h1 = new Expelliarmus("expelliarmus");
		Hechizable gato = new Animal();
		
		libro.agregarHechizo(h1);
		h1.aplicarHechizo(gato);
		
		String valorEsperado = "Me desarmaron";
		String valorObtenido = gato.getEstado();
		
		assertEquals(valorEsperado, valorObtenido);
	}

}
