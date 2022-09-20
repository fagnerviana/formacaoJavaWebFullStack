package formacaoJavaWebFullStack.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;

public class ManipulandoData {

	public static void main(String[] args) throws ParseException {
		
		Calendar calendar = Calendar.getInstance();//pega a data atual
		
		/*Simular que a data vem do banco de dados*/
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("19-09-2022"));//definindo uma data qualquer
		
		//Neste caso soma o DIA conforme o valor passsado
		calendar.add(calendar.DAY_OF_MONTH, 8);
		
		//Neste caso soma o MES conforme o valor passsado
		calendar.add(calendar.MONTH, 1);
		
		//Neste caso soma o ANO conforme o valor passsado
		calendar.add(calendar.YEAR, 3);
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		
		/*Contas os dias entre datas */
		
		//Retorna o numero de dias entre as datas informadas
		long dias = ChronoUnit.DAYS.between(LocalDate.parse("1985-07-05"),LocalDate.now());
		
		//Retorna a quantidade de decadas entre as datas infomadas
		long decadas =  ChronoUnit.DECADES.between(LocalDate.parse("1985-07-05"), LocalDate.now());
		
		//Retona a quantidade de horas entre as datas passadas
		long meses =  ChronoUnit.MONTHS.between(LocalDate.parse("1985-07-05"), LocalDate.now());
		
		//Retona a quantidade de anos
		long anos =  ChronoUnit.YEARS.between(LocalDate.parse("1985-07-05"), LocalDate.now());
		
		
		System.out.println("Total de dias: "+dias);
		
		System.out.println("Decadas: "+decadas);
		
		System.out.println("Meses: "+meses);
		
		System.out.println("Anos:"+anos );
		
		
	}

}
