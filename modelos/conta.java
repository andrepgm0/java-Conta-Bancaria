public class Conta {

	private String conta;
	private double saldo;
	
	public Conta (String conta) {
		saldo = 0;
		this.conta = conta;
	}
	
	public void depositar (double deposito) {
		saldo += deposito;
	}
	
	public void sacar (double sacar) {
		if(sacar > saldo) {
			System.out.println("Erro");
		} else {
			saldo -= sacar;
		}
	}
	
	public String toString () {
		return "Saldo: " + saldo;
	}
}
