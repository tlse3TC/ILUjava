package histoire;
import personnages.Romain;
import personnages.Druide;
import personnages.Gaulois;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Druide panoramix = new Druide("Panoramix", 5,10);
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois obelix = new Gaulois("Obelix",8);
		panoramix.parler("Je vais aller preparer une petite potion...");
		panoramix.booster(obelix);
		obelix.parler("Par Benelos, ce n'est pas juste!");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		
		
		Romain Minus = new Romain("Minus",6);
		Minus.parler("UN GAU... UN GAUGAU...");
		asterix.frapper(Minus);
		asterix.frapper(Minus);
		asterix.frapper(Minus);
		

	}

}
