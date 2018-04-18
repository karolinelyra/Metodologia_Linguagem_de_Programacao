package Exercicios;

import java.util.Scanner;

public class Questao01 {
	
	private static Scanner leitor;

	public static void main(String[] args){
		
		float salario; //valor do salario 
		float porcentagem;//porcentagem de aumento salarial
		float aumento;//Valor do salario apos o aumento
		
		leitor = new Scanner(System.in);
		
		System.out.println("Informe o valor do seu salario(R$): ");
		salario = leitor.nextFloat();//Recebe o valor equivalente ao salario
		System.out.println("Informe a porcentagem que será aumentada no seu salário: ");
		porcentagem = leitor.nextFloat();//Recebe o valor da porcentagem
		
		aumento = salario + ((salario*porcentagem)/100);
		System.out.println("Seu salário ficará R$" + aumento);
	}
}

