package Exercice;

public class Vehicule {
	private int contenanceReservoir;
	private int contenuReservoir;

	public String identifier() {
		return "Je suis un véhicule";
	}
	public Vehicule() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Vehicule(int contenanceReservoir, int contenuReservoir) {
		super();
		this.contenanceReservoir = contenanceReservoir;
		this.contenuReservoir = contenuReservoir;
	}
	public float fairePlein(String Pompe) {
		return (contenanceReservoir - contenuReservoir);
	}
	
}

