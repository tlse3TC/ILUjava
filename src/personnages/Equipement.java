package personnages;

public enum Equipement {
	CASQUE("Casque"),
	BOUCLIER("Bouclier");
	
	Equipement(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}


	private String nom;
	
}
