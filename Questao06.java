package Exercicios;

import java.util.Scanner;

public class Questao06 {
	
	private static Scanner leitor;
	
	public static void main(String[] args) {
		String nome;//Nome do usuario
		float bruto;//valor do salário bruto
		float emprestimo;//valor do empréstimo
		int opcao = 1;
		
		leitor = new Scanner(System.in);
		System.out.println("Software utilizado para que seja requisitado uma linha de crédito de funcionários municipais");
		while (opcao == 1) {
			System.out.println("Informe seu nome: ");
			nome = leitor.next();//Recebe o nome do usuario
			System.out.println("Informe o valor do seu salario(R$): ");
			bruto = leitor.nextFloat();//Recebe o salario
			System.out.println("Por favor informe o valor do empréstimo(R$): ");
			emprestimo = leitor.nextFloat();
		
			if (emprestimo > ((bruto*30)/100)) {//Compara o valor do empréstimo a 30% do salário e realiza o if caso o valor pedido seja maior que os 30%
				System.out.println(nome + ", infelizmente o empréstimo não pode ser realizado!");
				System.out.println("O valor R$ " + emprestimo + " ultrapassa 30% de seu salário bruto!");
				System.out.println("Por favor requisite um valor abaixo(ou igual) de(a) R$ " + ((bruto*30)/100));
				System.out.println("Deseja fazer outra requisição?");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				opcao = leitor.nextInt();
			} else {//Caso o valor pedido atenda as requisições
				System.out.println(nome + ", sua requisição de R$" + emprestimo + " foi concedida com sucesso. Aguarde a emissão do valor.");
				System.out.println("Deseja fazer a requisição de um outro funcionário?");
				System.out.println("1 - Sim");
				System.out.println("2 - Não");
				opcao = leitor.nextInt();
			}
		}
		System.exit(0);//Encerra o programa
	}
}