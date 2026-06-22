package calculadora.main;

import java.util.Scanner;

import calculador.model.calculadora;

public class calculadoraindex {

	public static void main(String[] args) {
		calculadora calculadora = new calculadora();
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		
		while(true) {
			cont = 0;
			//Seleção
			System.out.println("==============================================");
			System.out.println("Digite 1 para soma: ");
			System.out.println("Digite 2 para sobtração: ");
			System.out.println("Digite 3 para multiplicação: ");
			System.out.println("Digite 4 para divisão: ");
			System.out.println("==============================================");
			System.out.println("Digite 5 para fechar o programa");
			System.out.println("==============================================");
			
			int seletor = sc.nextInt();
			if(seletor == 5){
				break;
			}
			if(seletor < 0 || seletor > 5) {
				System.out.println("==============================================");
				System.out.println("O numero: " + seletor + " é invalido digite novamente: ");
				continue;
			}
			//calculos
			
			while(cont == 0) {
				if(seletor == 1) {
					System.out.println("==============================================");
					System.out.println("Digite a quantidade de somas: ");
					int quantidade = sc.nextInt();
					
					calculadora.soma(quantidade);
					System.out.println("Digite 0 para continuar | Digite qualquer outro numero para sair: ");
					System.out.println("==============================================");
					cont = sc.nextInt();
				}
				if(seletor == 2) {
					System.out.println("==============================================");
					System.out.println("Digite a quantidade de subtrações: ");
					int quantidade = sc.nextInt();
					
					calculadora.subtracao(quantidade);
					System.out.println("Digite 0 para continuar | Digite qualquer outro numero para sair: ");
					System.out.println("==============================================");
					cont = sc.nextInt();
				}
				if(seletor == 3) {
					System.out.println("==============================================");
					System.out.println("Digite a quantidade de Multiplicações: ");
					
					int quantidade = sc.nextInt();
					
					calculadora.multiplicacao(quantidade);
					System.out.println("Digite 0 para continuar | Digite qualquer outro numero para sair: ");
					System.out.println("==============================================");
					cont = sc.nextInt();
				}
				if(seletor == 4) {
					System.out.println("==============================================");
					System.out.println("Digite o primeiro numero: ");
					Double numero1 = sc.nextDouble();
					System.out.println("Digite o Segundo numero: ");
					Double numero2 = sc.nextDouble();
					calculadora.divisao(numero1, numero2);
					System.out.println("Digite 0 para continuar | Digite qualquer outro numero para sair: ");
					System.out.println("==============================================");
					cont = sc.nextInt();
				}
				
				
			}
		}
	}

}
