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
					calculadora.soma();
					cont = calculadora.reiniciar();
				}
				if(seletor == 2) {
					calculadora.subtracao();
					cont = calculadora.reiniciar();
				}
				if(seletor == 3) {
					calculadora.multiplicacao();
					cont = calculadora.reiniciar();
				}
				if(seletor == 4) {
					calculadora.divisao();
					cont = calculadora.reiniciar();
				}
				if (seletor == 5) {
					
					calculadora.raiz();
					cont = calculadora.reiniciar();
				}
				if(seletor == 6){
					calculadora.bhaskara();
					cont = calculadora.reiniciar();
				}
				if(seletor == 7) {
					calculadora.potencia();
					cont = calculadora.reiniciar();
				}
				
			}
		}
	}

}
