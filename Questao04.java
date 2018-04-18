package Exercicios;

import java.util.Scanner;

public class Questao04 {
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		
		String nome;
		float salario;
		int opcao = 1;
		
		leitor = new Scanner(System.in);
		System.out.println("---==={Consulta de aumento salarial}===---");
		System.out.println("Nossa empresa irá conceder um aumento de 20% para todos os funcionários que possuirem um salário");
		System.out.println("abaixo de R$500.00.");
		while (opcao ==1 ) {
			System.out.println("Qual o seu nome?");
			nome = leitor.next();
			System.out.println("Qual é o seu salario atual?");
			salario = leitor.nextFloat();
			if(salario > 500) {
				System.out.println(nome + ", infelizmente você não está apto a receber aumento!");
				System.out.println("Seu salario atual de R$" + salario +" ultrapassa o limite de R$500.00");
				System.out.println("Deseja fazer a requisição de outro funcionario?");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				opcao = leitor.nextInt();
			} else {
				System.out.println(nome + " você está apto ao reajuste salarial");
				System.out.println("Você receberá um aumento salarial equivalente a R$" + (salario*20/100));
				System.out.println("Apartir de hoje seu salario equivale a R$" + (salario + (salario*20/100)));
				System.out.println("Deseja fazer a requisição de outro funcionario?");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				opcao = leitor.nextInt();
			}
		}
	}
}