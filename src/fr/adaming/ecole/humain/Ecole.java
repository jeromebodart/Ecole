package fr.adaming.ecole.humain;

public class Ecole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eleve leMeilleur = new Eleve();
		Eleve lePire = new Eleve();
		Eleve leTricheur = new Eleve();
		Prof leProf = new Prof();
		
		Prof leProfMath = new Prof("Master de Math�martiques", 2500);
		Prof leProfTechno = new Prof(2200);
		leProfMath.adresse ="24 rue des oliviers 4150 Djerba";
		leProfMath.age=29;
		leProfMath.nom = "Herbert";
		leProfMath.prenom = "Norbert";
		leProfMath.sex = 'H';
		
		leProfMath.enseigne();
		leMeilleur.apprendre();
		
		System.out.println(leProfMath.toString());
	}
}
