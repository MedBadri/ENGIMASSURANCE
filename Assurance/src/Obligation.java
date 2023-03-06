public class Obligation extends Produit {
    private double tauxInteret;
    private double montant;

    public Obligation(String nom, double prix, String description, double tauxInteret, double montant) {
        super(nom, prix, description);
        this.tauxInteret = tauxInteret;
        this.montant = montant;
    }

    public double getPrix() {
        return montant * (1 + tauxInteret);
    }

    public double getTauxInteret() {
        return tauxInteret;
    }

    public void setTauxInteret(double tauxInteret) {
        this.tauxInteret = tauxInteret;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
