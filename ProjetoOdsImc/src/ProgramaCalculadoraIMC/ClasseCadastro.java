package ProgramaCalculadoraIMC;

public class ClasseCadastro {

	private String nome;
	private int idade;
	private String g�nero;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int string) {
		this.idade = string;
	}
	public String getG�nero() {
		return g�nero;
	}
	public void setG�nero(String g�nero) {
		this.g�nero = g�nero;
	}
	public void Impressao() {
		System.out.println("\t===============INFORMA��ES DO USU�RIO================\n"
				+ "\n\tNome: " + nome + "\n\tIdade: " + idade + " anos"
				+ "\n\tG�nero: " + g�nero 
				+ "\n\t====================================================="); 
    }
}
