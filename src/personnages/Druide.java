package personnages;

import java.util.Random;

public class Druide {
	private String nom;
	private int forcePotion=1;
	private int effetPotionMin;
	private int effetPotionMax;
	
	public Druide(String nom, int effetPotionMin, int effetPotionMax) {
		this.nom = nom;
		this.effetPotionMin = effetPotionMin;
		this.effetPotionMax = effetPotionMax;
	
		parler("Bonjour, je suis le druide " + nom + " et ma potion peut aller d'une force " + effetPotionMin + " a " + effetPotionMax + ".");
		}
	
	public String getNom() {
		return nom;
		}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "< " + texte + ">");
		}
	
	private String prendreParole() {
		return "Le druide " + nom + " : ";
		}
	
	public void preparerPotion() {
		Random random = new Random();
		this.forcePotion = random.nextInt(effetPotionMin,effetPotionMax);
		
		if (forcePotion > 7) {
			parler("J'ai preparer une super potion!");
		} else {
			parler("Je n'ai pas trouver tout les ingredients ma potion est seulement de force: " +forcePotion);
		}
	}
	
	public void booster(Gaulois gaulois) {
		if ("Obelix".equals(gaulois.getNom()) ) {
			parler("Non, Obelix !... Tu n auras pas de potion magique !");
			} else { 
				//preparerPotion();
				gaulois.boirePotion(forcePotion);
				}
			}
		
		
	
	public static void main(String[] arg) {
		Druide panoramix = new Druide("Panoramix", 5, 10);
		panoramix.preparerPotion();
	}
}
