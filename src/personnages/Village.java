package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois [] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	
	public String getNom() {
		return nom;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		this.villageois[nbVillageois] = gaulois;
		this.nbVillageois = nbVillageois+1;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
		
	}
	
	public void afficherVillageois(Village village) {
		System.out.println("Dans le village du chef "+ chef.getNom()+" vivent les legendaires gaulois:");
		for (int i=0; i<nbVillageois; i=i+1) {
			System.out.println(" - " + village.villageois[i].getNom());
		}
	}
	
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles",30);
		
		
		//Gaulois abraracourcix = new Gaulois("Abraracourcix", 6);
		Chef abraracourcix = new Chef("Abraracourcix",6,village);
		village.setChef(abraracourcix);
		Gaulois asterix = new Gaulois("Asterix", 8);
		Gaulois obelix = new Gaulois("Obelix", 25);
		village.ajouterHabitant(asterix);
		village.ajouterHabitant(obelix);
		
		village.afficherVillageois(village);
		//Gaulois gaulois = village.trouverHabitant(1);
		//System.out.println(gaulois);
		
		
	}
	
}