package formacaoJavaWebFullStack.classes;

import java.util.Objects;

//Classe Aluno
public class Aluno {
	
	//Atributos da Classe Aluno
	private String nome;
	private int idade;
	private String dataNascimento;
	private String numeroRg;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	private Disciplina disciplina = new Disciplina(dataMatricula, idade, idade, idade, idade); 
	
	
	// Construtor Aluno
	public Aluno() {
		
	}
	
	public Aluno(String nome) {
		this.nome=nome;
	}
	// Construtor Aluno - com atributos especificos
	public Aluno(String nome, int idade,String serieMatricula) {
		this.nome = nome;
		this.idade=idade;
		this.serieMatriculado =serieMatricula;
		
   }
	
	public double CalcularMedia() {
	
		return (disciplina.getNota1()+disciplina.getNota2()+disciplina.getNota3()+disciplina.getNota4())/4;
	}
	
	public String AprovadoOuNao() {
		if(CalcularMedia()>50.0) {
			return "Aprovado";
		}else {
			return "Reprovado";
		}
		
	}
	
	
	
	
	public Aluno(String nome, int idade, String dataNascimento, String numeroRg, String numeroCpf, String nomeMae,
			String nomePai, String dataMatricula, String nomeEscola, String serieMatriculado, Disciplina disciplina) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.numeroRg = numeroRg;
		this.numeroCpf = numeroCpf;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.dataMatricula = dataMatricula;
		this.nomeEscola = nomeEscola;
		this.serieMatriculado = serieMatriculado;
		this.disciplina = disciplina;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", numeroRg="
				+ numeroRg + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + ", disciplina=" + disciplina + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(dataMatricula, dataNascimento, disciplina, idade, nome, nomeEscola, nomeMae, nomePai,
				numeroCpf, numeroRg, serieMatriculado);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(dataMatricula, other.dataMatricula)
				&& Objects.equals(dataNascimento, other.dataNascimento) && Objects.equals(disciplina, other.disciplina)
				&& idade == other.idade && Objects.equals(nome, other.nome)
				&& Objects.equals(nomeEscola, other.nomeEscola) && Objects.equals(nomeMae, other.nomeMae)
				&& Objects.equals(nomePai, other.nomePai) && Objects.equals(numeroCpf, other.numeroCpf)
				&& Objects.equals(numeroRg, other.numeroRg) && Objects.equals(serieMatriculado, other.serieMatriculado);
	}
	
	//Metodos GET e SET
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getNumeroRg() {
		return numeroRg;
	}

	public void setNumeroRg(String numeroRg) {
		this.numeroRg = numeroRg;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
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

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
	
		
}
