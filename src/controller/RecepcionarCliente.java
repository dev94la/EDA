package controller;

import model.Assunto;
import model.Atendimento;
import model.Cliente;

public class RecepcionarCliente {

	public static Atendimento recepcionar( Cliente cliente, Assunto[] assuntos)
	{
		return new Atendimento(cliente, assuntos);
	}
}
