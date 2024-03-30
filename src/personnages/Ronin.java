package personnages;

public class Ronin extends Humain {
	private int honneur=1;

	public Ronin(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
		// TODO Auto-generated constructor stub
	}

	
	
	public void provoquer(Yakuza adversaire) {
		
		int force=2*this.honneur;
		if (force>=adversaire.getReputation()) {
			parler("Je t'ai retrouver vermine, tu vas payer pour ce que tu as fait a ce pauvre marchant!");
			parler("Je t'ai eu petit yakuza");
			int gain=adversaire.perdre();
			this.argent=this.argent+gain;
			this.honneur=this.honneur+1;
			
		} else {
			parler("J'ai perdu contre ce yakuza mon honneur et ma bourse en ont pris un coup.");
			adversaire.gagner(this.argent);
			
			this.argent=0;
			this.honneur=this.honneur-1;
			
		}
	}
	
	public void donner(Commercant beneficiaire) {
		int argentDonner=(int) (this.argent*0.1);
		this.argent=this.argent-argentDonner;
		parler(beneficiaire.getNom()+" prend ces "+argentDonner+" sous.");
		beneficiaire.recevoirArgent(argentDonner);
	}
}
