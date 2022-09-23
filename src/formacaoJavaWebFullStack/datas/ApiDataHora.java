package formacaoJavaWebFullStack.datas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ApiDataHora {

	public static void main(String[] args) {
		
		//Trabalhando com datas 
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data Atual : "+dataAtual);
		
		//Trabalhando com tempo
		LocalTime horaAtual = LocalTime.now();
		System.out.println(horaAtual);
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual : " +dataAtualHoraAtual.format(DateTimeFormatter.BASIC_ISO_DATE));
		
		System.out.println("Data e hora atual : " +dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println("Data e hora atual : " +dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("HH:mm.ss")));
		
		System.out.println("Data e hora atual : " +dataAtualHoraAtual.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm.ss")));
		
				
	}

}
