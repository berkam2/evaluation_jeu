package Evaluation_Jeu;

import java.util.Random;

public class Main_Evaluation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int nb;
		int nb1;
		nb = 5 + random.nextInt(6);
		nb1= 5 + random.nextInt(6);
		
		Personnage Mario = new Personnage("Mario",nb);
		Personnage Java = new Personnage("Java",nb1);
		Arme trion = new Arme("trion",5);
		Arme prion = new Arme("prion",9);
		Mario.changerArme(trion);
		Java.changerArme(prion);
		System.out.println(Mario);
		System.out.println(Java);
		Mario.attaquer(Java);
		System.out.println(Mario);
		System.out.println(Java);
		Mario.attaquer(Java);
		Mario.attaquer(Java);
		System.out.println(Mario);
		System.out.println(Java);
		Mario.attaquer(Java);
		Mario.attaquer(Java);
		Mario.attaquer(Java);
		Mario.attaquer(Java);
		Mario.attaquer(Java);
		Mario.attaquer(Java);
		System.out.println(Mario);
		System.out.println(Java);
		Mario.attaquer(Java);
		Mario.attaquer(Java);
		System.out.println(Mario);
		System.out.println(Java);
	}


}
