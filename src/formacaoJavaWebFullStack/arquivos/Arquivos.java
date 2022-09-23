package formacaoJavaWebFullStack.arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Arquivos {

	public static void main(String[] args) throws IOException {
		
		//Criar o objeto Arquivo e informa o local onde se encontra
		File arquivo = new File("c:\\Arquivos\\texto1.txt");
				
		//Verifica se o arquivo existe e caso negação cria o arquivo
		if (!arquivo.exists()) {
			//Criar o arquivo no local 
			arquivo.createNewFile();
		}
		
		//Objeto para escrever no Arquivo , cria o obejto passando o arquivo
		FileWriter escreverNoArquivo = new FileWriter(arquivo);
		
		//Write - escreve no arquivo
		//escreverNoArquivo.write("Meu texto no Arquivo");
		//escreverNoArquivo.write("\nEscrevendo a segunda Linha");
		//Flush - persiste as alterações 
		//escreverNoArquivo.flush();
		//Close- fecha o arquivo
		//escreverNoArquivo.close();
		
		
		for(int i=1; i<=10;i++) {
			String linha = "Texto da linha: "+ i+"\n";
			escreverNoArquivo.write(linha);
		}
		//Flush - persiste as alterações 
		escreverNoArquivo.flush();
		//Close- fecha o arquivo
		escreverNoArquivo.close();

	}

}
