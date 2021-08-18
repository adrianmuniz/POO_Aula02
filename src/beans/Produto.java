package beans;

public class Produto {
	private String descricao;
	public String marca;
	public float valor;
	
	// getters e setters
	
	//setters = acessar, atribuir
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	// getters = retornar
	public String getDescricao() {
		return descricao;
	}
	
	public String detalhe() {
		return "Produto:" + descricao + " - Marca:" + marca; 
	}
}
