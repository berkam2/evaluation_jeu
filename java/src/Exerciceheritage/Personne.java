package Exerciceheritage;

public class Personne {
	
	private String nom;
	
	private String prenom;
	
	private String mail;
	
	private String tel;
	
	private float salaire;

	public Personne(String nom, String prenom, String mail, String tel, float salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.salaire = salaire;
	}

	public Personne() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public float getSalaire() {
		return salaire;
	}

	public void setSalaire(float salaire) {
		this.salaire = salaire;
	}

	public double calculSal() {
		return this.salaire;
	}

	public String afficher() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", tel=" + tel + ", salaire="
				+ salaire;
	}
		
	
	}
