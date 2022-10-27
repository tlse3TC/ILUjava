package personnages;

public class Musee {
	private String nom;
	private Trophee[] listeTrophee;
	private int nbTrophee = 0;
	
	
	
	private void donnerTrophees(Gaulois gaulois,Equipement equipement) {
		listeTrophee[nbTrophee]=new Trophee(gaulois,equipement);
		nbTrophee +=1;
		return;
	}

}
