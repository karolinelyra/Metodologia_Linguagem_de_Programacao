package Exercicios;

import java.util.Scanner;

public class Questao08 {
	
	private static Scanner leitor;

	public static void main(String[] args) {
		
	String nome;
	double diaria = 40;//pre�o da di�ria
	int dias;
	int opcao = 1;
	double totalCliente;
	double arrecadado = 0;
	
	
	leitor = new Scanner(System.in);
	System.out.println("Esse programa � respons�vel pela realiza��o do c�lculo de d�vidas de di�ria e servi�os di�rios de um hotel");
	System.out.println("Pre�os:");
	System.out.println("Di�ria: R$40,00");
	System.out.println("Servi�os Di�rios:");
	System.out.println("                *Menos de 10 Dias: R$15,00 p/dia");
	System.out.println("                *Mais de 10 Dias: R$8,00 p/dia");
	while(opcao == 1) {
		System.out.println("Por favor informe seu nome:");
		nome = leitor.next();
		System.out.println(nome + " quantos dias voc� passou no Hotel?");
		dias = leitor.nextInt();
		if (dias > 10) {
			totalCliente = (dias*diaria) + (8*dias);
			System.out.println(nome + " sua conta total � de R$" + totalCliente);
			} else {
				totalCliente = (dias*diaria) + (15*dias);
				System.out.println(nome + " sua conta total � de R$" + totalCliente);
			}
		arrecadado += totalCliente;
		System.out.println("Deseja Iniciar o pedido de um outro cliente?");
		System.out.println("1 - Sim");
		System.out.println("2 - N�o");
		opcao = leitor.nextInt();
		}
	System.out.println("O total arrecadado hoje foi de R$" + arrecadado);
	}
}