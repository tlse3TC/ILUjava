package personnages;

public class Romain {
	private String nom;
	private int force;
	
	private Equipement [] equipements;
	int nbEquipement =0;
	
	private String texte;
	
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
	
	
	
	/*
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
	
	*/
	
	
	/*        TP3        */
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
			// précondition
			assert force > 0;
			int oldForce = force;
			forceCoup = calculResistanceEquipement(forceCoup);
			force -= forceCoup;
			// if (force > 0) {
			// 		parler("Aïe");
			// } else {
			// 		equipementEjecte = ejecterEquipement();
			// parler("J'abandonne...");
			// }
			if (force==0) {
				parler("Aïe");
			} else {
				equipementEjecte = ejecterEquipement();
				parler("J'abandonne...");
				}
			// post condition la force a diminuée
			assert force < oldForce;
			return equipementEjecte;
			}
	
	
	
	
	private int calculResistanceEquipement(int forceCoup) {
		texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
		if (nbEquipement != 0) {
			texte += "\nMais heureusement, grace à mon équipement sa force est diminué de ";
			for (int i = 0; i < nbEquipement;i++) {
				if (equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) {
					resistanceEquipement += 8;
				} else {
					System.out.println("Equipement casque");
					resistanceEquipement += 5;}
				}
			texte = texte + resistanceEquipement + "!";
		}
		parler(texte);
		forceCoup -= resistanceEquipement;
		if (forceCoup<0) {
			forceCoup = 0;
		}
		return forceCoup;
		}
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		//TODO
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				nbEquipement = nbEquipement-1 ;} //Ajout test 
				}
			return equipementEjecte;
			}

		
		
/*      FIN TP3     */
	
	
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
	
	
	
	public int getForce() {
		// TODO Auto-generated method stub
		return force;
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

