package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class imprimeestudante {
	public void impressoraestudante(estudante estudante) {
		
		System.out.println("------------------");
		System.out.println(estudante.nome);
		System.out.println(estudante.sexo);
		System.out.println(estudante.idade);
		
		estudante.nome = "Yuri gargarin";
		
		
	}
}
