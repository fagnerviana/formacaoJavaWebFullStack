package formacaoJavaWebFullStack.arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import formacaoJavaWebFullStack.classes.Aluno;

public class ApachePoi {

	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Arquivos\\planilhaAluno.xls");

		if (!file.exists()) {
			file.createNewFile();
		}

		// Criando os objetos Aluno
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

		// Criado a lista de Aluno
		List<Aluno> listaAluno = new ArrayList<Aluno>();
		listaAluno.add(aluno1);
		listaAluno.add(aluno2);
		listaAluno.add(aluno3);
		listaAluno.add(aluno4);

		HSSFWorkbook hssfWorkbook = new HSSFWorkbook();// Vai ser uado para escrver a planilha
		HSSFSheet linhasAluno = hssfWorkbook.createSheet("Planilha de Aluno do Curso");// Criar a planilha

		int numeroLinha = 0;
		//
		for (Aluno p : listaAluno) {
			Row linha = linhasAluno.createRow(numeroLinha++);

			int celula = 0;

			Cell celNome = linha.createCell(celula++);/*Celula 1*/
			celNome.setCellValue(p.getNome());
			
			Cell celidade = linha.createCell(celula++);/*Celula 2*/
			celidade.setCellValue(p.getIdade());
			
			Cell celescola = linha.createCell(celula++);/*Celula 3*/
			celescola.setCellValue(p.getNomeEscola());
			

		} 
		
		FileOutputStream saida = new FileOutputStream(file);
		hssfWorkbook.write(saida); //Acontece o erro aqui
		saida.flush();
		saida.close();
		
		System.out.println("Planilha foi criada com sucesso");
		
	}

}
