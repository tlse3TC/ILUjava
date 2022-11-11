package personnages;

public class Ronin extends Humain {
	
	private int honneur=1;

	public Ronin(String nom, int argent, String boissonF) {
		super(nom, argent, boissonF);
		// TODO Auto-generated constructor stub
	}

	
	public void donner(Commercant beneficiaire) {
		int argentdonner=(int) (this.argent*0.10);
		parler(beneficiaire.nom+" prend ces "+argentdonner+" sous.");
		beneficiaire.recevoir(argentdonner);
		this.argent-=argentdonner;
	}
	
	
	public void provoquer(Yakuza adversaire) {
		parler("Je t'ai retrouve vermine, tu vas payer pour ce que tu as fait a ce pauvre marchant!");
		int force =this.honneur*2;
		
		if (force >= adversaire.reputation) {
			parler("Je t'ai eu petit Yakuza!");
			int gain=adversaire.perdre();
			
			this.argent+=gain;
			this.honneur+=1;
		} else {
			parler("J'ai perdu contre ce Yakuza mon honneur et ma bourse en ont pris un coup");
			int gain=this.argent;
			this.argent=0;
			this.honneur-=1;
			adversaire.gagner(gain);
			
		}
	}
	

}
