package formacaoJavaWebFullStack.executavel;

import formacaoJavaWebFullStack.classes.Aluno;

public class EqualsHashCode {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Fagner");
		aluno1.setIdade(30);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Felipe");
		aluno2.setIdade(30);
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Felipe");
		
		
		if(aluno1.getNome().equals(aluno2)
				) {
			System.out.println("Aluno são iguais");
		}else {
			System.out.println("Alunos são diferentes");
		}
		
		
		
		if(aluno3.equals(aluno2)) {
			System.out.println("Alunos são iguais");
		}else {
			System.out.println("Alunos não são iguais");
		}
	}

}
