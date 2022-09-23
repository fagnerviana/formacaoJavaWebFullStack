package formacaoJavaWebFullStack.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import formacaoJavaWebFullStack.classes.Aluno;

public class ArquivoAluno {

	public static void main(String[] args) throws IOException {
		//Criando arquivo de texto
		//File arquivoAluno =new File("c:\\Arquivos\\aluno.csv");
		//Criar o objeto Arquivo e informa o local onde se encontra
		File arquivoAluno =new File("c:\\Arquivos\\aluno.csv");
		
		//Verifica se o arquivo existe e caso negação cria o arquivo
		if(!arquivoAluno.exists()) {
			//Criar o arquivo no local 
			arquivoAluno.createNewFile();
		}
		//Objeto para escrever no Arquivo , cria o obejto passando o arquivo
		FileWriter escreverNoArquivo = new FileWriter(arquivoAluno);
		
		//Criando os objetos Aluno
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Fagner Viana");
		aluno1.setIdade(35);
		aluno1.setNomeEscola("Java EAD");
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Roberto Santos");
		aluno2.setIdade(25);
		aluno2.setNomeEscola("UFBA");
		
		Aluno aluno3 = new Aluno();
		aluno3.setNome("Jaqueline");
		aluno3.setIdade(36);
		aluno3.setNomeEscola("ICEIA");
		
		Aluno aluno4 = new Aluno();
		aluno4.setNome("Josue Kenny");
		aluno4.setIdade(40);
		aluno4.setNomeEscola("Java EAD");
		
		//Criado a lista de Aluno 
		List<Aluno> listaAluno = new ArrayList<Aluno>();
		listaAluno.add(aluno1);
		listaAluno.add(aluno2);
		listaAluno.add(aluno3);
		listaAluno.add(aluno4);

		//Percorrendo a lista Aluno
		for (Aluno aluno : listaAluno) {
			escreverNoArquivo.write(aluno.getNome()+";"+aluno.getIdade()+";"+aluno.getNomeEscola()+";\n");
		}
		
		//Flush - persiste as alterações 
		escreverNoArquivo.flush();
		//Close- fecha o arquivo
		escreverNoArquivo.close();
		
	}

}
