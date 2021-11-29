package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.EstadoPedido;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
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

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public EstadoPedido getEstado() {
		return estado;
	}

	public void setEstado(EstadoPedido estado) {
		this.estado = estado;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void addItem(Item_do_Pedido item) {
		itens.add(item);
	}
	public void removeItem(Item_do_Pedido item) {
		itens.remove(item);
	}
	public double total() {
		double soma = 0.0;
		for (Item_do_Pedido ip : itens) {
			soma = soma + ip.subTotal();
		}
		return soma;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do Pedido: ");
		sb.append(sdf.format(momento)+ "\n");
		sb.append("EstadoPedido: ");
		sb.append(estado + "n");
		sb.append("Cliente: ");
		sb.append(cliente + "\n");
		sb.append("Pedido itens:\n");
		for (Item_do_Pedido item : itens) {
			sb.append(item + "\n");
		}
		sb.append("Total preço: $");
		sb.append(String.format("2.f",total()));
		return sb.toString();
	}


}
