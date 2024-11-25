package contabanco;

public class Main {

	public static void main(String[] args) {
		Cliente ednaldo = new Cliente();
		ednaldo.setNome("ednaldo R Oliveira");
		ednaldo.setCpf("103.457.983.42");
		
		Conta cc = new ContaCorrente(ednaldo);
		cc.depositar(100);
		Conta poupanca = new ContaPoupanca(ednaldo);
		
		cc.extratoInfosConta();
		poupanca.extratoInfosConta();
		poupanca.depositar(200);
		
		poupanca.extratoInfosConta();


	}
}