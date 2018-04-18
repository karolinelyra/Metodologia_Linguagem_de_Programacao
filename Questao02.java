package Exercicios;

import java.util.Scanner;

public class Questao02 {
	
	
	private static Scanner leitor;

	public static void main(String[] args) {
		
		leitor = new Scanner(System.in);
		//Declaração de variáveis
		int num;//número que será informado pelo usuário
		int valor = 1;//número da vez que o usuário deve informar
		int loop = 0;//loops
				
		System.out.println("Informe 10 números inteiros, no decorrer do programa informaremos se ele é par ou ímpar:");
		
		while (loop < 10) {//Loop vai acabar após o último número para encerrar o programa
			System.out.println("Informe o " + valor + "º valor");
			num = leitor.nextInt();
			if(num % 2 == 0) {//Verifica se o número é "par"
				System.out.println("O número " + num + " é par");
			} else {//Caso ele não seja par, automaticamente ele é classificado como "ímpar"
				System.out.println("O número " + num + " é ímpar");
			}
			loop += 1;
			valor += 1;		
		}
	}
}