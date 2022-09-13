package formacaoJavaWebFullStack.executavelArrayVetor;

public class Matriz {

	public static void main(String[] args) {
		
		int notas[][] = new int[2][3];
		
		notas[0][0]=1;
		notas[0][1]=3;
		notas[0][2]=5;
		
		notas[1][0]=2;
		notas[1][1]=4;
		notas[1][2]=6;

		for(int i =0; i<notas.length;i++) {
			//System.out.println("Linhas na Posição: "+i);
			for(int j=0;j<3;j++) {
				System.out.print("\nLinha: "+i+ " Numero: "+notas[i][j]);
				
			}
			System.out.println();
		}
	}

}
