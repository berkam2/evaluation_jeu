package Excercice;

public class Personne {

	private String nom;
	private int age;
	
	
	public Personne(String nom) {
		this.nom=nom;
	}
	
	public void setAge(int age) {
		if(age<18) {
			System.out.println("Interdit au moins de 18ans");
		}
		else {
		this.age=age;
		}
	}
public int getAge() {
	return this.age*365;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

}
