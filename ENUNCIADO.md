Un joven aprendiz de magia y hechicería desea conquistar el mundo mágico. 
La capacidad de hacer magia es innata, pero el joven mago debe asistir a Hogwarts con el fin de dominarla y controlarla. 
Para lograrlo, necesita un sistema que le permita manejar los hechizos que irá descubriendo y agregando a su Libro de Hechizos. 
Para ponerlos en práctica, nuestro mago se mueve a un mundo simulado, donde se encuentra con Animales y Muebles que serán Hechizables, 
que por ahora solo pueden ser desarmados y agrandados, además de responder consultas acerca de su estado mágico actual.

Se brindan TRES (3) test significativos que deberán ser empleados para guiar su desarrollo.

	@Test
	public void queSePuedaAgregarUnHechizoAlLibro(){ 
	LibroDeHechizos libro = new LibroDeHechizos(); 
	Hechizo desarme = new Expelliarmus(); 
	libro.agregarHechizo(desarme); 
	Assert.assertEquals(desarme, libro.buscar("expelliarmus"));
	}

	@Test
	public void verSiUnHechizableEstaHechizado(){
	LibroDeHechizos libro = new LibroDeHechizos();
	Expelliarmus desarme = new Expelliarmus();
	Hechizable perro = new Animal();
	libro.agregarHechizo(desarme);
	Hechizo hechizo =libro.buscar("expelliarmus");
	hechizo.aplicarHechizo(perro);
	Assert.assertEquals("Me desarmaron", perro.getEstado());
	}
 
	@Test
	public void verSiUnHechizableCrece() {
	LibroDeHechizos libro = new LibroDeHechizos();
	Hechizo crecer = new Agrandar("enormuvus");
	Hechizable mesa = new Mueble();
	libro.agregarHechizo(crecer);
	Hechizo hechizo =libro.buscar("enormuvus");
	hechizo.aplicarHechizo(mesa);
	Assert.assertEquals("Ahora soy más grande", mesa.getEstado());
	}
 
a) Generar la estructura de proyecto adecuada.
b) Implementar la totalidad de las clases que involucran la solución al problema.
c) Implementar al menos CINCO (5) casos de prueba representativos.

