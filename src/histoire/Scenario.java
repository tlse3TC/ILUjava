package histoire;
import personnages.Romain;
import personnages.Druide;
import personnages.Gaulois;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix= new Gaulois("Asterix",8);
		Gaulois obelix= new Gaulois("Obelix",8);
		Romain minus= new Romain("Minus",6);
		Druide panoramix = new Druide("Panoramix",5,10);
		
		
		panoramix.preparerPotion();
		panoramix.booster(obelix);
		panoramix.booster(asterix);
		
		asterix.parler("Bonjour a tous");
		minus.parler("Un gaulois !!!");
		asterix.frapper(minus);
		asterix.frapper(minus);
		asterix.frapper(minus);
		

	}

}
