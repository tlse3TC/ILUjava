package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	private int nbTrophees=0;
	private Equipement[] trophees = new Equipement[100];

	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		}
	
	public String getNom() {
		return nom;
		}
	public void parler(String texte) {
		System.out.println(prendreParole() + "< " + texte + " >");
		}

	public void boirePotion(int forcePotion) {
		effetPotion=forcePotion;
		parler("Merci druide je sens que ma force est: "+effetPotion+" fois decuplee");
	}
	
	@Override
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
		}
	/// TP3 ////
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}

	public void frapper(Romain romain) {
	    System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
	    Equipement[] newTrophees = romain.recevoirCoup((force / 3) * effetPotion);
	    for (int i = 0; newTrophees != null && i < newTrophees.length; i++, nbTrophees++) {
	        this.trophees[nbTrophees] = newTrophees[i];
	    }
	}
	
	
	public void faireUneDonnation(Musee musee)  {
	    if (nbTrophees == 0) {
	        parler("Je n'ai pas de trophee");
	    } else {
	        parler("Je donne au musee tous mes trophees :");
	        for (int i = 0; i < nbTrophees; i++) {
	            if (trophees[i] != null) {
	                musee.donnerTrophees(this, trophees[i]);
	                System.out.println("- " + trophees[i]);
	            }
	        }
	    }
	}
	
	public static void main(String[] args) {
		
		Gaulois asterix =new Gaulois("Asterix",8);
		System.out.println(asterix.getNom());
		System.out.println(asterix);
		
		Romain minus = new Romain("Minus",3);
		asterix.boirePotion(4);
		
		asterix.parler("Bonjour!");
		asterix.frapper(minus);
		}
}
