package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=4;
	
	
	public Yakuza(String nom, String boisson, int argent ,String clan) {
		super(nom, boisson, argent);
		this.clan=clan;
	}

	
	
	
	public void gagner(int gain) {
		parler("Ce ronin pensait vraiment battre "+this.getNom()+" du clan de "+this.clan+". Je l'ai depouiller de ces "+gain+" sous.");
		this.argent=this.argent+gain;
	}
	
	
	public int perdre() {
		int perte=this.argent;
		this.argent=0;
		parler("J'ai perdu mon duel et mes "+perte+" sous, snif... J'ai deshonore le clan de "+this.clan);
		return perte;
	}
	
	
	
	public void Extorquer(Commercant victime) {
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.getNom()+" si tu tiens a la vie donne moi ta bourse !");
		int gain=victime.seFaireExtorquer();
		this.argent=this.argent+gain;
		parler("J'ai piquer les "+gain+" sous de "+victime.getNom()+", ce qui me fait "+this.argent+" sous dans ma poche.");
		this.setReputation(this.getReputation()+1);
	}



	public int getReputation() {
		return reputation;
	}



	public void setReputation(int reputation) {
		this.reputation = reputation;
	}

}
