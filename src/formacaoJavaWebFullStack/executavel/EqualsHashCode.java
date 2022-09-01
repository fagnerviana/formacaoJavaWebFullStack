package formacaoJavaWebFullStack.executavel;

import formacaoJavaWebFullStack.classes.Aluno;

public class EqualsHashCode {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Fagner");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Felipe");
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Aluno são iguais");
		}else {
			System.out.println("Alunos são diferentes");
		}
		
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Felipe");
		if(aluno3.equals(aluno2)) {
			System.out.println("Alunos tem o mesmo nome");
		}else {
			System.out.println("Alunos não tem o mesmo nome");
		}
	}

}
