package exercices;

public class VaisseauDeGuerre extends Vaisseau {

    void attaque(Vaisseau cible, String arme, int duree) {
        System.out.println("Un vaisseau de type " + this.type + " attaque un vaisseau de type " + cible.type + " en utilisant l'arme " + arme + " pendant " + duree + " minutes.");
        cible.resistanceDuBouclier = 0;
        cible.blindage = cible.blindage / 2;
    }
}