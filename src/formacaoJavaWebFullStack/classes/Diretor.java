package formacaoJavaWebFullStack.classes;

public class Diretor extends Pessoa{

	private String RegistroEducacao;
	private Integer TempoDirecao;
	private String Titulacao;
		
	public Diretor() {
		}
	
	public Diretor(String registroEducacao, int tempoDirecao, String titulacao) {
		super();
		RegistroEducacao = registroEducacao;
		TempoDirecao = tempoDirecao;
		Titulacao = titulacao;
	}
	
	
	
	@Override
	public String toString() {
		return "Diretor [RegistroEducacao=" + RegistroEducacao + ", TempoDirecao=" + TempoDirecao + ", Titulacao="
				+ Titulacao + ", nome=" + nome + "]";
	}

	public String getRegistroEducacao() {
		return RegistroEducacao;
	}
	public void setRegistroEducacao(String registroEducacao) {
		RegistroEducacao = registroEducacao;
	}
	public Integer getTempoDirecao() {
		return TempoDirecao;
	}
	public void setTempoDirecao(int tempoDirecao) {
		TempoDirecao = tempoDirecao;
	}
	public String getTitulacao() {
		return Titulacao;
	}
	public void setTitulacao(String titulacao) {
		Titulacao = titulacao;
	}
	
	
	
}
