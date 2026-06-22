package calculadora.model;

import java.util.Scanner;
import java.util.Arrays;

public class calculadora {
	
	Scanner sc = new Scanner(System.in);
	
	public void soma() {
		
		System.out.println("===================================================================");
		System.out.println("Digite a quantidade de somas: ");
		int quantidade = sc.nextInt();
		
		double soma = 0;
		for(int i = 0; i < quantidade; i++) {
			System.out.println("Digite um valor: ");
			double numero = sc.nextDouble();
			soma = soma + numero; 
		}
		System.out.println("A soma total é: " + soma );
	}
	
	public void subtracao() {
		System.out.println("===================================================================");
		System.out.println("Digite a quantidade de subtrações: ");
		int quantidade = sc.nextInt();
	    double resultado = 0;

	    for (int i = 0; i < quantidade; i++) {
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
	
	public void multiplicacao() {
		System.out.println("===================================================================");
		System.out.println("Digite a quantidade de Multiplicações: ");
		
		int quantidade = sc.nextInt();
		double multiplicacao = 1;
		for(int i = 0; i < quantidade; i++) {
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
	
	public void divisao() {
		System.out.println("===================================================================");
		System.out.println("Digite o primeiro numero: ");
		Double numero1 = sc.nextDouble();
		System.out.println("Digite o Segundo numero: ");
		Double numero2 = sc.nextDouble();
		if(numero2 == 0) {
			System.out.println("Não existe divisão por zero");
		}else {
			double divisao = numero1 / numero2;
			System.out.println("A divisão é: " + divisao);
		}
	}
	
	public void raiz() {
		System.out.println("===================================================================");
		System.out.println("Digite o numero para calcular a raiz quadrada:");
		Double numero = sc.nextDouble();
		double raiz = numero;
		System.out.println(Math.sqrt(numero));
	}
	
	public void bhaskara() {
		System.out.println("===================================================================");
		System.out.println("Digite o A");
		Double a = sc.nextDouble();
		System.out.println("Digite o B");
		Double b = sc.nextDouble();
		System.out.println("Digite o C");
		Double c = sc.nextDouble();
		double delta = (b*b)-(4*a*c);
		if(delta >= 0) {
			double xum = (-b + Math.sqrt(delta)) / 2*a;
			double xdois = (-b - Math.sqrt(delta)) / 2*a;
			System.out.println("===================================================================");
			System.out.println("X Um: " + xum + " | X Dois: " + xdois);
			
		}else {
			System.out.println("Não tem raiz!");
		}
	}
	public void potencia(){
		System.out.println("===================================================================");
		System.out.println("Digite a quantidade de potencias");
		int quantidade = sc.nextInt();
		if(quantidade <= 0) {
			System.out.println("Voce digitou zero");
		}else {
			double[] numeros = new double[quantidade];
			
			for(int i = 0; i < quantidade; i++) {
				System.out.println("Digite um numero");
				numeros[i] = sc.nextDouble();
			}
			
			double resultado = numeros[0];
			
		    for (int i = 1; i < numeros.length; i++) {
		        resultado = Math.pow(resultado, numeros[i]);
		    }
		    System.out.println("===================================================================");
		    System.out.println(resultado);
		    System.out.println("===================================================================");
		}
	}
	//Area de "interface"
	
	public int reiniciar() {
		System.out.println("Digite 0 para continuar | Digite qualquer outro numero para sair: ");
		System.out.println("===================================================================");
		int cont = sc.nextInt();
		return(cont);
	}
	public int selecao() {
		System.out.println("===================================================================");
		System.out.println(" ███   ███  █      ███  █   █ █      ███  ████   ███  ████   ███  \n"
				+ "█     █   █ █     █     █   █ █     █   █ █   █ █   █ █   █ █   █ \n"
				+ "█     █████ █     █     █   █ █     █████ █   █ █   █ ████  █████ \n"
				+ "█     █   █ █     █     █   █ █     █   █ █   █ █   █ █  █  █   █ \n"
				+ " ███  █   █ █████  ███   ███  █████ █   █ ████   ███  █   █ █   █ ");
		System.out.println("===================================================================");
		System.out.println("Digite 1 para Soma:                                               |");
		System.out.println("Digite 2 para Sobtração:                                          |");
		System.out.println("Digite 3 para Multiplicação:                                      |");
		System.out.println("Digite 4 para Divisão:                                            |");
		System.out.println("Digite 5 para Raiz quadrada:                                      |");
		System.out.println("Digite 6 para Formula de Bhaskara                                 |");
		System.out.println("Digite 7 para Potencia                                            |");
		System.out.println("===================================================================");
		System.out.println("Digite 9 para fechar o programa:                                  |");
		System.out.println("===================================================================");
		int seletor = sc.nextInt();
		return(seletor);
	}
}
	
