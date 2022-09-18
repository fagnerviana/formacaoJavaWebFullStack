package formacaoJavaWebFullStack.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DatasEmJava {

	public static void main(String[] args) throws ParseException {
		
		//Pacote mas utilizado
		Date dateUtil = new Date();
		System.out.println("Dia atual: "+dateUtil.getDay());
		System.out.println("Mês: "+dateUtil.getMonth());
		System.out.println("Ano: "+(dateUtil.getYear()+1900));
		System.out.println("Horas: "+dateUtil.getHours());
		System.out.println("Minutos"+dateUtil.getMinutes());
		System.out.println("Segundos "+dateUtil.getSeconds());
		
		System.out.println("----------Simples Date Format----------");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyy HH:mm.ss");
		
		System.out.println("Data atual em formato padrao e String: "+simpleDateFormat.format(dateUtil));
		
		simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Date em formato para banco de dados: "+simpleDateFormat.format(dateUtil));
		
		//aqui não funcionou
		System.out.println(simpleDateFormat.parse("1987-10-18 18:16.02"));
		

	}

}
