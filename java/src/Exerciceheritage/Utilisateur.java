package Exerciceheritage;

public class Utilisateur extends Personne{
	private String login;
	private String mdp;
	private String service;
	private Role role;
	
	
	public Utilisateur(String nom, String prenom, String mail, String tel, float salaire, String login, String mdp,
			String service, Role role) {
		super(nom, prenom, mail, tel, salaire);
		this.login = login;
		this.mdp = mdp;
		this.service = service;
		this.role = role;
	}
	
	public Utilisateur(String nom, String prenom, String mail, String tel, float salaire, Role role) {
		super(nom, prenom, mail, tel, salaire);
		this.role = role;
	}
	
	public Utilisateur(String login, String mdp, String service, Role role) {
		super();
		this.login=login;
		this.mdp=mdp;
		this.service=service;
		this.role=role;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}

	public double calculSal() {
		if(this.role.getLibelle().equals("Manager")) {
			return 1.1  * this.getSalaire();
		}
		else if(this.role.getLibelle().equals("directeur")) {
			return 1.4 * this.getSalaire();
		}
		else
			return super.calculSal();
	}
public String afficher() {
	return super.afficher()+", "+role.getLibelle() + "]";
}
	

}
