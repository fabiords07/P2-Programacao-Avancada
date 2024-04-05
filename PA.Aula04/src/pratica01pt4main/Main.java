package pratica01pt4main;

import pratica01pt2carro.Carro;
import pratica01pt3moto.Moto;

public class Main {
	public static void main(String[] args) {
		
		Carro carro = new Carro("Toyota Corolla", 2020, 4);
		Moto moto = new Moto("Honda CB500F", 2021, 500);
		
		carro.imprimirDetalhes();
		moto.imprimirDetalhes();
		}
}