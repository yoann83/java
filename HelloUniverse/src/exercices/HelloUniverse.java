package exercices;
public class HelloUniverse {
    public static void main(String... args) {

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure");
        mercure.diametre = 4880;

        PlaneteTellurique venus = new PlaneteTellurique("Venus");
        venus.diametre = 12100;

        PlaneteTellurique terre = new PlaneteTellurique("Terre");
        terre.diametre = 12756;

        PlaneteTellurique mars = new PlaneteTellurique("Mars");
        mars.diametre = 6792;

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;

        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR", 3);
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE", 200);
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;

        vaisseauMonde.activerBouclier();
        chasseur.activerBouclier();

        ((VaisseauDeGuerre) chasseur).attaque(vaisseauMonde, "lasers photoniques", 3);

        vaisseauMonde.desactiverBouclier();

        System.out.println(vaisseauMonde.resistanceDuBouclier);
        System.out.println(vaisseauMonde.blindage);

        mars.accueillirVaisseau(vaisseauMonde);
        mars.accueillirVaisseau(chasseur);

        // Étape 1
        Vaisseau chasseur2 = new VaisseauDeGuerre("CHASSEUR", 3);
        terre.accueillirVaisseau(chasseur2);
        int refuse1 = chasseur2.emporterCargaison(20);
        System.out.println(refuse1);

        // Étape 2
        Vaisseau fregate1 = new VaisseauDeGuerre("FREGATE", 100);
        terre.accueillirVaisseau(fregate1);
        int refuse2 = fregate1.emporterCargaison(45);
        System.out.println(refuse2);
        int refuse3 = fregate1.emporterCargaison(12);
        System.out.println(refuse3);

        // Étape 3
        Vaisseau fregate2 = new VaisseauDeGuerre("FREGATE", 14);
        terre.accueillirVaisseau(fregate2);
        int refuse4 = fregate2.emporterCargaison(30);
        System.out.println(refuse4);

        // Étape 4
        Vaisseau vaisseauMonde2 = new VaisseauCivil("VAISSEAU-MONDE", 200);
        terre.accueillirVaisseau(vaisseauMonde2);
        int refuse5 = vaisseauMonde2.emporterCargaison(1560);
        System.out.println(refuse5);
        int refuse6 = vaisseauMonde2.emporterCargaison(600);
        System.out.println(refuse6);
    }
}