package academy.devdojo.maratonajava.javacore.Dconstructor.model;

public class anime {
	private String types;
	private int eps;
	private String name;
	private String genero;
	private String studio;

	public anime(String name, String types, int eps, String genero) {
		this.name = name;
		this.types = types;
		this.eps = eps;
		this.genero = genero;
	}
	public anime(String name, String types, int eps, String genero, String studio) {
		this(name, types, eps, genero);
		this.studio = studio;
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
