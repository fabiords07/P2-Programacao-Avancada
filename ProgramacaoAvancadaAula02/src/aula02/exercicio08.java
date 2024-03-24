package aula02;

import java.util.Scanner;

public class exercicio08 {

	public static void main(String[] args) {
		// Faça um programa que receba vários números
		// até receber como entrada um número negativo, 
		// calcule e mostre:a) A quantidade de números inferiores a 35;
		// b) A média dos números positivosc) A percentagem de números 
		// entre 50 e 100 entre todos os números digitados;
		// d) A percentagem de números entre 10 e 20, entre os números menores que 50
		Scanner scanner = new Scanner(System.in);
		
		int numerosInferiores35 = 0;
		int totalNumerosPositivos = 0;
		int numerosEntre50e100 = 0;
		int numerosEntre10e20Menores50 = 0;
		int totalNumerosDigitados = 0;
		
		System.out.println("Digite números (digite um número negativo para encerrar): ");
		
		while (true) {
			int numero = scanner.nextInt();
			
			//verifica se o número é negativo para encerrar o loop
			if (numero < 0) {
				break;
			}
			
			//conta a quantidade de numeros inferiores a 35
			if (numero < 35) {
				numerosInferiores35++;
			}
			
			//calcula a media dos numeros positivos
			if (numero > 0) {
				totalNumerosPositivos += numero;
				totalNumerosDigitados++;
			}
			
			//conta a quantidade de numeros entre 50 e 100
			if (numero >= 50 && numero <= 100) {
				numerosEntre50e100++;
			}
			
			//conta a quantidade de números entre 10 e 20, mas apenas os menores que 50
			if (numero < 50 && numero >=10 && numero <= 20) {
				numerosEntre10e20Menores50++;
			}
			
			totalNumerosDigitados++;
		}
		
		//calcula a media dos numeros positivos
		double mediaNumerosPositivos = (double) totalNumerosPositivos / totalNumerosDigitados;
		
		//calcula as percentagens
		double percentagemEntre50e100 = ((double) numerosEntre50e100 / totalNumerosDigitados) * 100;
		double percentagemEntre10e20Menores50 = ((double) numerosEntre10e20Menores50 / totalNumerosDigitados) *100;
		
		//resultados
		System.out.println("Quantidade de números inferiores a 35: " + numerosInferiores35);
		System.out.println("Média dos números positivos: " + mediaNumerosPositivos);
		System.out.println("Percentagem de números entre 50 e 100: " + percentagemEntre50e100 + "%.");
		System.out.println("Percentagem de números entre 10 e 20 (menores que 50): " + percentagemEntre10e20Menores50 + "%.");
	}

}