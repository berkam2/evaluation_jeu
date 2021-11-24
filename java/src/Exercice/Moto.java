package Exercice;

public class Moto extends Vehicule {
	public String identifier() {
		return super.identifier() + "; une moto";
	};
	public String nombreRoues() {
		return "J'ai 2 roues";
	};
	public String typeCarburant() {
		return "Essence";
	};
	public String vitesseMax() {
		return "100km/h";
	};

}
