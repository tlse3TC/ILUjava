package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] Villageois;
	private int nbVillageois=0;
	
	public Village(String nom,int nbVillageoisMaximum) {
		this.nom = nom;
		this.Villageois = new Gaulois[nbVillageoisMaximum];
		}
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void ajouterHabitant(Gaulois gaulois) {
		
		this.Villageois[nbVillageois]=gaulois;
		this.nbVillageois=nbVillageois+1;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return Villageois[numero];
	}
	
	public String getNom() {
		return nom;
		}
	
	public void afficherVillageois (Village village) {
		System.out.println("Dans le "+nom +" du chef " +chef.getNom() +" vivent les legendaires gaulois: ");
		for (int i=0;i<nbVillageois;i=i+1) {
			System.out.println("- "+Villageois[i].getNom() );
		} 
	}
	
	public static void main(String[] arg) {
		Village irreductible = new Village("Village des irreductibles",30);
		Chef abra = new Chef("Abraracourcix",6, irreductible);
		Gaulois asterix =new Gaulois("Asterix",8);
		Gaulois obelix =new Gaulois("Obelix",8);
		
		irreductible.setChef(abra);
		irreductible.ajouterHabitant(asterix);
		irreductible.ajouterHabitant(obelix);
		//Gaulois gaulois = irreductible.trouverHabitant(1);
		
		irreductible.afficherVillageois(irreductible);

		
		
		//Gaulois gaulois = Village.trouverHabitant(30);

	}
}

