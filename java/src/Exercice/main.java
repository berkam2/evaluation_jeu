package Exercice;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		/*int chiffre = scanner.nextInt();
		boolean premier = true;
		for(int i = 2;i<chiffre;i++) {
			if((chiffre%i)==0){
				System.out.println(chiffre + " n'est pas premier");
				premier=false;
				break;
			}
			
		}
		if(premier==true){System.out.println(chiffre +" est premier");}
	*/
		
		String mot = scanner.next();
		String motInverse="";
		for(int i=0;i<mot.length();i++) {
			motInverse+=mot.charAt(mot.length()-i-1);
		}
		System.out.println(motInverse);
	
	}

}
