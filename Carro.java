
public class Carro {
	
	String marca;
	String modelo;
	String cor;
	double velocidadeAtual;
	
	void exibir_informacoes(){
		System.out.printf("O Carro de marca: %s\n Modelo: %s\n De cor: %s\n Estava a KM %.2f\n", marca,modelo,cor,velocidadeAtual);
	}
	
	void acelerar(double acelerou){
		velocidadeAtual = velocidadeAtual + acelerou;
		
	}

}
