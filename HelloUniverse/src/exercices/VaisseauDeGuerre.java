package exercices;

public class VaisseauDeGuerre extends Vaisseau {
    boolean armesDesactivees = false;

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
}