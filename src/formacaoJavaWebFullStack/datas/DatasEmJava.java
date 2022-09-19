package formacaoJavaWebFullStack.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		//Instanciando o Calendario
		Calendar calendar = Calendar.getInstance();
		
		//Pacote mas utilizado
		Date dateUtil = new Date();
		System.out.println("Date -Data em milisegundos: "+dateUtil.getTime());
		System.out.println("Calendar - Data em milisegundos: "+calendar.getTimeInMillis());
		
		
		System.out.println("Date - Dia atual: "+dateUtil.getDate());
		System.out.println("Calendar - Dia atual: "+calendar.get(Calendar.DAY_OF_MONTH));
		System.out.println("Date - Mês atual: "+dateUtil.getMonth());
		System.out.println("Calendar - Mês atual: "+calendar.get(calendar.MONTH));
		System.out.println("Date - Date - Ano atual: "+(dateUtil.getYear()+1900));
		System.out.println("Calendar -  ANO atual: "+calendar.getWeekYear());
		System.out.println("Date - Horas atual: "+dateUtil.getHours());
		System.out.println("Calendar - Horas atual: "+calendar.get(calendar.HOUR));
		System.out.println("Date - Minutos"+dateUtil.getMinutes());
		System.out.println("Calendar - Minutos"+calendar.get(calendar.MINUTE));
		System.out.println("Date - Segundos "+dateUtil.getSeconds());
		System.out.println("Calendar - Segundos "+calendar.get(calendar.SECOND));
		
		System.out.println("----------Simples Date Format----------");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm.ss");
		
		
		System.out.println("Data atual em formato padrao e String: "+simpleDateFormat.format(dateUtil));
		System.out.println("Calendar - Data atual em formato padrao e String: "+simpleDateFormat.format(calendar.getTime()));
		
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		
		System.out.println("Date em formato para banco de dados: "+simpleDateFormat.format(dateUtil));
		System.out.println("Calendar - Date em formato para banco de dados: "+simpleDateFormat.format(calendar.getTime()));
		
		//aqui não funcionou
		System.out.println(simpleDateFormat.parse("1987-10-18 18:16.02"));
		

	}

}
