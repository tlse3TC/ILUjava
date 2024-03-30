package personnages;

public class Musee {
	private Trophee[] trophees;
	private int nbTrophee=0;
	
	public Musee() {
		this.trophees = new Trophee[200];
	}

	
	
	
	
	public void donnerTrophees(Gaulois gaulois,Equipement equipment) {
		trophees[nbTrophee]=new Trophee(gaulois, equipment);
		nbTrophee++;
	}

}
