package formacaoJavaWebFullStack.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

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
		
		
	}

}
