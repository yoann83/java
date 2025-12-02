package exercices;
import java.util.Scanner;

public class HelloUniverse {

    public static void main(String... args) {

        Galaxie systemeSolaire = new Galaxie("Système Solaire");

        PlaneteTellurique mercure = new PlaneteTellurique("Mercure", 1);
        mercure.diametre = 4880;
        systemeSolaire.planetes.add(mercure);

        PlaneteTellurique venus = new PlaneteTellurique("Venus", 2);
        venus.diametre = 12100;
        systemeSolaire.planetes.add(venus);

        PlaneteTellurique terre = new PlaneteTellurique("Terre", 100);
        terre.diametre = 12756;
        systemeSolaire.planetes.add(terre);

        PlaneteTellurique mars = new PlaneteTellurique("Mars", 5);
        mars.diametre = 6792;
        systemeSolaire.planetes.add(mars);

        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        jupiter.diametre = 142984;
        systemeSolaire.planetes.add(jupiter);

        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        saturne.diametre = 120536;
        systemeSolaire.planetes.add(saturne);

        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        uranus.diametre = 51118;
        systemeSolaire.planetes.add(uranus);

        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");
        neptune.diametre = 49532;
        systemeSolaire.planetes.add(neptune);


        Vaisseau chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        Vaisseau croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
        Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        Vaisseau cargo = new VaisseauCivil(TypeVaisseau.CARGO);
        Vaisseau vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);

        Scanner sc = new Scanner(System.in);

        boolean recommencer = true;

        while (recommencer) {

            System.out.println("Quel vaisseau souhaitez-vous manipuler : CHASSEUR, FREGATE, CROISEUR, CARGO ou VAISSEAUMONDE ?");
            String typeVaisseauString = sc.nextLine();
            TypeVaisseau typeVaisseau = TypeVaisseau.valueOf(typeVaisseauString);

            Vaisseau vaisseauSelectionne = null;

            switch (typeVaisseau) {
                case CHASSEUR:
                    vaisseauSelectionne = chasseur;
                    break;
                case FREGATE:
                    vaisseauSelectionne = fregate;
                    break;
                case CROISEUR:
                    vaisseauSelectionne = croiseur;
                    break;
                case CARGO:
                    vaisseauSelectionne = cargo;
                    break;
                case VAISSEAUMONDE:
                    vaisseauSelectionne = vaisseauMonde;
                    break;
            }


            System.out.println("Sur quelle planète voulez-vous vous poser ?");
            String choixPlanete = sc.nextLine();

            Planete planeteSelectionneeDansGalaxie = null;

            for (Planete p : systemeSolaire.planetes) {
                if (p.nom.equalsIgnoreCase(choixPlanete)) {
                    planeteSelectionneeDansGalaxie = p;
                    break;
                }
            }

            if (planeteSelectionneeDansGalaxie == null) {
                System.out.println("Cette planète n'existe pas.");
                continue;
            }

            if (!(planeteSelectionneeDansGalaxie instanceof PlaneteTellurique)) {
                System.out.println("Il ne s'agit pas d'une planète tellurique.");
                continue;
            }

            PlaneteTellurique planeteSelectionnee = (PlaneteTellurique) planeteSelectionneeDansGalaxie;

            System.out.println("Quel tonnage souhaitez-vous emporter ?");
            int tonnage = sc.nextInt();
            sc.nextLine(); // évite les bugs de nextLine

            if (!planeteSelectionnee.restePlaceDisponible(vaisseauSelectionne)) {
                System.out.println("Le vaisseau ne peut pas se poser par manque de place dans la baie.");
                continue;
            }

            planeteSelectionnee.accueillirVaisseaux(vaisseauSelectionne);

            System.out.println("Le vaisseau a rejeté : " + vaisseauSelectionne.emporterCargaison(tonnage) + " tonnes.");

            System.out.println("Voulez-vous recommencer ? (oui/non)");
            recommencer = sc.nextLine().equalsIgnoreCase("oui");
        }
    }
}
