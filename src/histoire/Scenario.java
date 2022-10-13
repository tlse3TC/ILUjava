package histoire;
import personnages.Romain;
import personnages.Druide;
import personnages.Gaulois;

public class Scenario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Druide Panoramix = new Druide("Panoramix", 5,10);
		Gaulois Asterix = new Gaulois("Asterix",8);
		Gaulois Obélix = new Gaulois("Obélix",8);
		Panoramix.parler("Je vais aller pr�parer une petite potion...");
		Panoramix.booster(Obélix);
		Obélix.parler("Par Bénélos, ce n'est pas juste!");
		Panoramix.booster(Asterix);
		Asterix.parler("Bonjour");
		
		
		Romain Minus = new Romain("Minus",6);
		Minus.parler("UN GAU... UN GAUGAU...");
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
		Asterix.frapper(Minus);
		

	}

}
