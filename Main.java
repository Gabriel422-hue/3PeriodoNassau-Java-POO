
public class Main {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.nome = "Maria"; 
		conta.numero = "25555"; 
		conta.saldo = 1500;
		conta.tipo = "Corrente";

		conta.exbir_informacoes();
		conta.sacar(500);
		conta.exbir_informacoes();
		conta.depositar(2000);
		conta.exbir_informacoes();
		
		
		
		
		
		
		
		
		
		
		
		/**
		Conta conta1 = new Conta();

		conta1.nome = "Jose";
		conta1.numero = "25338";
		conta1.saldo = 1000.0;
		conta1.tipo = "Corrente";

		conta1.exbir_informacoes();

		Conta conta2 = new Conta();
		conta2.nome = "Gabriel";
		conta2.numero = "13500";
		conta2.saldo = 1800.0;
		conta2.tipo = "Poupança";

		conta2.exbir_informacoes();

		// System.out.printf("Cliente: %s \nConta: %s \nSaldo: %.2f",
		// conta1.nome,conta1.numero,conta1.saldo);

		// Construir um algoritmo para exibir as inf. da conta dos clientes.

		/**
		 * String nome1, nome2; String conta1, conta2; double saldo1, saldo2;
		 * 
		 * nome1 = "Jose Silva"; nome2 = "Maria dos Santos";
		 * 
		 * conta1 = "22351"; conta2 = "55224";
		 * 
		 * saldo1 = 100.0; saldo2 = 200.0;
		 * 
		 * System.out.printf("Cliente: %s \nConta: %s \nSaldo: %.2f\n", nome1, conta1,
		 * saldo1); System.out.printf("Cliente: %s \nConta: %s \nSaldo: %.2f", nome2,
		 * conta2, saldo2);
		 */

	}
}