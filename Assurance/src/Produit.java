public abstract class Produit implements Comparable<Produit> {
    protected String nom;
    protected double prix;
    protected String description;

    public Produit(String nom, double prix, String description) {
        this.nom = nom;
        this.prix = prix;
        this.description = description;
    }

    public abstract double getPrix();

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;

    }
    public void afficherDetails() {
        System.out.println("Nom: " + nom);
        System.out.println("Prix: " + prix);
        System.out.println("Description: " + description);
    }
    @Override
    public String toString() {
        return "Produit [nom=" + nom + ", prix=" + prix + ", description=" + description + "]";
    }
    @Override
    public int compareTo(Produit p) {
        return this.nom.compareTo(p.nom);
    }



}
