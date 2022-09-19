package formacaoJavaWebFullStack.datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class VencimentoDatas {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		
		Calendar calendar = Calendar.getInstance();
		
		Date dataVencimento = simpleDateFormat.parse("25/09/2022");
		
		Date dataAtualHoje = simpleDateFormat.parse("21/09/2022");
		
		//Before: se Data 1 é menor que data 2
		//After : se data 1 é maior que data 2
		
		
		if(dataVencimento.before(dataAtualHoje)) {
			System.out.println("Boleto Já Venceu - URGENTE");
			
			
		}else {
			System.out.println("Boleto não vencido.");
			
		}
		
		
		System.out.println("--------Boleto Vencido--------");
		Date dataVencimento1 = simpleDateFormat.parse("10/09/2022");
		
		if(dataAtualHoje.after(dataVencimento1)) {
			System.out.println("Boleto Já Venceu - URGENTE");
			
			
		}else {
			System.out.println("Boleto não vencido.");
			
		}
		

	}

}
