package personnages;

public class Humain {
	protected String nom;
	protected int argent;
	private String boissonF;
	

	
	public Humain(String nom, int argent, String boissonF) {
		super();
		this.nom = nom;
		this.argent = argent;
		this.boissonF = boissonF;}
	
	
	
	
	
	protected void parler(String texte) {
		System.out.println(this.nom+" - << "+texte+" >>");
	}
	
	
	
	public void direBonjour() {
		parler("Bonjour ! Je m'appelle "+nom+" et j'aime boire du "+boissonF);
	}
	
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonF+" ! GLOUPS !");
	}
	
	
	public void acheter(String bien,int prix) {
		if (prix>argent) {
			parler("Je n'ai plus que "+argent+" argent en poche. Je ne peux meme pas m'offrir un "+bien+" a "+prix+" sous.");
		} else {
			parler("J'ai "+argent+" sous en poche. Je vais pouvoir m'offrir un "+bien+" a "+prix+" sous.");
			perdreArgent(prix);
		}
	}
	
	
	private void gagnerArgent(int gain) {
		this.argent+=gain;
	}
	
	private void perdreArgent(int perte) {
		this.argent-=perte;
	}


	@Override
	public String toString() {
		return "Humain [Nom =" + nom + ", Argent =" + argent +", Boisson ="+boissonF+"]";
	}


	public static void main(String[] args) {
		Humain prof=new Humain("Prof",54,"kombucha");
		prof.direBonjour();
		prof.acheter("boisson", 12);
		prof.boire();
		prof.acheter("jeu", 2);
		prof.acheter("kimono", 50);
		//System.out.println(prof);
	}
}
