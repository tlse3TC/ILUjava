package personnages;

public class Commercant extends Humain {

	public Commercant(String nom, int argent, String boissonF) {
		super(nom, argent, "the");
		//this.boissonF="the";
		// TODO Auto-generated constructor stub
	}
	

	
	public int seFaireExtorquer() {
		this.argent=0;
		parler("J'ai tout perdu! Ce monde est trop injuste...");
		return this.argent;
		
	}
	
	public void recevoir(int argent) {
		this.argent+=argent;
		parler(argent+" sous ! Je te remercie genereux donateur!");
	}
	
}
