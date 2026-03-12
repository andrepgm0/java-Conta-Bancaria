public class Pessoa {

	private String nome;
	private int idade;
	private double renda;
	private String cpf;
	
	public Pessoa (String nome, int idade, double renda, String cpf) {
		this.nome = nome;
		this.idade = idade;
		this.renda = renda;
		this.cpf = cpf;
		
	}

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

	public double getRenda() {
		return renda;
	}

	public void setRenda(double renda) {
		this.renda = renda;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
  
}
