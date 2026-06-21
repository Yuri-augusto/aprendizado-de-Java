package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.model.Professor;

public class professorTest01 {

	public static void main(String[] args) {
		Professor professor = new Professor();
		professor.nome = "tew";
		professor.idade = 30;
		professor.sexo = 'M';
		
		Professor professor2 = new Professor();
		professor2.nome = "Ronaldo";
		professor2.idade = 67;
		professor2.sexo = 'M';
		
		System.out.println("Nome: " + professor.nome + " Idade: " + professor.idade + " Sexo: " + professor.sexo);
		System.out.println("------------------------------------------------------");
		System.out.println("Nome: " + professor2.nome + " Idade: " + professor2.idade + " Sexo: " + professor2.sexo);
	}

}
