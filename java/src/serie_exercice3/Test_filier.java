package serie_exercice3;

import java.util.ArrayList;

public class Test_filier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Filiere informatique = new Filiere("informatique");
		Filiere techno = new Filiere("techno de l'info et de la comm");
		Filiere genie = new Filiere("Genie civil");

		Etudiant un = new Etudiant("Kamsu","Bertrand",informatique);
		Etudiant deux = new Etudiant("Camara","Moussa",informatique);
		Etudiant trois = new Etudiant("Tamo","Paul",techno);
		Etudiant quatre = new Etudiant("Dupont","Jean",genie);
		Etudiant cinq = new Etudiant("Bart","Simpson",genie);
		
		
		ArrayList<Filiere> filieres = new ArrayList<Filiere>();
		filieres.add(genie);
		filieres.add(techno);
		filieres.add(informatique);
		
		ArrayList<Etudiant> etudiants = new ArrayList<Etudiant>();
		etudiants.add(un);
		etudiants.add(deux);
		etudiants.add(trois);
		etudiants.add(quatre);
		etudiants.add(cinq);
		
		for(Filiere filiere : filieres) {
			System.out.println(filiere);
			for(Etudiant etudiant:etudiants) {
				if(etudiant.getFiliere().equals(filiere)) {
					System.out.println(etudiant);
				}
				else if(etudiant.getFiliere().equals(filiere)) {
					System.out.println(etudiant);
				}
				else if(etudiant.getFiliere().equals(filiere)) {
					System.out.println(etudiant);
				}
			}
		}
	
	}
	

}
