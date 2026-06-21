package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model.Carro;

public class carroTest01 {

	public static void main(String[] args) {
		Carro carro01 = new Carro();
		Carro carro02 = new Carro();
		
		carro01.nome = "Carro familiar";
		carro01.modelo = "Celta";
		carro01.ano = 2009;
		
		carro02.nome = "Carro Reserva";
		carro02.modelo = "Corsa";
		carro02.ano = 2000;
		
		
		System.out.println("Carro 1");
		System.out.println("Nome: " + carro01.nome + " |Modelo: " + carro01.modelo + " |Ano: " + carro01.ano);
		System.out.println("-----------------------------------");
		System.out.println("Carro 2");
		System.out.println("Nome: " + carro02.nome + " |Modelo: " + carro02.modelo + " |Ano: " + carro02.ano);
	}

}
