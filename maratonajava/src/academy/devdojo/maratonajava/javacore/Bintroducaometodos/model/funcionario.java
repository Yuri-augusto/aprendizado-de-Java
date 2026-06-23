package academy.devdojo.maratonajava.javacore.Bintroducaometodos.model;

public class funcionario {
	private String nome;
	private int idade;
	private float[] salario;
	private float media = 0;
	
	
	public void print() {
		System.out.println("==========================");
		System.out.println("Nome: " + this.nome);
		System.out.println("Idade: " + this.idade);
		for (int i = 0; i < this.salario.length; i++) {
			System.out.print("Salario:" + (i+1) + " " + this.salario[i] + " ");
		}
		System.out.println(" ");
	}
	
	public void media() {
		for (int i = 0; i < this.salario.length; i++) {
			media = media + this.salario[i];
		}
		media = media / this.salario.length;
		System.out.println("A media dos tres salarios são: " + media);
		System.out.println("==========================");
	}

	//metodos set e get
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void setSalario(float[] salario) {
		this.salario = salario;
	}
	
	
	
	
}
