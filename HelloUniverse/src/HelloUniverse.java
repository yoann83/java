public class HelloUniverse {
    public static void main(String... args) {
        int ageDuCapitaine = 30;
        long dateNaissance = 200519801201L;
        float price1 = 10.99F;
        double price2 = 10.99;
        char premiereLettreDuNom = 'J';
        String nomDuCapitaine = "John";
        boolean isCOld = false;
        float y=5.0f/2.0f;
        int x=5%2;

        // Comparaison
        String chaine1 = "jeSuisLeTesT";
        String chaine2 = "jeSuisLeTest";
        String chaine3 = "JESuisLeTesT";
        // simple
        Boolean testCompareSimple = chaine1 == chaine2;
        Boolean testCompareEquals = chaine1.equals(chaine2);
        // equals et equalIgnoreCase
        Boolean testCompareEqualIgnoreCase = chaine1.equalsIgnoreCase(chaine3);

        // true, car il a dèjà aloué un espace (string) avec la meme valeur
        // donc java optimise en récupérent la meme valeur stcoké
        System.out.println("Compare Simple : " + testCompareSimple);

        // true, car il test vraiment et strictement les valeurs comme l'équivalence avec ===
        System.out.println("Compare Equals : " + testCompareEquals);

        // true, car qualsIgnoreCase format en smallCase et test
        System.out.println("Compare EqualIgnoreCase : " + testCompareEqualIgnoreCase);

        /*----------------------------------------*/

        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4879;
        mercure.matiere = "Tellurique";

        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.matiere = "Tellurique";
        venus.diametre = 12104;

        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.matiere = "Tellurique";
        terre.diametre = 12756;

        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.matiere = "Tellurique";
        mars.diametre = 6792;

        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.matiere = "Gazeuse";
        jupiter.diametre = 142984;

        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.matiere = "Gazeuse";
        saturne.diametre = 120536;

        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.matiere = "Gazeuse";
        uranus.diametre = 51118;

        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.matiere = "Gazeuse";
        neptune.diametre = 49528;

        int initPlanets = Planete.iniNbPlanets(9);
        String correctionNbPlanetes = Planete.updateNbPlanetes(9, -1);
        int nbPlanets = Planete.getNbPlanets();

        System.out.println("Hello Universe!");
        System.out.println("initalisation des planêtes : " + initPlanets);
        System.out.println(correctionNbPlanetes);
        System.out.println(nbPlanets);
        System.out.println(y);
        System.out.println(x);


        Planete planeteX = new Planete();

        System.out.println(planeteX.nom + " est une planète " + planeteX.matiere + " avec un diamètre de " + planeteX.diametre + " kilomètres.");

        neptune.revolution();
        mars.rotation();
    }
}