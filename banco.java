import cadastro.Pessoa;
import modelos.Conta;

public class Banco {

	public static void main(String[] args) {
    //Transações da conta
		Conta a = new Conta("Conta 1");
		System.out.println(a);
		a.depositar(200);
		System.out.println(a);
		a.sacar(150);
		System.out.println(a);

    //Dados
		Pessoa novaPessoa = new Pessoa("André", 18, 1000, "06408688990");
		System.out.println(novaPessoa.getNome());
		System.out.println(novaPessoa.getIDade());
    System.out.println(novaPessoa.getRenda());
    System.out.println(novaPessoa.getCpf());
	}	
}
	
	
