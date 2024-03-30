package personnages;

public class Commercant extends Humain {
	
	public Commercant(String nom, String boisson, int argent) {
		super(nom, boisson, argent);
	}

	
	
	public int seFaireExtorquer() {
		parler("J'ai tout perdu! Le monde est trop injuste");
		int argentperdu=this.argent;
		this.argent=0;
		return (argentperdu);
	}
	
	public void recevoirArgent(int argent) {
		parler(argent+" sous ! Je te remercie genereux donateur !");
		gagnerArgent(argent);
	}
}
