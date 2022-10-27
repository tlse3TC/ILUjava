package personnages;


public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion =1;
	
	/*   TP3   */
	private int nbTrophees;
	public Equipement[] trophees = new Equipement[100];
	/* FIN TP3  */
	
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
	/*
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		romain.recevoirCoup((force / 3)*effetPotion);
	}
	*/
	
	
	
	/*   TP3   */
	
	public void frapper(Romain romain) {
		System.out.println(nom + " envoie un grand coup dans la machoire de " + romain.getNom());
		Equipement[] tropheesAcqui = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; tropheesAcqui != null && i < tropheesAcqui.length; i++, nbTrophees++) {
			this.trophees[nbTrophees] = tropheesAcqui[i];}
		}
	
	
	
	

	public void faireUneDonnation(Musee musee) {
		parler("Je donne au musee tous mes trophees:");
		for (int i=0;i<nbTrophees;i++) {
			System.out.println(trophees[i]);
		}
		
	}
	
	/* FIN TP3  */
	

	
	
	
	@Override
	public String toString () {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
		
	}
	
	public void boirePotion(int forcePotion) {
		effetPotion = forcePotion;
		parler("Merci Druide je sens que ma force est "+ effetPotion+" fois decuplee.");
	}
	
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix", 8);
		System.out.println(asterix);
		
		asterix.parler("Je suis un test");
		
		Romain jule = new Romain("Jule",8);
		asterix.frapper(jule);
		asterix.boirePotion(4);
		//TODO
		
	}
}
