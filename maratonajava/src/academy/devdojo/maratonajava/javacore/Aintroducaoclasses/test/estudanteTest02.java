package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model.estudante;

public class estudanteTest02 {

	public static void main(String[] args) {
		estudante estudante = new estudante();
		estudante estudante2 = new estudante();
		
		estudante.nome = "Lucas";
		
		System.out.println(estudante.nome);
		System.out.println(estudante.idade);
		System.out.println(estudante.sexo);
		
		System.out.println("-------------");
		
		System.out.println(estudante2.nome);
		System.out.println(estudante2.idade);
		System.out.println(estudante2.sexo);
	}

}
