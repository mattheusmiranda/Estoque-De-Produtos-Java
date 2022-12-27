package pxt.api.estoqueprodutos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tela {
	public static void main(String[] args) {

		List<Cidade> ListaCidades = new ArrayList<>();
		List<Produto> ListaProdutos = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		Produto Produto1 = new Produto();
		Produto Produto2 = new Produto();
		Produto Produto3 = new Produto();
		Produto Produto4 = new Produto();

		Cidade verificarCidade = new Cidade();
		Cidade Cidade2 = new Cidade();
		Cidade Cidade3 = new Cidade();

		Produto1.setNomeProduto("Memoria ram 8gb");
		Produto1.setPreco(110.90);
		Produto1.setCodigoProduto(704);
		ListaProdutos.add(Produto1);

		Produto2.setNomeProduto("Gabinete");
		Produto2.setPreco(300.00);
		Produto2.setCodigoProduto(898);
		ListaProdutos.add(Produto2);

		Produto3.setNomeProduto("Placa mãe");
		Produto3.setPreco(889.90);
		Produto3.setCodigoProduto(127);
		ListaProdutos.add(Produto3);

		Produto4.setNomeProduto("Processador ryzen 5");
		Produto4.setPreco(990.90);
		Produto4.setCodigoProduto(153);
		ListaProdutos.add(Produto4);

		verificarCidade.setNomeCidades("Uberlândia");
		verificarCidade.setFreteCidades(87.50);

		Cidade2.setNomeCidades("Salvador");
		Cidade2.setFreteCidades(92.00);

		Cidade3.setNomeCidades("Brasilia");
		Cidade3.setFreteCidades(75.40);

		ListaCidades.add(verificarCidade);
		ListaCidades.add(Cidade2);
		ListaCidades.add(Cidade3);

		// MENU/ESCOLHA DE PRODUTO
		System.out.println("---------NOSSOS PRODUTOS---------\n");

		System.out.println("Produto 1: " + Produto1.getNomeProduto() + "\ncodigo: " + Produto1.getCodigoProduto()
				+ "\nPreço: " + Produto1.getPreco() + "\n");
		System.out.println("Produto 2: " + Produto2.getNomeProduto() + "\ncodigo: " + Produto2.getCodigoProduto()
				+ "\nPreço: " + Produto2.getPreco() + "\n");
		System.out.println("Produto 3: " + Produto3.getNomeProduto() + "\ncodigo: " + Produto3.getCodigoProduto()
				+ "\nPreço: " + Produto3.getPreco() + "\n");
		System.out.println("Produto 4: " + Produto4.getNomeProduto() + "\ncodigo: " + Produto4.getCodigoProduto()
				+ "\nPreço: " + Produto4.getPreco() + "\n");

		System.out.println("Codigo do produto para enviar para o cliente: ");
		int codigoProdutoParaEnvio = sc.nextInt();

		for (Produto codValidacao : ListaProdutos) {
			if (ListaProdutos.contains(codValidacao)) {
				break;
			} else {
				System.out.println("Produto nao encontrado");
			}
		}

		// EXPECIFICAÇÕES DO PEDIDO

		System.out.println("\nQuantos produtos são? ");
		int quantidadeProduto = sc.nextInt();

		Produto numeroDeProdutos = new Produto();
		numeroDeProdutos.setQtddProdutos(quantidadeProduto);

		System.out.println("\nCidades em que entregamos: ");
		System.out.println(ListaCidades);
		System.out.println("\nQual a cidade para o envio? ");
		String cidadeParaEnvio = sc.next();

		// Frete cidades

		for (Cidade verificarCidades : ListaCidades) {
			if (verificarCidades.getNomeCidades().equals(cidadeParaEnvio)) {
				System.out.println(
						"Frete para " + verificarCidades.getNomeCidades() + ": " + verificarCidades.getFreteCidades());
				break;
			}
		}

		// Produto com desconto
		if (quantidadeProduto >= 4) {

			for (Produto produtos : ListaProdutos) {
				if (codigoProdutoParaEnvio == produtos.getCodigoProduto()) {
					double precoComDesconto = operacaoDesconto(produtos.getPreco(), quantidadeProduto);
					produtos.setPrecoPosDesconto(precoComDesconto);

					for (Cidade cidade : ListaCidades) {
						if (cidade.getNomeCidades().equals(cidadeParaEnvio)) {
							double valTotal = Produto1.getPrecoPosDesconto() * quantidadeProduto
									+ cidade.getFreteCidades();
							System.out.println("Valor total com o frete: " + valTotal);
						}
					}
				}
			}

		} else { // Produto sem desconto
			for (Produto produtos : ListaProdutos) {
				if (codigoProdutoParaEnvio == produtos.getCodigoProduto()) {
					double precoSemDesconto = Produto1.getPreco() * quantidadeProduto;
					Produto1.setPrecoPosDesconto(precoSemDesconto);

					for (Cidade cidade : ListaCidades) {
						if (cidade.getNomeCidades().equals(cidadeParaEnvio)) {
							double valTotal = Produto1.getPrecoPosDesconto() * quantidadeProduto
									+ cidade.getFreteCidades();
							System.out.println("Valor total com o frete: " + valTotal);
						}
					}
				}
			}
		}
		System.out.println("Produto esta indo para a transportadora ");
	}

	// METODO
	public static double operacaoDesconto(double valProduto, double valQuantidade) {
		double valorDoDesconto = valProduto * 0.15;
		double precoProdutoComDesconto = valProduto - valorDoDesconto;
		System.out.println("Valor do produto com desconto: " + precoProdutoComDesconto);
		return precoProdutoComDesconto;
	}
}