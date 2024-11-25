package contabanco;

public class ContaCorrente extends Conta {
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		
	}

	public void imprimirExtrato() {
		super.extratoInfosConta();
	}

	
}
