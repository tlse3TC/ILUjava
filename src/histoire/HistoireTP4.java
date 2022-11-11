package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;
public class HistoireTP4 {

	public static void main(String[] args) {
		Commercant marco = new Commercant("Marco",20,"the");
		/*
		marco.direBonjour();
		marco.seFaireExtorquer();
		marco.recevoir(15);
		marco.boire();
		*/
		Yakuza yaku = new Yakuza("Yaku Le Noir",30,"whisky","Warsong");
		/*
		yaku.direBonjour();
		yaku.extorquer(marco);
		*/
		
		Ronin roro = new Ronin("Roro",60,"shochu");
		/*
		roro.direBonjour();
		roro.donner(marco);
		*/
		roro.provoquer(yaku);
	}

}
