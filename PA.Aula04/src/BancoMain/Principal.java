package BancoMain;

import Banco.Encapsulamento.Banco;

public class Principal {

	public static void main (String [] args) {
		
		Banco banco = new Banco("João", "868669", 100);
		
		banco.setSaldo(5);
		
		System.out.println(banco.getSaldo());
	}
}
