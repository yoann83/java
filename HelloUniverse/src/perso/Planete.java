package perso;

public class Planete {
    // attributs static avant les attributs d'instance
    private static int nombreActuelPlanetes;
    String nom;
    long diametre;
    String matiere;
    TypeMinerais minerais = TypeMinerais.FER;

    // le constructeur sans paramètre en premier
    Planete() {
        System.out.println("Je suis le construsteur de la class Planete non main avant tout !");
    }

    // Constructeur avec paramètre nom
    public Planete(String nom, TypeMinerais minerais) {
        this.nom = nom;

        //old qui fonctionne
//        switch ( minerais) {
//            case FER :
//                System.out.println(nom +" à du "+ minerais + " à la surface !");
//                break;
//            case PLOMB:
//                System.out.println(nom +" à du "+ minerais + " à la surface !");
//                break;
//            case PLATINE:
//                System.out.println(nom +" à de la "+ minerais + " à la surface !");
//                break;
//            case OR:
//                System.out.println(nom +" à de l'"+ minerais + " à la surface !");
//                break;
//            default:
//                System.out.println(nom + "n'a aucun minerais sur la surface");
//                break;
//        }

        System.out.println(nom +" à de l'"+ minerais.nomtypeMinerais + " à la surface !");
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