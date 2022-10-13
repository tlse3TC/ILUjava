package personnages;
import java.util.Random;

public class Druide {
	private String nom;
	private int effetPotionMin;
	private int effetPotionMax;
	private int forcePotion = 1;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " à " + effetPotionMax + ".");
		
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<<" + texte + ">>");
	}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
	}
	
	@Override
	public String toString () {
		return "Druide [nom=" + nom + ", forceMinPotion=" + effetPotionMin + ", forceMaxPotion=" + effetPotionMax + "]";
		
	}
	
	
	public void preparerPotion() {
		Random random = new Random();
		this.forcePotion = effetPotionMin+ random.nextInt(effetPotionMax-effetPotionMin);
		
		if (forcePotion > 7) {
			parler("J'ai préparer une super potion de force");
		} else {
			parler("Je n'ai pas trouvé tous les ingrédients, ma potion est seulemnt de force:"+forcePotion);
		}
	}
	
	
	public void booster(Gaulois gaulois) {
		if (gaulois.getNom() == "Obélix") {
				parler("Non, Obélix !... Tu n'auras pas de potion magique");
		} else {
			preparerPotion();
			gaulois.boirePotion(forcePotion);
		}
	}

	public static void main(String[] args) {
		Druide Panoramix = new Druide("Panoramix", 5,10);
		System.out.println(Panoramix);
		
		Panoramix.preparerPotion();
		
		//TODO cr�er un main permettant de tester la classe Gaulois
		
	}
	
}
