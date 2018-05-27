package model;

public class Cliente {
	
	// O id é o CPF do cliente
	private int id;
	private String nome;
	private int idade;
	
	public Cliente( int id, String nome, int idade )
	{
		this.id = id;
		this.nome = nome;
		this.idade = idade;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getNome()
	{
		return this.nome;
	}
	
	public int getIdade()
	{
		return this.idade;
	}
	
	@Override
	public String toString()
	{
		return "O cliente " + this.nome + " tem " + this.idade + " e seu CPF é " + this.id + "."; 
	}

}
