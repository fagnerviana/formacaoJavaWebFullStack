package formacaoJavaWebFullStack.executavel;

import javax.swing.JOptionPane;

import formacaoJavaWebFullStack.classes.Aluno;

public class UtilizandoDuasObjetos {
	
	
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		aluno1.setNome(JOptionPane.showInputDialog("Qual o nome do ALuno ?"));
		aluno1.getDisciplina().setNome(JOptionPane.showInputDialog("Qual o nome da disciplina "));
		aluno1.getDisciplina().setNota1(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 1 da Disciplina: "+aluno1.getDisciplina().getNome()+" Do aluno: "+aluno1.getNome())));
		aluno1.getDisciplina().setNota2(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 2 da Disciplina: "+aluno1.getDisciplina().getNome()+" Do aluno: "+aluno1.getNome())));
		aluno1.getDisciplina().setNota3(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 3 da Disciplina: "+aluno1.getDisciplina().getNome()+" Do aluno: "+aluno1.getNome())));
		aluno1.getDisciplina().setNota4(Double.parseDouble(JOptionPane.showInputDialog("Digite a nota 4 da Disciplina: "+aluno1.getDisciplina().getNome()+" Do aluno: "+aluno1.getNome())));
		
		System.out.println(aluno1.AprovadoOuNao());
		


	}

}
