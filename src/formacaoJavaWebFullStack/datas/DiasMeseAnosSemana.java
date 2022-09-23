package formacaoJavaWebFullStack.datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiasMeseAnosSemana {

	public static void main(String[] args) {
		
		LocalDate localDate = LocalDate.now();
		
		System.out.println("Data Atual : "+localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		//Informa o nome do dia da semana
		System.out.println("Dia da semana : "+localDate.getDayOfWeek().name());
		
		//Informa o dia do mês 
		System.out.println("Dia do mês : "+localDate.getDayOfMonth());
		
		//Informa o dia do ano
		System.out.println("Qual o numero do dia  : "+localDate.getDayOfYear());
		
		//Informa o nome do mes
		System.out.println("Informa o nome do mês : "+localDate.getMonth());
		
		System.out.println("Ano : "+localDate.getYear());
	}
}