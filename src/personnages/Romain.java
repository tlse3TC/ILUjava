package personnages;

public class Romain {
	private String nom;
	private int force;
	
	private Equipement [] equipements;
	int nbEquipement =0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		
		this.equipements= new Equipement[2];
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
		
	}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
	}
	
	@Override
	public String toString() {
		return "Romain [Nom =" + nom + ", Force =" + force +"]";
	}
	
	public void recevoirCoup(int forceCoup) {
		int forcetemp=force;
		force -= forceCoup;
		assert (force>0);
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
		}
		assert (force <forcetemp);
	}
	
	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
			case 2:
				System.out.println("Le soldat "+ this.nom +" est déjà bien protégé !");
				break;
				
			case 1:
				if (equipements[nbEquipement-1]==equipement) {
					System.out.println("Le soldat "+ this.nom +" possede deja un "+equipement);
				} else {
					System.out.println("Le soldat "+ this.nom +" s'equipe avec un "+equipement);
					equipements[nbEquipement]=equipement;
					nbEquipement+=1;
				}
				break;
				
			default:
				System.out.println("Le soldat "+ this.nom +" s'equipe avec un "+equipement);
				equipements[nbEquipement]=equipement;
				nbEquipement+=1;
		}
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		System.out.println(minus);
		minus.parler("ceci est un test 2");
		minus.recevoirCoup(5);
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		minus.sEquiper(Equipement.BOUCLIER);
		
		
	}

}

