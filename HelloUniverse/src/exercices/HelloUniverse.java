package exercices;

public class HelloUniverse {
    public static void main(String... args) {
        Planete mercure = new Planete();
        mercure.nom = "Mercure";
        mercure.diametre = 4880;
        mercure.matiere = "Tellurique";

        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.diametre = 12100;
        venus.matiere = "Tellurique";

        Planete terre = new Planete();
        terre.nom = "Terre";
        terre.diametre = 12756;
        terre.matiere = "Tellurique";

        Planete mars = new Planete();
        mars.nom = "Mars";
        mars.diametre = 6792;
        mars.matiere = "Tellurique";

        Planete jupiter = new Planete();
        jupiter.nom = "Jupiter";
        jupiter.diametre = 142984;
        jupiter.matiere = "Gazeuse";

        Planete saturne = new Planete();
        saturne.nom = "Saturne";
        saturne.diametre = 120536;
        saturne.matiere = "Gazeuse";

        Planete uranus = new Planete();
        uranus.nom = "Uranus";
        uranus.diametre = 51118;
        uranus.matiere = "Gazeuse";

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.tauxHydrogene = 83.0f;
        atmosphereUranus.tauxHelium = 15.0f;
        atmosphereUranus.tauxMethane = 2.5f;
        atmosphereUranus.tauxAzote = 0.0f;
        atmosphereUranus.tauxArgon = 0.0f;
        atmosphereUranus.tauxDioxydeCarbone = 0.0f;
        atmosphereUranus.tauxSodium = 0.0f;

        uranus.atmosphere = atmosphereUranus;

        Planete neptune = new Planete();
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        System.out.println("L'atmosphère de " + uranus.nom + " est composée :");
        System.out.println("A " + uranus.atmosphere.tauxHydrogene + "% d'hydrogène");
        System.out.println("A " + uranus.atmosphere.tauxArgon + "% d'argon");
        System.out.println("A " + uranus.atmosphere.tauxDioxydeCarbone + "% de dioxyde de carbone");
        System.out.println("A " + uranus.atmosphere.tauxAzote + "% d'azote");
        System.out.println("A " + uranus.atmosphere.tauxHelium + "% d'hélium");
        System.out.println("A " + uranus.atmosphere.tauxMethane + "% de méthane");
        System.out.println("A " + uranus.atmosphere.tauxSodium + "% de sodium");

        Vaisseau fregate = new Vaisseau();
        fregate.type = "FREGATE";
        fregate.nbPassagers = 9;

        Vaisseau croiseur = new Vaisseau();
        croiseur.type = "CROISEUR";
        croiseur.nbPassagers = 42;

        Vaisseau vaisseauPartant1 = mars.accueillirVaisseau(fregate);
        if (vaisseauPartant1 == null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        } else {
            System.out.println("Un vaisseau de type " + vaisseauPartant1.type + " doit s'en aller.");
        }

        Vaisseau vaisseauPartant2 = mars.accueillirVaisseau(croiseur);
        if (vaisseauPartant2 == null) {
            System.out.println("Aucun vaisseau ne s'en va.");
        } else {
            System.out.println("Un vaisseau de type " + vaisseauPartant2.type + " doit s'en aller.");
        }

        System.out.println("Le nombre d'humains ayant déjà séjourné sur " + mars.nom + " est actuellement de " + mars.totalVisiteurs + ".");

        System.out.println("La forme d'une planète est : " + Planete.forme);
        System.out.println("La forme de " + mars.nom + " est : " + mars.forme);

        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));

        System.out.println("Le nombre de planètes découvertes est de " + Planete.nbPlanetesDecouvertes + ".");
    }
}