package exercices;

public class VaisseauCivil extends Vaisseau {

    public VaisseauCivil(String type, int nbPassagers) {
        this.type = type;
        this.nbPassagers = nbPassagers;

        if (type.equals("CARGO")) {
            tonnageMax = 500;
        } else if (type.equals("VAISSEAU-MONDE")) {
            tonnageMax = 2000;
        }
    }

    @Override
    int emporterCargaison(int tonnage) {
        int capaciteDisponible = tonnageMax - tonnageActuel;

        if (tonnage <= capaciteDisponible) {
            tonnageActuel += tonnage;
            return 0;
        } else {
            tonnageActuel += capaciteDisponible;
            return tonnage - capaciteDisponible;
        }
    }
}