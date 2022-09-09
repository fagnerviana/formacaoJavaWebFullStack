package formacaoJavaWebFullStack.executavelArrayVetor;

import formacaoJavaWebFullStack.classes.Aluno;

public class Inicial {

	public static void main(String[] args) {
		//Array pode ser do tipo dados e objetos tambem 
		
		//criação de array com os numeros das posções
		double notasAluno[] = new double[3];
		
		double precos[] = {5.5,18.5,42.5,78.5};
		
		for(int j=0;j<precos.length;j++) {
			System.out.println("Na posição: "+j+" o preço é: "+precos[j]);
		
		}
		//atribuir valor nas posições do arrays
		notasAluno[0]=5.5;
		notasAluno[1]=6.0;
		notasAluno[2]=8.4;
		double soma=0;
		for(int i=0;i<notasAluno.length;i++) {
			System.out.println("Na posição: "+i+" a nota é: "+notasAluno[i]);
			
			soma+=notasAluno[i];

		}
		
		System.out.println(soma);
		/*
		
		//Array de objetos
		Aluno[] aluno = new Aluno[1];
		aluno[0].setNome("Fagner");
		aluno[0].setIdade(35);
		aluno[0].setNumeroRg("123456798");
		
		System.out.println(aluno[0].getNome());
		//System.out.println(aluno[0].getIdade());
		//System.out.println(aluno[0].getNumeroRg());		
		*/
		}
	}



