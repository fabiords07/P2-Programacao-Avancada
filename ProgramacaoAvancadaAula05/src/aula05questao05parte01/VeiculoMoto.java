package aula05questao05parte01;

public class VeiculoMoto implements VeiculoIF {
	    private boolean capaceteSeguranca;

	    @Override
	    public void ligar() {
	        System.out.println("Ligando a moto");
	    }

	    @Override
	    public void desligar() {
	        System.out.println("Desligando a moto");
	    }

	    @Override
	    public void acelerar() {
	        System.out.println("Acelerando a moto");
	    }

	    @Override
	    public void frear() {
	        System.out.println("Freando a moto");
	    }

	    public boolean isCapaceteSeguranca() {
	        return capaceteSeguranca;
	    }

	    public void setCapaceteSeguranca(boolean capaceteSeguranca) {
	        this.capaceteSeguranca = capaceteSeguranca;
	    }
}
