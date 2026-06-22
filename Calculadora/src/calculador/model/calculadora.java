package calculador.model;

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
			multiplicacao = multiplicacao * numero;
		}
		System.out.println("A soma total é: " + multiplicacao);
	}
	
	public void divisao(double numero1, double numero2) {
		double divisao = numero1 / numero2;
		 System.out.println("A divisão é: " + divisao);
	}
}
	
