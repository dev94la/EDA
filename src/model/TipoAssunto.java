package model;

public class TipoAssunto {
	
	private String tipo;
	private String titulo;
	private int urgencia;
	
	public TipoAssunto( String tipo, String titulo, int urgencia )
	{
		this.tipo = tipo;
		this.titulo = titulo;
		this.urgencia = urgencia;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo( String tipo ) {
		this.tipo = tipo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo( String titulo ) {
		this.titulo = titulo;
	}

	public int getUrgencia() {
		return urgencia;
	}

	public void setUrgencia( int urgencia ) {
		this.urgencia = urgencia;
	}

	@Override
	public String toString()
	{
		return "Este assunto é do tipo " + this.tipo + ", possui o título: " + this.titulo
				+ " e sua urgência (com grau de zero a dez) é " + this.urgencia;
	}

}
