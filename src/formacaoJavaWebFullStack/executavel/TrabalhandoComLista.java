package formacaoJavaWebFullStack.executavel;

import java.lang.invoke.LambdaConversionException;

import javax.swing.JOptionPane;

import formacaoJavaWebFullStack.classes.Aluno;
import formacaoJavaWebFullStack.classes.Disciplina;

public class TrabalhandoComLista {

	public static void main(String[] args) {
		
		//Instaciar as disciplinas
		/*
		Disciplina disciplina1 = new Disciplina();
		disciplina1.setNome("Matematica");
		disciplina1.setNota(75.5);
		
        Disciplina disciplina2 = new Disciplina();
		disciplina2.setNome("Portugues");
		disciplina2.setNota(60.6);

		Disciplina disciplina3 = new Disciplina();
		disciplina3.setNome("Fisica");
		disciplina3.setNota(70.4);

		Disciplina disciplina4 = new Disciplina();
		disciplina4.setNome("Inglês");
		disciplina4.setNota(85.4);
		*/
		
		Aluno fagner = new Aluno();
		
		fagner.setNome("Fagner");
		
		for(int i=0;i<4;i++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Favor Difite o nome Disciplina");
			double notaDisciplina = Double.parseDouble(JOptionPane.showInputDialog("Informe a nota da Disciplina"+nomeDisciplina));
			
			Disciplina disciplina = new Disciplina();
			disciplina.setNome(nomeDisciplina);
			disciplina.setNota(notaDisciplina);
			
			fagner.getDisciplinas().add(disciplina);
		}
		
		System.out.println(fagner.CalcularMedia());
		
		System.out.println(fagner.getNome()+"\n");
		System.out.println(fagner.getDisciplinas());	
		
		

	}

}
