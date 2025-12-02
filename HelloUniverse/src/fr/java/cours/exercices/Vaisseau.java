package fr.java.cours.exercices;

public abstract class Vaisseau {
    TypeVaisseau type;
    int nbPassagers;
    int resistanceDuBouclier;
    int blindage;
    int tonnageMax;
    protected int tonnageActuel;

    void activerBouclier(){
        System.out.println("Activation du bouclier d'un vaisseau de type "+type.nom+".");
    }

    void desactiverBouclier(){
        System.out.println("Désactivation du bouclier d'un vaisseau de type "+type.nom+".");
    }

    abstract int emporterCargaison(int tonnage);

}
