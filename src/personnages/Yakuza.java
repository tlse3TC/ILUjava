package personnages;

public class Yakuza extends Humain {
	private String clan;
	int reputation=0;

	public Yakuza(String nom, int argent, String boissonF,String clan) {
		super(nom, argent, boissonF);
		this.clan=clan;
		
		// TODO Auto-generated constructor stub
	}
	
	
	public void extorquer(Commercant victime) {
		parler("Tiens, tiens ne serait-ce pas un faible marchand qui passe par la ?");
		parler(victime.nom+", si tu tiens a la vie donne moi ta bourse !");
		int argentVoler=victime.argent;
		this.argent+=argentVoler;
		victime.seFaireExtorquer();
		parler("J'ai pique les "+argentVoler+" sous de "+victime.nom+" , ce qui me fait "+this.argent+" sous dans ma poche. Hi ! Hi !");
		
	}

	
	public int perdre() {
		int argentPerdu=this.argent;
		this.argent=0;
		this.reputation-=1;
		parler("J'ai perdu mon duel et mes "+argentPerdu+" sous, snif... J'ai deshonore le clan "+this.clan+".");
		return argentPerdu ;
		
	}
	
	public int gagner(int gain) {
		this.argent+=gain;
		this.reputation-=1;
		parler("Ce ronin pensait vraiment battre "+this.nom+" du clan "+this.clan+". Je l'ai depouille de ses "+gain+" sous.");
		return argent;
		
	}
}
