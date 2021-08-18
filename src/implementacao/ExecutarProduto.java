package implementacao;

import beans.Produto;

public class ExecutarProduto {

	public static void main(String[] args) {
		
		Produto batom = new Produto();
		
		batom.setDescricao("AvonRosa");
		batom.setMarca ("Avon");
		batom.setValor (50.0f);
		
		
		System.out.println(batom.detalhe());
		
		Produto mouse = new Produto();
		
		mouse.setDescricao("Dell touch");
		mouse.setMarca ("Dell");
		mouse.setValor (-150.0f);
		
		
		System.out.println(mouse.detalhe());
		System.out.println("Valor: " + mouse.getValor());
		System.out.println(mouse.getDescricao());
	}

}
