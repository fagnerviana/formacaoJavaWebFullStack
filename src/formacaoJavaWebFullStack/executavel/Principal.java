package formacaoJavaWebFullStack.executavel;

import formacaoJavaWebFullStack.classes.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		/*Obejto ainda não existe na memoria*/
		Aluno aluno;
		
		/*Agora temos um objeto real na memoria*/
		aluno = new Aluno("Maria");
		aluno.setIdade(30);
		
		/*Construindo o objeto com os seus atributos*/
		Aluno aluno2 = new Aluno("Fagner",37,"re044710");
		
		System.out.println(aluno2.getNome().toLowerCase() + aluno2.getIdade());
		
		System.out.println(aluno.getNome());
		
		
		

	}

}
