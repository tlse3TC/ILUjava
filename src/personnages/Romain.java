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
	
	public void recevoirCoup(int forceCoup) {
		assert force>=0:"La force d'un romain est positive";
		int copieForce=force;
		
		force -= forceCoup;
		if (force > 0) {
			parler("Aie");
		} else {
			parler("J'abandonne...");
			}
		
		assert copieForce>=force:"La force d'un romain a diminiue";
	}
	
	public static void main(String[] args) {
		Romain minus = new Romain("Minus",6);
		minus.parler("Bonjour!");
		
		minus.recevoirCoup(4);
		System.out.println(Equipement.CASQUE);
        System.out.println(Equipement.BOUCLIER);
		
	}
}

