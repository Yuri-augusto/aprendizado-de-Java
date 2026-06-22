package calculadora.model;

import java.util.Scanner;

public class calculadora {
	
	Scanner sc = new Scanner(System.in);
	
	public void soma(int entrada) {
		
		double soma = 0;
		for(int i = 0; i < entrada; i++) {
			System.out.println("Digite um valor: ");
			double numero = sc.nextDouble();
			soma = soma + numero; 
		}
		System.out.println("A soma total é: " + soma );
	}
	
	public void subtracao(int entrada) {
	    double resultado = 0;

	    for (int i = 0; i < entrada; i++) {
	        System.out.println("Digite um valor: ");
	        double numero = sc.nextDouble();

	        if (i == 0) {
	            resultado = numero;
	        } else {
	            resultado -= numero;
	        }
	    }

	    System.out.println("A subtração total é: " + resultado);
	}
	
	public void multiplicacao(int entrada) {
		double multiplicacao = 1;
		for(int i = 0; i < entrada; i++) {
			System.out.println("Digite um valor: ");
			double numero = sc.nextDouble();
			if(numero == 0) {
				System.out.println("Nao existe multiplicação por 0");
				i = -1;
				multiplicacao = 1;
				continue;
			}
			multiplicacao = multiplicacao * numero;
		}
		System.out.println("A Miltiplicação total é: " + multiplicacao);
	}
	
	public void divisao(double numero1, double numero2) {
		double divisao = numero1 / numero2;
		 System.out.println("A divisão é: " + divisao);
	}
	
	
	//Area de "interface"
	
	public int reiniciar() {
		System.out.println("Digite 0 para continuar | Digite qualquer outro numero para sair: ");
		System.out.println("===================================================================");
		int cont = sc.nextInt();
		return(cont);
	}
	public int selecao() {
		System.out.println("==============================================");
		System.out.println("Digite 1 para soma:                          |");
		System.out.println("Digite 2 para sobtração:                     |");
		System.out.println("Digite 3 para multiplicação:                 |");
		System.out.println("Digite 4 para divisão:                       |");
		System.out.println("==============================================");
		System.out.println("Digite 9 para fechar o programa:             |");
		System.out.println("==============================================");
		int seletor = sc.nextInt();
		return(seletor);
	}
}
	
