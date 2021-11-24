package Excercice;

public class Personnetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Personne joueur1 = new Personne("Jason");
		Personne joueur2 = new Personne("Mike");
		joueur1.setAge(25);
		System.out.println(joueur1.getAge());
		//Un an plus tard 
		joueur1.setAge(34);
		System.out.println(joueur1.getAge());
		joueur2.setAge(45);
		System.out.println(joueur2.getAge());
		
	}

}

