package fr.java.cours.exercices;

public class VaisseauCivil extends Vaisseau {
    /**
     *
     * @param type
     */
    public VaisseauCivil(TypeVaisseau type) {
        this.type = type;
        if (type == TypeVaisseau.CARGO) {
            tonnageMax = 500;
        } else if (type == TypeVaisseau.VAISSEAUMONDE) {
            tonnageMax = 2000;
        }

    }

    /**
     *
     * @param tonnage
     * @return
     */
    int emporterCargaison(int tonnage) {

        int tonnageRestant = tonnageMax - tonnageActuel;
        if (tonnage > tonnageRestant) {
            tonnageActuel = tonnageMax;
            return tonnage-tonnageRestant;
        }
        tonnageActuel+=tonnage;
        return 0;
    }

}