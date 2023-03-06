import java.util.ArrayList;
import java.util.List;

public class Portefeuille {
    private List<Produit> produits;

    public Portefeuille() {
        produits = new ArrayList<>();
    }

    public void ajouterProduit(Produit produit) {
        produits.add(produit);
    }

    public void retirerProduit(Produit produit) {
        produits.remove(produit);
    }

    public double getPrixTotal() {
        double prixTotal = 0;
        for (Produit produit : produits) {
            prixTotal += produit.getPrix();
        }
        return prixTotal;
    }
    public List<Produit> getProduits() {
        return produits;
    }

    public int getNombreProduits() {
        return produits.size();
    }

    public Produit rechercherProduit(String nomProduit) {
        for (Produit produit : produits) {
            if (produit.getNom().equals(nomProduit)) {
                return produit;
            }
        }
        return null;
    }

    public void trierProduitsParNom() {
        for (int i = 0; i < produits.size() - 1; i++) {
            for (int j = i + 1; j < produits.size(); j++) {
                Produit produitI = produits.get(i);
                Produit produitJ = produits.get(j);
                if (produitI.getNom().compareTo(produitJ.getNom()) > 0) {
                    produits.set(i, produitJ);
                    produits.set(j, produitI);
                }
            }
        }
    }
}

