package aula02;

import java.util.Scanner;

public class exercicio07 {

	public static void main(String[] args) {
		// 2. Faça um programa que leia a altura de um grupo 
		// de 20 pessoas, calcule e exiba: 1) a maior altura dogrupo; 
		// 2) a altura média; e 3) o número de pessoas com altura superior a 2 metros.
		Scanner scanner = new Scanner(System.in);
		
		double maiorAltura = 0;
		double somaAlturas = 0;
		int pessoasAcima2Metros = 0;
		
		for (int i = 1; i <=20; i++) {
			System.out.println("Digite a altura da pessoa " + i + " (em metros): ");
			double altura = scanner.nextDouble();
			
			//verificando se é a maior altura
			if (altura > maiorAltura) {
				maiorAltura = altura;
			}
			
			//soma das alturas para cálculo da média
			somaAlturas += altura;
			
			//conta o número de pessoas com altura superior a 2 metros
			if (altura > 2) {
				pessoasAcima2Metros++;
			}
		}
		
		//calculando a média
		double alturaMedia = somaAlturas / 20;
		
		//exibindo os resultados
		System.out.println("Maior altura do grupo: " + maiorAltura + " metros.");
		System.out.println("Altura média do grupo: " + alturaMedia + " metros.");
		System.out.println("Número de pessoas com altura superior a 2 metros: " + pessoasAcima2Metros + ".");
		
	}

}
