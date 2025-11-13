package exercices;

public class VaisseauCivil extends Vaisseau {

    public VaisseauCivil(TypeVaisseau type) {
        this.type = type;

        switch(type) {
            case CARGO:
                tonnageMax = 500;
                break;
            case VAISSEAUMONDE:
                tonnageMax = 2000;
                break;
            default:
                tonnageMax = 0; // sécurité
        }
    }

    @Override
    int emporterCargaison(int tonnage) {

        int tonnageRestant = tonnageMax - tonnageActuel;

        if (tonnage > tonnageRestant) {
            tonnageActuel = tonnageMax;
            return tonnage - tonnageRestant;
        }

        tonnageActuel += tonnage;
        return 0;
    }
}
