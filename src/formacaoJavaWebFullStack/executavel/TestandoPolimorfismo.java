package formacaoJavaWebFullStack.executavel;

import formacaoJavaWebFullStack.classes.Aluno;
import formacaoJavaWebFullStack.classes.Diretor;
import formacaoJavaWebFullStack.classes.Pessoa;
import formacaoJavaWebFullStack.classes.Secretario;

public class TestandoPolimorfismo {

	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Fagner");
		aluno1.setNomeEscola("JavaWeb");
		aluno1.setNomeMae("Rita");
		aluno1.setIdade(20);
				
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Roberto");
		aluno2.setNomeEscola("UFBA");
		aluno2.setNomeMae("Maria");
		aluno2.setIdade(16);
		
		Diretor diretor1 = new Diretor();
		diretor1.setNome("Fausto");
		diretor1.setIdade(40);
		diretor1.setRegistroEducacao("123456789AB");
		
		Diretor diretor2 = new Diretor();
		diretor2.setNome("Vinicius");
		diretor2.setIdade(32);
		diretor2.setRegistroEducacao("qweasd1452");
		
		Secretario secretario = new Secretario();
		secretario.setNome("Jaime");
		secretario.setNumeroCpf("023656879as");
		secretario.setIdade(23);
		
		//Realizando polimorfimo Filha para Pai 
		Pessoa pessoa1 = new Aluno();
		pessoa1 = secretario;
		pessoa1 = diretor2;
		
		
	}
	

}
