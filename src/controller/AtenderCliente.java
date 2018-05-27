package controller;

import java.util.Calendar;

import model.Atendimento;

public class AtenderCliente {
	
	public static void atender()
	{
		
	}
	
	public static float calculateClientPriority( Atendimento atendimento,  Calendar horaAtual )
	{
		final int ageToCompare = 65;
		final int waitMinutesToCompare = 15;
		final int urgencyToCompare = 10;
		
		float averageAge = atendimento.getCliente().getIdade() / ageToCompare;
		
		Calendar arrival = Calendar.getInstance();
		arrival.setTime( atendimento.getHoraChegada() );
		int waitMinutes = compareTime( arrival, horaAtual );
		float averageWait = waitMinutes / waitMinutesToCompare;
		
		float averageSubjectsUrgency = getSubjectsUrgencyAverage();
		
		// esse método ainda não está pronto
		
	}
	
	private static int compareTime( Calendar startDate, Calendar endDate )
	{
		final int minutesInOneHour = 60;
		int startHours = startDate.get(Calendar.HOUR);
		int startMinutes = startDate.get(Calendar.MINUTE);
		
		int endHours = endDate.get(Calendar.HOUR);
		int endMinutes = endDate.get(Calendar.MINUTE);
		
		int hours = endHours - startHours;
		int minutes = endMinutes - startMinutes;
		
		if(minutes < 0 )
		{
			int aux = minutes;
			minutes = 60 + aux;
			hours -= 1;
		}
		
		int allMinutes = hours * minutesInOneHour + minutes;
		return allMinutes;
	}
}
