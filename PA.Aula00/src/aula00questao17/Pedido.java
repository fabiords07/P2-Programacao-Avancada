package aula00questao17;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	private int numeroDoPedido ;
	private Cliente cliente;
	List <ItemDePedido> itens;
	
	public Pedido(int numeroPedido ){
		this.numeroDoPedido = numeroPedido;
		this.cliente = new Cliente ("");
		this.itens = new ArrayList<ItemDePedido>();
	}            
	
	public Pedido (int numeroDoPedido, String nome){
		this.numeroDoPedido = numeroDoPedido;
		this.cliente = new Cliente (nome);
		this.itens = new ArrayList<ItemDePedido>();
	}
	
	public List <ItemDePedido> getItens(){
		return itens;
	}
	
	public void adicionaItem(ItemDePedido item ){
		this.itens.add(item);
	}        
	
	public int getNumeroDoPedido(){
		return this.numeroDoPedido;
	}        
	
	public void setNumeroDoPedido(int numPedido ){
		this.numeroDoPedido = numPedido;
	}
	
	public Cliente getCliente(){
		return this.cliente;
	}
	
	public void setCliente(Cliente c){
		this.cliente = c;
	}
} 
