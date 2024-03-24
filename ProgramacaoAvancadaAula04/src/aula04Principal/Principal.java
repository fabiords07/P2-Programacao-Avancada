package aula04Principal;

import aula04Banco.Banco;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Banco b = new Banco("Pedro", "65758587", 100.0);
		
		//b.saldo = 5.0;
		b.setSaldo(5);
		
		System.out.println(b.getSaldo());

	}

}
