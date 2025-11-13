package exercices;

public class VaisseauDeGuerre extends Vaisseau {

    boolean armesDesactivees;

    public VaisseauDeGuerre(TypeVaisseau type) {
        this.type = type;

        switch(type) {
            case CHASSEUR:
                tonnageMax = 0;
                break;
            case FREGATE:
                tonnageMax = 50;
                break;
            case CROISEUR:
                tonnageMax = 100;
                break;
            default:
                tonnageMax = 0; // sécurité
        }
    }

    void attaque(Vaisseau vaisseauCible, String arme, int duree) {

        if (armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est désactivé");
            return;
        }

        System.out.println(
                "Un vaisseau de type " + type +
                        " attaque un vaisseau de type " + vaisseauCible.type +
                        " en utilisant l'arme " + arme +
                        " pendant " + duree + " minutes."
        );

        vaisseauCible.resistanceDuBouclier = 0;
        vaisseauCible.blindage = vaisseauCible.blindage / 2;
    }

    void desactiverArmes() {
        System.out.println("Désactivation des armes d'un vaisseau de type " + type);
        armesDesactivees = true;
    }

    @Override
    void activerBouclier() {
        System.out.println("Activation du bouclier d'un vaisseau de type " + type + ".");
        desactiverArmes();
    }

    @Override
    int emporterCargaison(int cargaison) {

        if (type == TypeVaisseau.CHASSEUR) {
            return cargaison; // un chasseur ne transporte rien
        }

        if (nbPassagers < 12) {
            return cargaison;
        }

        int tonnagePassagers = nbPassagers * 2;
        int tonnageRestant = tonnageMax - tonnageActuel;

        int tonnageAConsiderer = Math.min(tonnagePassagers, tonnageRestant);

        if (cargaison > tonnageAConsiderer) {
            tonnageActuel = tonnageMax;
            return cargaison - tonnageAConsiderer;
        }

        tonnageActuel += cargaison;
        return 0;
    }
}
