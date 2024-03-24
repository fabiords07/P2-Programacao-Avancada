package aula04Pratica01Base;

public class Veiculo {
	
	public String modelo;
	public int ano;
	
	public Veiculo (String modelo, int ano) {
		this.modelo = modelo;
		this.ano = ano;
	}
	
	//metodo para imprimir detalhes
	public void imprimirDetalhes() {
		System.out.println("Modelo: " + modelo);
		System.out.println("Ano: " + ano);
	}
}
