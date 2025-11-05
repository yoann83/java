package exercices;

public class VaisseauDeGuerre extends Vaisseau {
    boolean armesDesactivees = false;

    public VaisseauDeGuerre(String type, int nbPassagers) {
        this.type = type;
        this.nbPassagers = nbPassagers;

        if (type.equals("CHASSEUR")) {
            tonnageMax = 0;
        } else if (type.equals("FREGATE")) {
            tonnageMax = 50;
        } else if (type.equals("CROISEUR")) {
            tonnageMax = 100;
        }
    }

    @Override
    void activerBouclier() {
        super.activerBouclier();
        desactiverArmes();
    }

    void desactiverArmes() {
        armesDesactivees = true;
        System.out.println("Désactivation des armes d'un vaisseau de type " + type);
    }

    void attaque(Vaisseau cible, String arme, int duree) {
        if (armesDesactivees) {
            System.out.println("Attaque impossible, l'armement est désactivé");
        } else {
            System.out.println("Un vaisseau de type " + this.type + " attaque un vaisseau de type " + cible.type + " en utilisant l'arme " + arme + " pendant " + duree + " minutes.");
            cible.resistanceDuBouclier = 0;
            cible.blindage = cible.blindage / 2;
        }
    }

    @Override
    int emporterCargaison(int tonnage) {
        if (type.equals("CHASSEUR")) {
            return tonnage;
        }

        if (nbPassagers < 12) {
            return tonnage;
        }

        int capaciteDisponible = tonnageMax - tonnageActuel;
        int capaciteParPassagers = nbPassagers * 2;
        int capaciteReelle = Math.min(capaciteDisponible, capaciteParPassagers);

        if (tonnage <= capaciteReelle) {
            tonnageActuel += tonnage;
            return 0;
        } else {
            tonnageActuel += capaciteReelle;
            return tonnage - capaciteReelle;
        }
    }
}