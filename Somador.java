public class Somador {
	
	String nome;
	int countInst = 0;
	
	
	static int countStatic = 0;
	
	
	void incrementar() {
		countInst++;
		countStatic++;
	}
	
	void imprimir() {
		System.out.printf("O somador %s , tem inst�ncia %d e valor est�tico %d", nome, countInst, countStatic);
	}
	
	
		
}
