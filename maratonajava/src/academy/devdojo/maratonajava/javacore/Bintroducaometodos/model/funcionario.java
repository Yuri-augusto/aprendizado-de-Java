package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class funcionario {
	public String nome;
	public int idade;
	public float[] salario;
	
	public void print() {
		System.out.println("==========================");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		for (int i = 0; i < this.salario.length; i++) {
			System.out.print("Salario:" + (i+1) + " " + this.salario[i] + " ");
		}
		System.out.println(" ");
	}
	
	public void getsalario() {
		float media = 0;
		for (int i = 0; i < this.salario.length; i++) {
			media = media + this.salario[i];
		}
		media = media / this.salario.length;
		System.out.println("A media dos tres salarios são: " + media);
		System.out.println("==========================");
	}
}
