
public class SomadorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Somador s1 = new Somador();
		s1.nome = "S1";
		
		Somador s2 = new Somador();
		s2.nome = "S2";
		
		
		for (int i = 0; i < 3; i++) {
			s1.incrementar();
			s2.incrementar();
		}
		
		
		s1.imprimir();
		s2.imprimir();
		

	}

}
