package entidades;

public class Item_do_Pedido {
	private Integer quantidade;
	private Double preco;
	
	private Produto produto;

	public Item_do_Pedido() {
		
	}

	public Item_do_Pedido(Integer quantidade, Double preco, Produto produto) {
		
		this.quantidade = quantidade;
		this.preco = preco;
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double subTotal() {
		return preco * quantidade;
	}

	@Override
	public String toString() {
		return getProduto().getNome()
				+ ",Valor da unidade: $"
				+ String.format("%.2f", preco)
				+ ", Quantidade: "
				+ quantidade
				+ ", subTotal: $"
				+ String.format("%.2f", subTotal());
				
	}
	

}
