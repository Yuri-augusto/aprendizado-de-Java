package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.funcionario;

public class funcionariosTest01 {

	public static void main(String[] args) {
		funcionario funcionario01 = new funcionario();
		funcionario funcionario02 = new funcionario();
		
		funcionario01.nome = "Carlos";
		funcionario01.idade = 20;
		funcionario01.salario = new float[] {1600, 1200, 1700};
		
		funcionario02.nome = "livia";
		funcionario02.idade = 19;
		funcionario02.salario = new float[] {1700, 1066, 1100};
		
		funcionario01.print();
		funcionario01.getsalario();
		
		funcionario02.print();
		funcionario02.getsalario();
	}

}
