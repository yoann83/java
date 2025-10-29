package exercices;

public class Planete {
    // attributs static avant les attributs d'instance
    static String forme = "Sphérique";
    static int nbPlanetesDecouvertes = 0;
    String nom;
    int diametre;
    String matiere;
    int totalVisiteurs;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuel;

    // le constructeur sans paramètre en premier
    public Planete() {
        nbPlanetesDecouvertes++;
    }

    // Constructeur avec paramètre nom
    public Planete(String nom) {
        this.nom = nom;
        nbPlanetesDecouvertes++;
    }

    // methode static accessible de n'importe ou et avant les méthodes d'instances
    static String expansion(double distance){
        if (distance < 14) {
            return "Oh la la mais c'est super rapide !";
        } else {
            return "Je rêve ou c'est plus rapide que la lumière ?";
        }
    }

    int revolution(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne autour de mon étoile de "+degres+" degrés.");
        return degres/360;
    }

    int rotation(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne sur moi-même de "+degres+" degrés.");
        return degres/360;
    }

    Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau){
        totalVisiteurs += nouveauVaisseau.nbPassagers;
        Vaisseau vaisseauEnPartance = vaisseauActuel;
        vaisseauActuel = nouveauVaisseau;
        return vaisseauEnPartance;
    }
}