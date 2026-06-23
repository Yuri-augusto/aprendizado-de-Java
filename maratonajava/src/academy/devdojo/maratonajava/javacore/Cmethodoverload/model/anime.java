package academy.devdojo.maratonajava.javacore.Cmethodoverload.model;

public class anime {
	private String types;
	private int eps;
	private String name;
	private String genero;
	
	public void init(String name, String types, int eps) {
		this.name = name;
		this.types = types;
		this.eps = eps;
	}
	
	public void init(String name, String types, int eps, String genero) {
		this.init(name, types, eps);
		this.genero = genero;
	}
	
	public void print() {
		System.out.println(this.name);
		System.out.println(this.types);
		System.out.println(this.eps);
		System.out.println(this.genero);
	}
	
	//using get and set only
	
	public void setTypes(String Types) {
		this.types = Types;
	}
	public String GetTypes() {
		return(types);
	}
	
	public void setEps(int eps) {
		this.eps = eps;
	}
	public int getEps() {
		return(eps);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
