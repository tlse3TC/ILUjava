package histoire;
import personnages.Commercant;
import personnages.Humain;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {

	public static void main(String[] args) {
//		Humain prof=new Humain("Prof","kombucha",54);
//		prof.direBonjour();
//		prof.acheter("Boisson", 12);
//		prof.boire();
//		prof.acheter("Jeu", 2);
//		prof.acheter("Kimono", 50);
		
		Commercant marco = new Commercant("Marco","the",20);
		Yakuza yaku = new Yakuza("Yaku", "Whisky", 30, "Warsong");
//		yaku.direBonjour();
//		yaku.Extorquer(marco);
//		
//		Ronin roro= new Ronin("Roro", "Sake", 20);
//		roro.direBonjour();
//		roro.donner(marco);
		
		Ronin roro = new Ronin("Roro", "Sake", 20);
		roro.provoquer(yaku);
	}

}
