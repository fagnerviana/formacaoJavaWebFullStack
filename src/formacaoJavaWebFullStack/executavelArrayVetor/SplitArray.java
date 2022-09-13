package formacaoJavaWebFullStack.executavelArrayVetor;

public class SplitArray {

	public static void main(String[] args) {
		
		String texto = "Fagner,JAVA,80,95,78";
		String[] valoresArray = texto.split(",");
		
		
		for(int i =0 ; i<valoresArray.length;i++) {
			System.out.println("Posição: "+i+"- "+ valoresArray[i]);	
		}
		
	
	}
}
