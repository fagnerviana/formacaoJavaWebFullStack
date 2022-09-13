package formacaoJavaWebFullStack.executavelArrayVetor;

import java.util.Arrays;
import java.util.List;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "Fagner,JAVA,80,95,78";
		String[] valoresArray = texto.split(",");
		
		
		
		System.out.println(" String para Arrays ");
		for(int i =0 ; i<valoresArray.length;i++) {
			System.out.println("Posição: "+i+"- "+ valoresArray[i]);	
		}
		
		//Convertendo um Array em uma lista
		
		List<String> list = Arrays.asList(valoresArray);
		
		System.out.println(" Array para Lista ");
		for (String valorString : list) {
			System.out.println(valorString);
		}
		
		
		//Converter Lista para Array
		
		String[]  conversaoArray = list.toArray(new String[list.size()]);
		
		System.out.println(" Lista para Array ");
		System.out.println(conversaoArray);
		
		for(int l=0;l<conversaoArray.length;l++) {
			System.out.println(" "+conversaoArray[l].toUpperCase());
		
		}
		
		
	
	}
}
