package implementacao;

import beans.Produto;

public class ExecutarProduto {

	public static void main(String[] args) {
		
		Produto batom = new Produto();
		
		batom.descricao = "AvonRosa";
		batom.marca = "Avon";
		batom.valor = 50.0f;
		
		System.out.println("O produto é: " + batom.descricao);
		System.out.println("O valor é: " + batom.valor);
	}

}
