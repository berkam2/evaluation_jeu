package Evaluation_Jeu;

public class Personnage {

	

	private String nom;
	private int sante=10;
	private int experience=1;
	private int force;
	private Arme arme;
	
	
	
	public Personnage(String nom, int sante, int experience, int force, Arme arme) {
		super();
		this.nom = nom;
		this.sante = sante;
		this.experience = experience;
		this.force = force;
		this.arme = arme;
	}


	public Personnage(String nom,int force) {
		super();
		this.nom = nom;
		this.force = force;
	}
	


	
	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getSante() {
		return sante;
	}


	public void setSante(int sante) {
		this.sante = sante;
	}


	public int getExperience() {
		return experience;
	}


	public void setExperience(int experience) {
		this.experience = experience;
	}


	public int getForce() {
		return force;
	}


	public void setForce(int force) {
		this.force = force;
	}


	public Arme getArme() {
		return arme;
	}


	public void setArme(Arme arme) {
		this.arme = arme;
	}


	@Override
	public String toString() {
		return "Personnage [nom=" + nom + ", sante=" + sante + ", experience=" + experience + ", force=" + force
				+ ", arme=" + arme + "]";
	}


	public Arme desarmer() {
		return arme = null;
	}
	
	public Arme changerArme(Arme arme) {
		return this.arme=arme;
	}
	public void attaquer(Personnage personnage){
		if(personnage.getSante()==0) {
			System.out.println(personnage + " est mort");}
		else if(this.sante==0) {
			System.out.println(this.nom + " est mort");
		}
		else {
		if((personnage.getForce()*personnage.getExperience()*personnage.getSante()*personnage.getArme().getPuissance())
				>
		(this.force*this.experience*this.sante*this.arme.getPuissance())){
			personnage.setForce(personnage.getForce()+1);
			this.sante-=1;
			this.experience+=1;
			personnage.setExperience(personnage.getExperience()+1);
			System.out.println(personnage.getNom() + " a gagné et " + this.nom + " a perdu");
		}
		else if((personnage.getForce()*personnage.getExperience()*personnage.getSante())
				<
		(this.force*this.experience*this.sante*this.arme.getPuissance())){
			this.force+=1;
			personnage.setSante(personnage.getSante()-1);
			personnage.setExperience(personnage.getExperience()+1);
			this.experience+=1;
			System.out.println(this.nom + " a gagné et " + personnage.getNom() + " a perdu");
		}
	}
	}
	
}
