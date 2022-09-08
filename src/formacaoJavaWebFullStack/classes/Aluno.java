package formacaoJavaWebFullStack.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import formacaoJavaWebFullStack.constantes.StatusAluno;

//Classe Aluno
public class Aluno extends Pessoa {

	// Atributos da Classe Aluno
	// private Pessoa pessoa = new Pessoa();
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

	//Metodos da classe pai Pessoa 
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1400.00;
	}
	
	// Construtor Aluno
	public Aluno() {
		super();
	}

	// Construtor Aluno - com atributos especificos
	public Aluno(Pessoa pessoa, String dataMatricula, String nomeEscola, String serieMatriculado,
			List<Disciplina> disciplinas) {
		super();
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.serieMatriculado = serieMatriculado;
		this.disciplinas = disciplinas;
	}

	public Aluno(String nome, int idade, String dataNascimento, String numeroRg, String numeroCpf, String nomeMae,
			String nomePai, String dataMatricula, String nomeEscola, String serieMatriculado,
			List<Disciplina> disciplinas) {
		super(nome, idade, dataNascimento, numeroRg, numeroCpf, nomeMae, nomePai);
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.serieMatriculado = serieMatriculado;
		this.disciplinas = disciplinas;
	}

	
	//Metodos da Aluno
	@Override
	public String pessoaMaiorIdade() {
		// TODO Auto-generated method stub
		return super.pessoaMaiorIdade();
	}
	
	public double CalcularMedia() {

		double soma = 0.0;

		for (Disciplina disciplina : disciplinas) {
			soma += disciplina.getNota();
		}

		return soma / disciplinas.size();
	}

	public String Resultado() {

		if (CalcularMedia() >= 50.00) {
			return StatusAluno.APROVADO;
		} else {
			return StatusAluno.REPROVADO;
		}

	}

	public Aluno(String dataMatricula, String nomeEscola, String serieMatriculado, List<Disciplina> disciplinas) {
		super();
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.serieMatriculado = serieMatriculado;
		this.disciplinas = disciplinas;
	}
	
	

	@Override
	public String toString() {
		return "Aluno [dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplinas=" + disciplinas + ", nome=" + nome + ", nomeMae=" + nomeMae + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dataMatricula, disciplinas, nomeEscola, serieMatriculado);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula) && Objects.equals(disciplinas, other.disciplinas)
				&& Objects.equals(nomeEscola, other.nomeEscola)
				&& Objects.equals(serieMatriculado, other.serieMatriculado);
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	

}
