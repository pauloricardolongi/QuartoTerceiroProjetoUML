package aplicacao;

import entidades.Item_do_Pedido;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Produto p = new Produto("TV", 1000.00);
		
		Item_do_Pedido ip1 = new Item_do_Pedido(1,1000.00, p);
		
		System.out.println(ip1.getPreco());
		

	}

}
