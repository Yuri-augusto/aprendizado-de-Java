package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.model.person;

public class personTest02 {

	public static void main(String[] args) {
		person person01 = new person();
		
		System.out.println("=======================");
		person01.setName("Albert");
		person01.setAge(20);
		person01.print();
		System.out.println("=======================");
		System.out.println("using the get method");
		System.out.println("=======================");
		System.out.println(person01.getName());
		System.out.println(person01.getAge());
		System.out.println("=======================");
	}

}
