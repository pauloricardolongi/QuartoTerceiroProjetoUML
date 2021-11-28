package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidades.Item_do_Pedido;
import entidades.Produto;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Produto p = new Produto("TV", 1000.00);
		
		Item_do_Pedido ip1 = new Item_do_Pedido(2,1000.00, p);
		
		System.out.println(ip1);
		
		sc.close();
		

	}

}
