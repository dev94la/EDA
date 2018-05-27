package model;

public class Assunto {
	
	private TipoAssunto tipo;
	private String descricao;
	
	// As providências são salvas no final do atendimento
	private String providencias;
	
	// A duração do atendimento é calculada quando o mesmo é encerrado
	private int duracaoAtendimento;
	
	public Assunto( TipoAssunto tipo, String descricao )
	{
		this.tipo = tipo;
		this.descricao = descricao;
	}
	
	public TipoAssunto getTipo() {
		return tipo;
	}

	public void setTipo( TipoAssunto tipo ) {
		this.tipo = tipo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao( String descricao ) {
		this.descricao = descricao;
	}

	public String getProvidencias() {
		return providencias;
	}

	public void setProvidencias( String providencias ) {
		this.providencias = providencias;
	}

	public int getDuracaoAtendimento() {
		return duracaoAtendimento;
	}

	public void setDuracaoAtendimento( int duracaoAtendimento ) {
		this.duracaoAtendimento = duracaoAtendimento;
	}

	@Override
	public String toString()
	{
		return "O assunto é do tipo " + this.tipo.getTipo() + ", sua descrição é: " + this.descricao
				+ ", as providências tomadas foram: " + this.providencias
				+ " e sua urgência é " + this.tipo.getUrgencia();
	}

}
