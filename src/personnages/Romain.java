package personnages;

public class Romain {
	private String nom;
	private int force;
	
	private Equipement[] equipements;
	private int nbEquipement=0;
	
	public Romain(String nom, int force) {
		this.nom = nom;
		this.force = force;
		assert force>=0: "La force d'un romain est toujours positive";
		
		this.equipements=new Equipement[2];
		}
	
	public String getNom() {
		return nom;
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "< " + texte + ">");
		}
	
	private String prendreParole() {
		return "Le romain " + nom + " : ";
		}
	
	/////TP3 //////
	
	public Equipement[] recevoirCoup(int forceCoup) {
		Equipement[] equipementEjecte = null;
		// précondition
		assert force > 0;
		int oldForce = force;
		forceCoup = calculresistanceEquipement(forceCoup);
		force -= forceCoup;
		
		if (force>0) {
				parler("Aie");
				equipementEjecte = ejecterEquipement();
		} else {
				parler("J'abandonne...");
			}
		// post condition la force a diminuée
		assert force <= oldForce;
		return equipementEjecte;
		}

	
	public void sEquiper(Equipement equipement) {
		switch (nbEquipement) {
		case 2: 
			
			System.out.println("Ce romain est deja bien proteger");
			break;
		
		case 1: 
			
			if (this.equipements[1]== equipement) {
				System.out.println("Ce romain possede deja un "+equipement);
			} else {
				System.out.println("Ce romain s equipe avec un "+equipement);
				this.equipements[nbEquipement]=equipement;
				nbEquipement=nbEquipement+1;
			}
			break;
		
		default:
			System.out.println("Ce romain s equipe avec un "+equipement);
			this.equipements[nbEquipement]=equipement;
			nbEquipement=nbEquipement+1;
		}
	}
	

	
	private int calculresistanceEquipement(int forceCoup) {
		String texte = "Ma force est de " + this.force + ", et la force du coup est de " + forceCoup;
		int resistanceEquipement = 0;
	    
	    for (int i = 0; i < nbEquipement; i++) {
	        if (equipements[i] != null && equipements[i].equals(Equipement.BOUCLIER)) {
	            resistanceEquipement += 8;
	        } else {
	            resistanceEquipement += 5;
	        }
	    }
	    
	    texte += "\nMais heureusement, grace a mon equipement sa force est diminue de " + resistanceEquipement + "!";
	    parler(texte);
	    
	    forceCoup -= resistanceEquipement;
	    if (forceCoup < 0) {
	        forceCoup = 0;
	    }
	    
	    return forceCoup;
	}
		
	
	private Equipement[] ejecterEquipement() {
		Equipement[] equipementEjecte = new Equipement[nbEquipement];
		System.out.println("L'équipement de " + nom + " s'envole sous la force du coup.");
		int nbEquipementEjecte = 0;
		for (int i = 0; i < nbEquipement; i++) {
			if (equipements[i] != null) {
				equipementEjecte[nbEquipementEjecte] = equipements[i];
				nbEquipementEjecte++;
				equipements[i] = null;
				nbEquipement=nbEquipement-1;
				}
			}
		return equipementEjecte;
		}

	
	public int getForce() {
		return force;
	}
//// FIN TP3 /////
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.parler("Bonjour!");
		
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.CASQUE);
		minus.sEquiper(Equipement.BOUCLIER);
		
		minus.recevoirCoup(4);
//		System.out.println(Equipement.CASQUE);
//        System.out.println(Equipement.BOUCLIER);
		
	}
}

