package Exercicios;

import java.util.Scanner;

public class Questao02 {
	
	
	private static Scanner leitor;

	public static void main(String[] args) {
		
		leitor = new Scanner(System.in);
		//Declara��o de vari�veis
		int num;//n�mero que ser� informado pelo usu�rio
		int valor = 1;//n�mero da vez que o usu�rio deve informar
		int loop = 0;//loops
				
		System.out.println("Informe 10 n�meros inteiros, no decorrer do programa informaremos se ele � par ou �mpar:");
		
		while (loop < 10) {//Loop vai acabar ap�s o �ltimo n�mero para encerrar o programa
			System.out.println("Informe o " + valor + "� valor");
			num = leitor.nextInt();
			if(num % 2 == 0) {//Verifica se o n�mero � "par"
				System.out.println("O n�mero " + num + " � par");
			} else {//Caso ele n�o seja par, automaticamente ele � classificado como "�mpar"
				System.out.println("O n�mero " + num + " � �mpar");
			}
			loop += 1;
			valor += 1;		
		}
	}
}