package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.imprimeestudante;

public class estudanteTest01 {
	public static void main(String[] args) {
		estudante estudante01 = new estudante();
		estudante estudante02 = new estudante();
		imprimeestudante impressora = new imprimeestudante();
		estudante01.nome = "guanabara";
		estudante01.sexo = 'M';
		estudante01.idade = 32;
		
		estudante02.nome = "Yuri";
		estudante02.sexo = 'F';
		estudante02.idade = 17;
		/*
		System.out.println(estudante01.nome);
		System.out.println(estudante01.sexo);
		System.out.println(estudante01.idade);
		System.out.println("------------------");
		System.out.println(estudante02.nome);
		System.out.println(estudante02.sexo);
		System.out.println(estudante02.idade);
		
		System.out.println("agora com parametro de referencia");
		*/
		impressora.impressoraestudante(estudante01);
		impressora.impressoraestudante(estudante02);
		System.out.println("###########################");
		impressora.impressoraestudante(estudante01);
		impressora.impressoraestudante(estudante02);
		
	}
}
