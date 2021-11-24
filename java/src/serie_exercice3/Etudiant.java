package serie_exercice3;

public class Etudiant {

	
	private String nom;
	private String prenom;
	private Filiere filiere;
	
	public Etudiant(String nom, String prenom, Filiere filiere) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.filiere = filiere;
	}

	@Override
	public String toString() {
		return "Je suis l'étudiant "+prenom+" "+nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Filiere getFiliere() {
		return filiere;
	}

	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	
	
	
	
}
