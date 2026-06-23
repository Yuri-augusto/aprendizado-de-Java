package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class calculadora {
	public void domadoisnumeros() {
		System.out.println(10+10);
	}
	
	public void subtraidoisnumeros() {
		System.out.println(21-2);
	}
	
	public void multiplicardoisnumeros(int num1, int num2) {
		System.out.println(num1 * num2);
	}
	
	public double dividedoisnumeros(double num1, double num2) {
		return(num1/num2);
	}
	
	public void alteradoisnumeros(int num1, int num2){
		num1 = 99;
		num2 = 67;
		System.out.println("Dentro do altera dois numeros");
		System.out.println("Numero um: " + num1);
		System.out.println("Numero dois: " + num2);
	}
}
