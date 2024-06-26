package aula00questao17;

public class ItemDePedido {
	private int quantidade;
	private String codProduto;
	private double valorUnitario;
	
	public ItemDePedido(String codProduto, int quantidade, double valorUnitario){
		this.quantidade = quantidade;
		this.codProduto = codProduto;
		this.valorUnitario = valorUnitario;      
	}          
	
	public int getQuantidade(){
		return this.quantidade;
	}        
	
	public void setQuantidade(int quantidade){
		this.quantidade = quantidade;
	}        
	
	public String getCodProduto(){
		return this.codProduto;
	}        
	
	public void setCodProduto(String codProduto){
		this.codProduto = codProduto;
	}        
	
	public double getValorUnitario(){
		return this.valorUnitario;
	}        
	
	public void setValorUnitario(double valorUnitario){
		this.valorUnitario = valorUnitario;
	}
}
