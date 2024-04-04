package aula00revisao;

public class questao09 {

	private boolean estado;
	
	public questao09() {
		this.estado = false;
	}
	
	public void acende() {
		this.estado = true;
	}
	
	public void apaga() {
		this.estado = false;
	}
	
	public void mostraEstado() {
		System.out.println("A lâmpada está " + (estado ? "ligada" : "desligada"));
	}
	
	public boolean estaLigada() {
		return estado;
	}

}