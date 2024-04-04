package aula00revisao;

public class questao10 {

	private boolean estado;
	private int watts;
	
	public questao10() {
		this.estado = false;
		this.watts = 0;
	}
	
	public questao10 (boolean estadoInicial, int watts) {
		this.estado = estadoInicial;
		this.watts = watts;
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
	
	public boolean ehEconomica () {
		return watts < 40;
	}

}