public class Action extends Produit {
    private int nombreActions;
    private double valeurAction;

    public Action(String nom, double prix, String description, int nombreActions, double valeurAction) {
        super(nom, prix, description);
        this.nombreActions = nombreActions;
        this.valeurAction = valeurAction;
    }

    public double getPrix() {
        return nombreActions * valeurAction;
    }

    public int getNombreActions() {
        return nombreActions;
    }

    public void setNombreActions(int nombreActions) {
        this.nombreActions = nombreActions;
    }

    public double getValeurAction() {
        return valeurAction;
    }

    public void setValeurAction(double valeurAction) {
        this.valeurAction = valeurAction;
    }
}
