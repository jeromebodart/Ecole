package fr.adaming.ecole.humain;

public class Humain {

	String  nom;
	String prenom;
	int age;
	String adresse;
	char sex;
	
	public Humain() {
		this.nom = "jk";
		this.prenom = "klbhv";
		this.age = 25;
		this.adresse = "ljnml,";
		this.sex = 'F';
	}
	
	public Humain(String nom, String prenom, int age, String adresse, char sex) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.adresse = adresse;
		this.sex = sex;
	}
	public void marcher(int distance) {
	}
	
	public void parler() {
		
	}


}
