package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.model.estudante;

public class estudanteTest {

	public static void main(String[] args) {
		estudante estudante = new estudante();
		estudante.nome = "giraya";
		estudante.idade = 12;
		estudante.sexo = 'm';
		
		System.out.println(estudante.nome );
		System.out.println(estudante.idade );
		System.out.println(estudante.sexo );
	}

}
