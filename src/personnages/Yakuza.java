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
        int argentVolé = victime.perdreArgent(victime.getArgent());
        this.gagnerArgent(argentVolé);
        this.reputation++;
        this.parler("J'ai extorqué " + argentVolé + " sous à un commerçant. Mon clan, " + this.clan + ", sera fier de moi !");
    }

    public String getClan() {
        return clan;
    }

    public int getReputation() {
        return reputation;
    }
}