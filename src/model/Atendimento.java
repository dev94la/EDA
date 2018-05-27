package model;

import java.util.Calendar;
import java.util.Date;

public class Atendimento {
	
	private Cliente cliente;
	private Assunto[] assuntos;
	private Date horaChegada;
	
	// A hora do atendimento só é calculada quando o cliente for atendido
	private Date horaAtendimento;
	
	public Atendimento( Cliente cliente, Assunto[] assuntos)
	{
		this.cliente = cliente;
		this.horaChegada = new Date();
		this.assuntos = assuntos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Assunto[] getAssuntos() {
		return assuntos;
	}

	public void setAssuntos( Assunto[] assuntos ) {
		this.assuntos = assuntos;
	}

	public Date getHoraChegada() {
		return horaChegada;
	}

	public Date getHoraAtendimento() {
		return horaAtendimento;
	}

	public void setHoraAtendimento( Date horaAtendimento ) {
		this.horaAtendimento = horaAtendimento;
	}
	
	public String timeToShow( Date dateToShow )
	{
		Calendar dateToCalendar = Calendar.getInstance();
		dateToCalendar.setTime( dateToShow );
		int hourToShow = dateToCalendar.get(Calendar.HOUR);
		int minuteToShow = dateToCalendar.get(Calendar.MINUTE);
		return "Horário (HH:MM):" + hourToShow + ":" + minuteToShow;
	}
}
