package formacaoJavaWebFullStack.datas;

import java.time.LocalDate;
import java.time.Period;

public class ObjetoPeriodo {

	public static void main(String[] args) {
		LocalDate dataAntiga = LocalDate.of(2020, 2, 7);
		
		LocalDate dataNova = LocalDate.of(2021, 9, 4);
		
		System.out.println("Data Antiga é maior que data nova : "+dataAntiga.isAfter(dataNova));
		System.out.println("Data Antiga é menor que data nova : "+dataAntiga.isBefore(dataNova));
		System.out.println("Datas são iguais : "+dataAntiga.isEqual(dataNova));

		Period periodo = Period.between(dataAntiga, dataNova);
		
		System.out.println("Quantos dias : "+periodo.getDays());
		System.out.println("Quantos meses : "+periodo.getMonths());
		System.out.println("Quantos Anos : "+periodo.getYears());
	}
}
