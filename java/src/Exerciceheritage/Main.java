package Exerciceheritage;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Role cp = new Role("CP","Chef de projet");
		Role mn = new Role("MN","Manager");
		Role dp = new Role("DP","Directeur projet");
		Role drh = new Role("DRH","Directeur des ressources humaines");
		Role dg = new Role("DG","Directeur General");
		
		
		Utilisateur cda = new Utilisateur("Afpa","ouou","Bertrand","0758799635",12000,dg);
		Utilisateur adc = new Utilisateur("afpa","ojoj","bertrand","018988298",12222,mn);
		Utilisateur dca = new Utilisateur("Apfa","oiuoiu","trandber","03989U834",18899,drh);
	
		
		System.out.println(cda.afficher());
		System.out.println(adc.afficher());
		System.out.println(dca.afficher());
		
		
		System.out.println("Calcul de salaire" + adc.calculSal());
		
	}

}
