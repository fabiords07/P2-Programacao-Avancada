package aula05questao05parte01;

public class TestaVeiculo {
    public static void main(String[] args) {
    	
        VeiculoMoto moto = new VeiculoMoto();
        moto.ligar();
        moto.acelerar();
        moto.frear();
        moto.desligar();

        VeiculoCarro carro = new VeiculoCarro();
        carro.ligar();
        carro.acelerar();
        carro.frear();
        carro.desligar();
    }
}
