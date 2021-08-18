package beans;

public class Produto {
	public String descricao;
	public String marca;
	public float valor;
	
	public String detalhe() {
		return "Produto:" + descricao + " - Marca:" + marca; 
	}
}
