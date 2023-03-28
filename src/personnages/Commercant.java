package personnages;
import personnages.Humain;

public class Commercant extends Humain {

    public Commercant(String nom, int argent) {
        super(nom, "th�", argent);
    }

    public int seFaireExtorquer() {
        int argentPerdu = getArgent();
        perdreArgent(argentPerdu);
        parler("Oh non, on m'a vol� tout mon argent ! Le monde est vraiment trop injuste...");
        return argentPerdu;
    }

    public void recevoir(int argent) {
        gagnerArgent(argent);
        parler("Je vous remercie pour votre g�n�rosit� !");
    }
}