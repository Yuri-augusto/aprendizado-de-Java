package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.funcionario;

public class funcionariosTest01 {

	public static void main(String[] args) {
		funcionario funcionario01 = new funcionario();
		funcionario funcionario02 = new funcionario();
		
		funcionario01.setNome("Carlos");
		funcionario01.setIdade( 20);
		funcionario01.setSalario(new float[] {1600, 1200, 1700});
		
		funcionario02.setNome("livia");
		funcionario02.setIdade(19);
		funcionario02.setSalario(new float[] {1700, 1066, 1500});
		
		funcionario01.print();
		funcionario01.media();
		
		funcionario02.print();
		funcionario02.media();
	}

}
