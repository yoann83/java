package exercices;

public enum TypeVaisseau {

    CHASSEUR("Chasseur"),
    FREGATE("Frégate"),
    CROISEUR("Croiseur"),
    CARGO("Cargo"),
    VAISSEAUMONDE("Vaisseau-Monde");

    public final String nom;

    TypeVaisseau(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return nom;
    }
}
