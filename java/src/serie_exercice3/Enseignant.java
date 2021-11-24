package serie_exercice3;

public class Enseignant {

	private String name;
	private Specialite spec;
	public Enseignant(String name, Specialite spec) {
		super();
		this.name = name;
		this.spec = spec;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Specialite getSpec() {
		return spec;
	}
	public void setSpec(Specialite spec) {
		this.spec = spec;
	}
	@Override
	public String toString() {
		return "Enseignant [name=" + name + ", spec=" + spec + "]";
	}

	
}
