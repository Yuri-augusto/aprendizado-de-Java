package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.calculadora;

public class calculadoraTest04 {

	public static void main(String[] args) {
		calculadora calculadora = new calculadora();
		
		int num1 = 10;
		int num2 = 30;
		
		calculadora.alteradoisnumeros(num1, num2);
		System.out.println(" ");
		System.out.println("fora do alteranumero");
		System.out.println("Numero um: " + num1);
		System.out.println("Numero dois: " + num2);

	}

}
