package formacaoJavaWebFullStack.arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

import formacaoJavaWebFullStack.classes.Aluno;


public class ApachePoiLeitura {

	public static void main(String[] args) throws IOException {
		
		FileInputStream entrada = new FileInputStream(new File("C:\\Arquivos\\planilhaAluno.xls"));
		
		HSSFWorkbook hssfWorkbook = new HSSFWorkbook(entrada);
		HSSFSheet planilha = hssfWorkbook.getSheetAt(0);
		
		Iterator<Row> linhaIterator = planilha.iterator();
		
		List<Aluno> alunoLista = new ArrayList<Aluno>();
		
		while (linhaIterator.hasNext()) {
			Row linha = linhaIterator.next();
			Iterator<Cell> celulas = linha.iterator();
			
			Aluno aluno = new Aluno();
			
			while(celulas.hasNext()) {
				Cell cell = celulas.next();
				
				switch(cell.getColumnIndex()) {
				case 0:
					aluno.setNome(cell.getStringCellValue());
					break;
				case 1:
					aluno.setIdade(Integer.valueOf((int) cell.getNumericCellValue()).intValue());
					break;
				case 2:
					aluno.setNomeEscola(cell.getStringCellValue());
					break;
							
					
				}
				
			}/*Fim das celulas da linha*/
			alunoLista.add(aluno);
		}
		entrada.close();/*Terminou de ler o arquivo excel*/
		
		for(Aluno aluno : alunoLista) {
			System.out.println(aluno.getNome()+aluno.getIdade()+aluno.getNomeEscola());
		}
	}

}
