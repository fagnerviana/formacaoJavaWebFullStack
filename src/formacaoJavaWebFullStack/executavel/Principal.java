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
		fagner.setNota1(70.0);
		fagner.setNota2(83.2);
		fagner.setNota3(90.10);
		fagner.setNota4(60.50);
		
		Aluno odete= new Aluno();
		odete.setNome("Fagner");
		odete.setIdade(37);
		odete.setDataNascimento("05/07/1985");
		odete.setNumeroRg("111.325.142.444");
		odete.setNumeroCpf("023.639.875-00");
		odete.setNomeMae("Rita Santiago");
		odete.setNomePai("Manoel Souza Viana");
		odete.setDataMatricula("12/02/2022");
		odete.setNomeEscola("Escola Java");
		odete.setSerieMatriculado("RE044710");
		odete.setNota1(40.0);
		odete.setNota2(50.2);
		odete.setNota3(35.10);
		odete.setNota4(60.50);
		
		System.out.println("Media da nota é = "+fagner.CalcularMedia());
		
		System.out.println(fagner.AprovadoOuNao()+"Com nota de "+fagner.CalcularMedia());
		
		System.out.println(odete.AprovadoOuNao()+"Com nota de "+odete.CalcularMedia());
		

	}

}
