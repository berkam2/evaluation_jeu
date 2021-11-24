package Exercice;

public class Voiture extends Vehicule {
		public String identifier() {
			return super.identifier() + "; une voiture";
		};
		public String nombreRoues() {
			return "J'ai 4 roues";
		};
		public String typeCarburant() {
			return "Je roule au Diesel";
		};
		public String vitesseMax() {
			return "180 km/h";
		};

}

