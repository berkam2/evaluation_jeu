package serie_exercice3;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Specialite un = new Specialite("JAVA/JEE");
		Specialite deux = new Specialite("HTML/CSS");
		Specialite trois = new Specialite("Gestion de Projet");
		Specialite quatre = new Specialite("JS");
		Specialite cinq = new Specialite("PHP");
		
		
		Enseignant eun = new Enseignant("Jean",un);
		Enseignant edeux = new Enseignant("Paul",un);
		Enseignant etrois = new Enseignant("Pierre",cinq);
		Enseignant equatre = new Enseignant("Jacques",quatre);
		
		ArrayList<Specialite> specialites = new ArrayList<Specialite>();
		specialites.add(un);
		specialites.add(deux);
		specialites.add(trois);
		specialites.add(quatre);
		specialites.add(cinq);
		
		
		ArrayList<Enseignant> enseignants = new ArrayList<Enseignant>();
		enseignants.add(eun);
		enseignants.add(edeux);
		enseignants.add(etrois);
		enseignants.add(equatre);
		
		for(Specialite specialite:specialites) {
			System.out.println(specialite);
			for(Enseignant enseignant:enseignants) {
				if(enseignant.getSpec().equals(specialite)) {
					System.out.println(enseignant.getName());
				}
	else {System.out.println("Aucun enseignant pour la spécialité"+specialite);}
			}
		}
	}

	
}
