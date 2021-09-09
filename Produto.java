
public class Produto {

	String nome;
	static int quantidade = 0;
	double preco;
	String marca;
	String id_cod_barra;
	
	Produto(String name, double prec, String marc, String id){
		nome = name;
		preco = prec;
		marca = marc;
		id_cod_barra = id;
		quantidade = quantidade + 1;
		}
	  
	Produto (String name, String id){
		nome = name;
		id_cod_barra = id;
		quantidade++;
	}
	

	  void adicionar_ao_estoque(int qtd) {

	    quantidade += qtd;
	    System.out.printf("Produto adicionado ao estoque! Quantidade atual: %d unidades \n", quantidade);
	  }

	  void retirar_do_estoque() {

	    if(quantidade > 0){

	      quantidade--;
	      System.out.printf("Produto retirado do estoque! Restam: %d unidades \n", quantidade);
	    }
	    else
	      System.out.printf("Produto em falta no estoque \n");
	  }


	
	
	
}
