
public class Conta {
	
	String nome; 
	String numero;
	double saldo;
	String tipo; 

	

	void exbir_informacoes(){
		System.out.printf("Cliente: %s \nConta: %s \nSaldo: %.2f \n", nome, numero, saldo);
	}
	
	void sacar(double valor){
		saldo = saldo - valor;
	}
	
	void depositar(double valor) {
		saldo = saldo + valor;
	}
	
	
	

}
