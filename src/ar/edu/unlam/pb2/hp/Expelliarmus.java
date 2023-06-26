package ar.edu.unlam.pb2.hp;

public class Expelliarmus extends Hechizo{

	public Expelliarmus(String nombre) {
		super(nombre);
	}

	@Override
	protected void aplicarHechizo(Hechizable hechizo) {
		hechizo.desarmar();
	}

}
