package perso;

public class Planete {
    String nom;
    long diametre;
    String matiere;

    private static int nombreActuelPlanetes;

    public static String updateNbPlanetes(int actual, int correction) {
        nombreActuelPlanetes = actual;
        String beforeNumbersPlanets = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : " + nombreActuelPlanetes;

        nombreActuelPlanetes += correction;
        String afterNumbersPlanets = "Il y a quelques années cependant, elles étaient au nombre de : " + nombreActuelPlanetes;

        return (beforeNumbersPlanets + "\n" + afterNumbersPlanets);
    }

    public static int getNbPlanets() {
        return nombreActuelPlanetes;
    }

    public static int iniNbPlanets(int nouveauNombre) {
        nombreActuelPlanetes = nouveauNombre;
        return nouveauNombre;
    }

    public void revolution() {
        System.out.println("Je suis la planète " + nom + " et je tourne autour de mon étoile.");
    }

    public void rotation() {
        System.out.println("Je suis la planète " + nom + " et je tourne sur moi-même.");
    }
}