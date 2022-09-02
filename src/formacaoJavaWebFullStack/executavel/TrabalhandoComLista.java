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
		
		System.out.println("A média do aluno: "+fagner.CalcularMedia());
		System.out.println("O nome do aluno: "+fagner.getNome()+"\n");
		System.out.println("Disciplina: "+fagner.getDisciplinas());
		
		System.out.println("Resultado Final: "+fagner.Resultado());
		
		System.out.println();
		 int op=JOptionPane.showConfirmDialog(null, "Gostaria de Exclcui alguma Disciplina ?");
		
		 if(op==0) {
			 System.out.println("Escolha o numero conforme a disciplina descrita");
			 
			 for (int i=0; i<fagner.getDisciplinas().size();i++) {
				 
				System.out.println("Numero: "+i+ fagner.getDisciplinas().get(i));
				
		}
			 
			 int remove = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero conforme a Disciplina para remover"));
			 fagner.getDisciplinas().remove(remove);
		 
		}
		
		 System.out.println("Apos exclusão da Disciplina");
		 for (int i=0; i<fagner.getDisciplinas().size();i++) {
			 
				System.out.println("Numero: "+i+ fagner.getDisciplinas().get(i));
				
		} 

	}

}
