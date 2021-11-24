package Excercice;


public class Tasktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task tache1 = new Task("Java","Faire un tutoriel");
		Task tache2 = new Task("UGC","Aller au cinema");
		Task tache3 = new Task ("Du tutoriel","Dire mamamilla à la fin");
		System.out.println(tache2.description);
		tache2.complete();
		System.out.println(tache1.completed);
		System.out.println(tache2.completed);
		System.out.println(tache1.title);
		
	}

}
