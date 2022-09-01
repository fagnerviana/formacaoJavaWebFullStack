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
		
		Aluno fagner= new Aluno();
		fagner.setNome("Fagner");
		fagner.setIdade(37);
		fagner.setDataNascimento("05/07/1985");
		fagner.setNumeroRg("111.325.142.444");
		fagner.setNumeroCpf("023.639.875-00");
		fagner.setNomeMae("Rita Santiago");
		fagner.setNomePai("Manoel Souza Viana");
		fagner.setDataMatricula("12/02/2022");
		fagner.setNomeEscola("Escola Java");
		fagner.setSerieMatriculado("RE044710");
		
		
		
		System.out.println("Media da nota é = "+fagner.CalcularMedia());
		
		System.out.println(fagner.AprovadoOuNao()+"Com nota de "+fagner.CalcularMedia());
		
		
		

	}

}
