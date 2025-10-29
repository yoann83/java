package perso;

public class Planete {
    // attributs static avant les attributs d'instance
    private static int nombreActuelPlanetes;
    String nom;
    long diametre;
    String matiere;

    // le constructeur sans paramètre en premier
    Planete() {
        System.out.println("Je suis le construsteur de la class Planete non main avant tout !");
    }

    // Constructeur avec paramètre nom
    public Planete(String nom) {
        this.nom = nom;
    }

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