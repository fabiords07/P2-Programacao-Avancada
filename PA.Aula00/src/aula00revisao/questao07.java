package aula00revisao;

import java.util.Scanner;

public class questao07 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ó senhor do tempo, diga-me quantos segundos temos:");
		
		int segundos = scanner.nextInt();
		
		//calculando as horas, minutos e segundos usando o módulo de resto da divisão
		int horas = segundos / 3600;
		int minutos = (segundos % 3600) / 60;
		int segundosRestantes = segundos % 60;
		
		System.out.println("Temos " + horas + " horas, " + minutos + " minutos e " + segundosRestantes + " segundos.");
		System.out.println("Não é sobre quanto tempo você tem. É sobre como você usa.");

	}

}