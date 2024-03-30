package personnages;

public class Humain {
	
	private String nom;
	private String boisson;
	protected int argent;
	
	
	public Humain(String nom, String boisson, int argent) {
		this.nom = nom;
		this.boisson = boisson;
		this.argent = argent;
	}
	
	
	public String getNom() {
		return this.nom;
	}
	
	public int getArgent() {
		return this.argent;
	}
	
	
	protected void parler(String texte) {
		System.out.println("-"+this.nom+": "+ texte);
	}
		
		
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+getNom()+" et j'aime boire du "+this.boisson);
	}
	
	
	public void boire() {
		parler("Mmm, un bon verre de "+this.boisson+" ! GLOUPS !");
	}
	
	
	public void acheter(String bien, int prix) {
		if (this.argent<prix) {parler("Je n'ai plus que "+this.argent+" sous en poche. Je ne peux meme pas m'offrir un "+bien+" a "+prix+" sous");
		} else {
			parler("J'ai "+ this.argent+ " sous en poche. Je vais pouvoir m'offrir un "+bien+" a "+prix+" sous");
			this.argent=this.argent-prix;
		}
	}
	
	
	public void gagnerArgent(int gain) {
		this.argent=this.argent+gain;
	}
	
	public void perdreArgent(int perte) {
		this.argent=this.argent-perte;
		}
}
