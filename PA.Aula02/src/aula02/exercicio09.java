package aula02;

import java.util.Scanner;

public class exercicio09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o tamanho do array: ");
		int tamanhoArray = scanner.nextInt();
		
		//nascimento do array kkkk
		int[] numeros = new int[tamanhoArray];
		
		//preenchimento do array com numeros informados pelo usuario
		for (int i = 0; i < tamanhoArray; i++) {
			System.out.println("Digite o número " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}
		
		//calculo da media
		double soma = 0;
		for (int numero : numeros) {
			soma += numero;
		}
		
		double media = soma / tamanhoArray;
		
		//exibindo a media
		System.out.println("A média dos números inseridos é: " + media);

	}

}