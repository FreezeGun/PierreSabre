package personnages;

public class Yakuza extends Humain {
    private String clan;
    private int reputation;

    public Yakuza(String nom, String boisson, int argent, String clan) {
        super(nom, boisson, argent);
        this.clan = clan;
        this.reputation = 0;
    }

    public void extorquer(Commercant victime) {
        int argentVol� = victime.perdreArgent(victime.getArgent());
        this.gagnerArgent(argentVol�);
        this.reputation++;
        this.parler("J'ai extorqu� " + argentVol� + " sous � un commer�ant. Mon clan, " + this.clan + ", sera fier de moi !");
    }

    public String getClan() {
        return clan;
    }

    public int getReputation() {
        return reputation;
    }
}