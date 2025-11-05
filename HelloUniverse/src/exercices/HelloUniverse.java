package exercices;
import java.util.Scanner;

public class HelloUniverse {
    public static void main(String... args) {
        // Création des planètes du système solaire
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

        // Création des vaisseaux
        Vaisseau chasseur = new VaisseauDeGuerre("CHASSEUR");
        chasseur.nbPassagers = 3;

        Vaisseau fregate = new VaisseauDeGuerre("FREGATE");
        fregate.nbPassagers = 50;

        Vaisseau croiseur = new VaisseauDeGuerre("CROISEUR");
        croiseur.nbPassagers = 80;

        Vaisseau cargo = new VaisseauCivil("CARGO");
        cargo.nbPassagers = 20;

        Vaisseau vaisseauMonde = new VaisseauCivil("VAISSEAU-MONDE");
        vaisseauMonde.nbPassagers = 200;

        // Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // 1) Demander quel vaisseau manipuler
        System.out.println("Quel vaisseau souhaitez-vous manipuler ?");
        System.out.println("(CHASSEUR, FREGATE, CROISEUR, CARGO, VAISSEAU-MONDE)");
        String typeVaisseau = scanner.nextLine();

        // Sélectionner le vaisseau
        Vaisseau vaisseauChoisi = null;
        switch (typeVaisseau.toUpperCase()) {
            case "CHASSEUR":
                vaisseauChoisi = chasseur;
                break;
            case "FREGATE":
                vaisseauChoisi = fregate;
                break;
            case "CROISEUR":
                vaisseauChoisi = croiseur;
                break;
            case "CARGO":
                vaisseauChoisi = cargo;
                break;
            case "VAISSEAU-MONDE":
                vaisseauChoisi = vaisseauMonde;
                break;
            default:
                System.out.println("Vaisseau non reconnu !");
                scanner.close();
                return;
        }

        // 2) Demander sur quelle planète se poser
        System.out.println("Sur quelle planète tellurique souhaitez-vous vous poser ?");
        System.out.println("(Mercure, Venus, Terre, Mars)");
        String nomPlanete = scanner.nextLine();

        // Sélectionner la planète
        PlaneteTellurique planeteChoisie = null;
        switch (nomPlanete) {
            case "Mercure":
                planeteChoisie = mercure;
                break;
            case "Venus":
                planeteChoisie = venus;
                break;
            case "Terre":
                planeteChoisie = terre;
                break;
            case "Mars":
                planeteChoisie = mars;
                break;
            default:
                System.out.println("Planète non reconnue !");
                scanner.close();
                return;
        }

        // Faire atterrir le vaisseau
        planeteChoisie.accueillirVaisseau(vaisseauChoisi);

        // 3) Demander le tonnage de cargaison
        System.out.println("Quel tonnage de cargaison souhaitez-vous embarquer ?");
        int tonnage = scanner.nextInt();

        // Embarquer la cargaison et afficher le tonnage rejeté
        int tonnageRejete = vaisseauChoisi.emporterCargaison(tonnage);
        System.out.println("Tonnage rejeté : " + tonnageRejete);

        scanner.close();
    }
}