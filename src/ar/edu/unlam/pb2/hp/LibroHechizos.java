package ar.edu.unlam.pb2.hp;

import java.util.HashSet;

public class LibroHechizos {
	
	private HashSet<Hechizo> hechizos = new HashSet<Hechizo>();
	
	public Boolean agregarHechizo(Hechizo hechizo) {
		return this.hechizos.add(hechizo);
	}
	
	public Hechizo buscar(String nombre) throws Exception{
		for(Hechizo h : hechizos) {
			if(h.getNombre().equalsIgnoreCase(nombre)) {
				return h;
			}
		}
		throw new NoSePuedeEncontrarElHechizoException("No se encuentra el hechizo");
	}

}
