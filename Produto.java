package pxt.api.estoqueprodutos;

import java.time.LocalDate;


public class Produto {
	private double preco;
	private String nomeProduto;
	private int codigoProduto;
	private LocalDate dataPedido =  LocalDate.now();
	private int qtddProdutos;
	private double precoPosDesconto;
	
	public int getCodigoProduto() {
		return codigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		this.codigoProduto = codigoProduto;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	// desconto
	public double getPrecoPosDesconto() {
		return precoPosDesconto;
	}
	public void setPrecoPosDesconto(double precoPosDesconto) {
		this.precoPosDesconto = precoPosDesconto;
	}
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	
	
	public LocalDate getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(LocalDate dataPedido) {
		this.dataPedido = dataPedido;
	}
	
	
	public int getQtddProdutos() {
		return qtddProdutos;
	}
	public void setQtddProdutos(int qtddProdutos) {
		this.qtddProdutos = qtddProdutos;
	}
}