package formacaoJavaWebFullStack.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import formacaoJavaWebFullStack.classes.Aluno;

public class LerArquivos {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Lista de Aluno
		List<Aluno> alunoLista= new ArrayList<Aluno>();
		
		//Leitura de arquivos no local indicado.
		FileInputStream entradaArquivo = new FileInputStream(new File("C:\\Arquivos\\aluno.csv"));

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8");

		while (lerArquivo.hasNext()) {

			String linha = lerArquivo.nextLine();
			//System.out.println(linha);

			if (linha!= null && !linha.isEmpty()) {
				String [] dados = linha.split("\\;");
				Aluno aluno = new Aluno();
				aluno.setNome(dados[0]);
				aluno.setIdade(Integer.parseInt(dados[1]));
				aluno.setNomeEscola(dados[2]);
				
				alunoLista.add(aluno);
				
				
			}
		}
		
		for (Aluno aluno : alunoLista) {
		System.out.println("Nome do aluno: "+aluno.getNome()+" Idade: "+aluno.getIdade()+" Nome da Escola: "+aluno.getNomeEscola()+"\n");
		//System.out.println(aluno);
		}

	}
}
