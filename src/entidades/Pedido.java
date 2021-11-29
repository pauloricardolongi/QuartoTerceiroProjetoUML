package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.EstadoPedido;

public class Pedido {
	
	private Date momento;
	private EstadoPedido estado;
	
	private Cliente cliente;
	
	private List<Item_do_Pedido> itens = new ArrayList<Item_do_Pedido>();
	
	public Pedido() {
		
	}

	public Pedido(Date momento, EstadoPedido estado, Cliente cliente) {
		super();
		this.momento = momento;
		this.estado = estado;
		this.cliente = cliente;
	}
	
	

}
