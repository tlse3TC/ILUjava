package personnages;


public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion =1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreParole() + "<< " + texte + " >>");
	}
	
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";

	}
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
	}
	
	@Override
	public String toString () {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
		
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide je sens que ma force est "+ effetPotion+" fois décuplée.");
	}
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
		System.out.println(asterix);
		
		asterix.parler("Je suis un test");
		
		Romain jule = new Romain("Jule",8);
		asterix.frapper(jule);
		asterix.boirePotion(4);
		//TODO cr�er un main permettant de tester la classe Gaulois
		
	}
}
