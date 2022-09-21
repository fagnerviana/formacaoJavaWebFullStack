package formacaoJavaWebFullStack.datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ApiDataHora {

	public static void main(String[] args) {
		
		//Trabalhando com datas 
		LocalDate dataAtual = LocalDate.now();
		System.out.println("Data Atual : "+dataAtual);
		
		//Trabalhando com tempo
		LocalTime horaAtual = LocalTime.now();
		System.out.println(horaAtual);
		
		LocalDateTime dataAtualHoraAtual = LocalDateTime.now();
		
		System.out.println("Data e hora atual : " +dataAtualHoraAtual);
		
		

	}

}
