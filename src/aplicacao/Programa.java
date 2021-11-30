package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidades.Cliente;
import entidades.Item_do_Pedido;
import entidades.Pedido;
import entidades.Produto;
import entidades.enums.EstadoPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
			
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//1
		System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome");
		String nome = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		System.out.print("Data de nascimento(DD/MM/YYYY): ");
		Date dataNascimento= sdf.parse(sc.next());		
		Cliente cliente= new Cliente(nome, email, dataNascimento);
		
		//2
		System.out.println("Entre com os dados do Pedido:");
		System.out.print("Status: ");
		EstadoPedido estado = EstadoPedido.valueOf(sc.next());
		
		//3
		 //Pedido associado ao Cliente
		Pedido pedido = new Pedido(new Date(), estado, cliente);
		System.out.print("Quantos itens o pedido vai ter");
		
		int N = sc.nextInt();
		for (int i=0; i<N; i++) {
			System.out.println("Entre #" + (i+1) + "xxxxxxxxx");
			System.out.print("Nome do Produto:");
			sc.nextLine();
			String nomeProduto = sc.nextLine();
			System.out.print("Preço do Produto:");
			double precoProduto= sc.nextDouble();
			System.out.print("Quantidade:");
			int quantidade = sc.nextInt();
			//instanciar o Produto
			Produto produto = new Produto(nomeProduto, precoProduto);
			//instanciar o Item_dePedido associado a este produto
			Item_do_Pedido ip = new Item_do_Pedido(quantidade, precoProduto, produto);
			//adicionar Item_do_Pedido dentro da lista do meu Pedido
			//instanciar Pedido antes do for
		pedido.addItem(ip);
			
		}
		System.out.println();
		System.out.println(pedido);
		
		
		sc.close();
		

	}

}
