
package serie_exercice3;

public class Specialite {

	
	private String name;

	@Override
	public String toString() {
		return "Specialite [name=" + name + "]";
	}

	public Specialite(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
		
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
