package ar.edu.unlam.pb2.hp;

public class Objeto implements Hechizable{

	protected String estado;
	
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	@Override
	public void desarmar() {
		this.setEstado("Me desarmaron");
		
	}

	@Override
	public void agrandar() {
		this.setEstado("Ahora soy mas grande");
		
	}

	@Override
	public String getEstado() {
		return this.estado;
	}

}
