package ar.edu.unlam.pb2.hp;

public class Enormuvus extends Hechizo{

	public Enormuvus(String nombre) {
		super(nombre);
	}

	@Override
	protected void aplicarHechizo(Hechizable hechizo) {
		hechizo.agrandar();
	}

}
