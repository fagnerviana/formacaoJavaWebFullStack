package formacaoJavaWebFullStack.executavel;

import javax.swing.JOptionPane;

import formacaoJavaWebFullStack.classes.Aluno;

public class EntradaDeDados {

	public static void main(String[] args) {
		

		Aluno fagner= new Aluno();
		fagner.setNome(JOptionPane.showInputDialog("Qual o nome do Aluno ?"));
		fagner.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Favor digitar a idade do aluno: "+fagner.getNome())));
		fagner.setDataNascimento(JOptionPane.showInputDialog("Qual a data de Nascimento do aluno: "+fagner.getNome()));
		fagner.setNumeroRg(JOptionPane.showInputDialog("Favor digitar o numero do RG de "+fagner.getNome()));
		fagner.setNumeroCpf(JOptionPane.showInputDialog("Digite o numero de CPF de"+fagner.getNome()));
		fagner.setNomeMae(JOptionPane.showInputDialog("Nome da mãe do aluno"+fagner.getNome()));
		fagner.setNomePai(JOptionPane.showInputDialog("Qual o nome do pai do aluno: "+fagner.getNome()));
		fagner.setDataMatricula(JOptionPane.showInputDialog("Data da matricula do aluno:"+fagner.getNome()));
		fagner.setNomeEscola(JOptionPane.showInputDialog("Qual o nome do curso que se encontra matriculado o aluno:"+fagner.getNome()));
		fagner.setSerieMatriculado(JOptionPane.showInputDialog("Qual o numero da matricula do aluno: "+fagner.getNome()));
		fagner.setNota1(Double.parseDouble(JOptionPane.showInputDialog("Primeira nota do aluno: "+fagner.getNome())));
		fagner.setNota2(Double.parseDouble(JOptionPane.showInputDialog("Segunda nota do aluno: "+fagner.getNome())));
		fagner.setNota3(Double.parseDouble(JOptionPane.showInputDialog("Terceira nota do aluno: "+fagner.getNome())));
		fagner.setNota4(Double.parseDouble(JOptionPane.showInputDialog("Quarta nota do aluno: "+fagner.getNome())));
		
		System.out.println(fagner.toString());
		System.out.println("Aluno: "+fagner.getNome()+fagner.AprovadoOuNao()+"Com nota de "+fagner.CalcularMedia());
		

	}

}
