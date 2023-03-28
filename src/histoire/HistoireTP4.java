package histoire;
import personnages.Humain;
import personnages.Commercant;

public class HistoireTP4 {

	public static void main(String[] args) {
		Humain Prof = new Humain("Prof", "kombucha", 54);

        Prof.direBonjour();
        Prof.acheter("une boisson", 12);
        Prof.boire();
        Prof.acheter("un jeu", 2);
        Prof.acheter("kimono", 50);
        
        Commercant marco = new Commercant("Marco", 15);

        // interaction avec le commerçant
        marco.direBonjour();
        marco.perdreArgent(marco.seFaireExtorquer());
        marco.direBonjour();
        marco.recevoir(15);
        marco.boire();


	}

}
