package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.estudante;

public class estudanteTest02 {
	public static void main(String[] args) {
		estudante estudante01 = new estudante();
		estudante estudante02 = new estudante();
		
		estudante01.nome = "guanabara";
		estudante01.sexo = 'M';
		estudante01.idade = 32;
		
		estudante02.nome = "Yuri";
		estudante02.sexo = 'F';
		estudante02.idade = 17;
		
		estudante01.imrime();
		estudante02.imrime();
	}
}
