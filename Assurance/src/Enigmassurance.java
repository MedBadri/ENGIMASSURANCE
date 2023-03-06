public class Enigmassurance {
    public static void main(String[] args) {

        Action action1 = new Action("Apple Inc.", 120.50, "Technology company", 1000, 0.75);
        Obligation obligation1 = new Obligation("France treasury bond", 10000, "Government bonds", 0.02, 5000);


        Portefeuille portefeuille = new Portefeuille();
        portefeuille.ajouterProduit(action1);
        portefeuille.ajouterProduit(obligation1);


        double total = portefeuille.getPrixTotal();
        System.out.println("Prix total: " + total);


        for (Produit produit : portefeuille.getProduits()) {
            produit.afficherDetails();
            System.out.println();
        }


        portefeuille.retirerProduit(action1);


        Produit searchResult = portefeuille.rechercherProduit("US Treasury Bonds");
        if (searchResult != null) {
            System.out.println("Produit Trouvé: " + searchResult.getNom());
        } else {
            System.out.println("Produit non trouvé.");
        }


        portefeuille.trierProduitsParNom();


        System.out.println("Contenu du portfolio (Triés par nom):");
        for (Produit produit : portefeuille.getProduits()) {
            produit.afficherDetails();
            System.out.println();
        }
    }

}



