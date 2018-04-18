package Exercicios;

import java.util.Scanner;

public class Questao06 {
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		String nome;//Nome do usuario
		float bruto;//valor do sal�rio bruto
		float emprestimo;//valor do empr�stimo
		int opcao = 1;
		
		leitor = new Scanner(System.in);
		System.out.println("Software utilizado para que seja requisitado uma linha de cr�dito de funcion�rios municipais");
		while (opcao == 1) {
			System.out.println("Informe seu nome: ");
			nome = leitor.next();//Recebe o nome do usuario
			System.out.println("Informe o valor do seu salario(R$): ");
			bruto = leitor.nextFloat();//Recebe o salario
			System.out.println("Por favor informe o valor do empr�stimo(R$): ");
			emprestimo = leitor.nextFloat();
		
			if (emprestimo > ((bruto*30)/100)) {//Compara o valor do empr�stimo a 30% do sal�rio e realiza o if caso o valor pedido seja maior que os 30%
				System.out.println(nome + ", infelizmente o empr�stimo n�o pode ser realizado!");
				System.out.println("O valor R$ " + emprestimo + " ultrapassa 30% de seu sal�rio bruto!");
				System.out.println("Por favor requisite um valor abaixo(ou igual) de(a) R$ " + ((bruto*30)/100));
				System.out.println("Deseja fazer outra requisi��o?");
				System.out.println("1 - Sim");
				System.out.println("2 - N�o");
				opcao = leitor.nextInt();
			} else {//Caso o valor pedido atenda as requisi��es
				System.out.println(nome + ", sua requisi��o de R$" + emprestimo + " foi concedida com sucesso. Aguarde a emiss�o do valor.");
				System.out.println("Deseja fazer a requisi��o de um outro funcion�rio?");
				System.out.println("1 - Sim");
				System.out.println("2 - N�o");
				opcao = leitor.nextInt();
			}
		}
		System.exit(0);//Encerra o programa
	}
}