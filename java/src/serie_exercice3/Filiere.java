package serie_exercice3;

public class Filiere {

	private String nom;

	public Filiere(String nom) {
		super();
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Filiere :" + nom ;
	}

	
}
