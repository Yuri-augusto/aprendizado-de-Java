package calculadora.main;

import java.util.Scanner;

import calculadora.model.calculadora;

public class calculadoraindex {

	public static void main(String[] args) {
		calculadora calculadora = new calculadora();
		Scanner sc = new Scanner(System.in);
		int cont = 0;
		int seletor = 0;
		while(true) {
			cont = 0;
			seletor = calculadora.selecao();
			if(seletor == 9){
				System.out.println("volte sempre                                 |");
				System.out.println("==============================================");
				break;
			}
			if(seletor < 0 || seletor > 9) {
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
					cont = calculadora.reiniciar();
				}
				if(seletor == 2) {
					System.out.println("==============================================");
					System.out.println("Digite a quantidade de subtrações: ");
					int quantidade = sc.nextInt();
					
					calculadora.subtracao(quantidade);
					cont = calculadora.reiniciar();

				}
				if(seletor == 3) {
					System.out.println("==============================================");
					System.out.println("Digite a quantidade de Multiplicações: ");
					
					int quantidade = sc.nextInt();
					
					calculadora.multiplicacao(quantidade);
					cont = calculadora.reiniciar();

				}
				if(seletor == 4) {
					System.out.println("==============================================");
					System.out.println("Digite o primeiro numero: ");
					Double numero1 = sc.nextDouble();
					System.out.println("Digite o Segundo numero: ");
					Double numero2 = sc.nextDouble();
					if(numero2 == 0) {
						System.out.println("Não existe divisão por zero");
						continue;
					}
					calculadora.divisao(numero1, numero2);
					cont = calculadora.reiniciar();
				}
				
				
			}
		}
	}

}
