package Evaluation_Jeu;

public class Arme {
	private String nom;
	private int puissance;
	enum type{
		EPEE,
		COUTEAU,
		MASSE,
		PISTOLET,
		ARC
	}
	
	public Arme(String nom, int puissance) {
		super();
		this.nom = nom;
		this.puissance = puissance;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	@Override
	public String toString() {
		return "[nom=" + nom + ", puissance=" + puissance + "]";
	}
	
	
	
	
	
}
