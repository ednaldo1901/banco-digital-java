package contabanco;

public interface InterConta {
	void sacar(double valor);
	
	void depositar(double valor);
	
	void transferiri(double valor,Conta contaDestino);
	
	void imprimirExtrato();
}
