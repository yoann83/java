package fr.java.cours.exercices;

import java.util.Scanner;

public class HelloUniverse {
    /**
     *
     * @param args
     */
    public static void main(String... args) {

        Galaxie systemeSolaire=new Galaxie();
        PlaneteTellurique mercure = new PlaneteTellurique("Mercure", 1);
        PlaneteTellurique venus = new PlaneteTellurique("Venus", 2);
        PlaneteTellurique terre = new PlaneteTellurique("Terre", 100);
        PlaneteTellurique mars = new PlaneteTellurique("Mars", 5);
        PlaneteGazeuse jupiter = new PlaneteGazeuse("Jupiter");
        PlaneteGazeuse saturne = new PlaneteGazeuse("Saturne");
        PlaneteGazeuse uranus = new PlaneteGazeuse("Uranus");
        PlaneteGazeuse neptune = new PlaneteGazeuse("Neptune");

        mars.atmosphere = new Atmosphere();
        mars.atmosphere.constituants.put("CO2", 95f);
        mars.atmosphere.constituants.put("N2", 3f);
        mars.atmosphere.constituants.put("AR", 1.5f);
        mars.atmosphere.constituants.put("NO", 0.013f);

        System.out.println("L'atmosphère de Mars est constituée de :");
        for (String gaz : mars.atmosphere.constituants.keySet()) {
            Float taux = mars.atmosphere.constituants.get(gaz);
            System.out.println(taux + "% de " + gaz);
        }

        mercure.diametre = 4880;
        venus.diametre = 12100;
        terre.diametre = 12756;
        mars.diametre = 6792;
        jupiter.diametre = 142984;
        saturne.diametre = 120536;
        uranus.diametre = 51118;
        neptune.diametre = 49532;

        systemeSolaire.planetes.add(mercure);
        systemeSolaire.planetes.add(venus);
        systemeSolaire.planetes.add(terre);
        systemeSolaire.planetes.add(mars);
        systemeSolaire.planetes.add(jupiter);
        systemeSolaire.planetes.add(saturne);
        systemeSolaire.planetes.add(uranus);
        systemeSolaire.planetes.add(neptune);

        Vaisseau chasseur = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur.nbPassagers = 3;
        chasseur.blindage = 156;
        chasseur.resistanceDuBouclier = 2;

        Vaisseau croiseur = new VaisseauDeGuerre(TypeVaisseau.CROISEUR);
        croiseur.nbPassagers = 35;
        croiseur.blindage = 851;
        croiseur.resistanceDuBouclier = 25;

        Vaisseau fregate = new VaisseauDeGuerre(TypeVaisseau.FREGATE);
        fregate.nbPassagers = 100;
        fregate.blindage = 542;
        fregate.resistanceDuBouclier = 50;

        Vaisseau cargo = new VaisseauCivil(TypeVaisseau.CARGO);
        cargo.nbPassagers = 10000;
        cargo.blindage = 1520;
        cargo.resistanceDuBouclier = 20;

        Vaisseau vaisseauMonde = new VaisseauCivil(TypeVaisseau.VAISSEAUMONDE);
        vaisseauMonde.nbPassagers = 10000;
        vaisseauMonde.blindage = 4784;
        vaisseauMonde.resistanceDuBouclier = 30;

        Vaisseau chasseur2 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur2.nbPassagers = 4;
        chasseur2.blindage = 156;
        chasseur2.resistanceDuBouclier = 2;
        Vaisseau chasseur3 = new VaisseauDeGuerre(TypeVaisseau.CHASSEUR);
        chasseur3.nbPassagers = 5;
        chasseur3.blindage = 156;
        chasseur3.resistanceDuBouclier = 2;
        Vaisseau cargo2 = new VaisseauCivil(TypeVaisseau.CARGO);
        cargo2.nbPassagers = 10001;
        cargo2.blindage = 1520;
        cargo2.resistanceDuBouclier = 20;
        terre.accueillirVaisseaux(chasseur2,chasseur3,cargo2);

        Scanner sc = new Scanner(System.in);
        boolean recommencer = true;
        while (recommencer) {
            System.out.println("Quel vaisseau souhaitez vous manipuler​ : " + TypeVaisseau.CHASSEUR.name() + ", " + TypeVaisseau.FREGATE.name() + ", " + TypeVaisseau.CROISEUR.name() + ", " + TypeVaisseau.CARGO.name() + " ou " + TypeVaisseau.VAISSEAUMONDE.name() + " ?");
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

            System.out.println("Sur quelle planète tellurique du systeme solaire voulez-vous vous poser : Mercure, Venus, Terre ou Mars ?");
            String nomPlanete = sc.nextLine();

            Planete planeteSelectionneeDansGalaxie = null;

            // Recherche de la planète dans la galaxie
            for (Planete planeteSuivante : systemeSolaire.planetes){
                if (planeteSuivante.nom.equalsIgnoreCase(nomPlanete)){
                    planeteSelectionneeDansGalaxie = planeteSuivante;
                    break;
                }
            }

            // Vérification que la planète existe
            if (planeteSelectionneeDansGalaxie == null) {
                System.out.println("Cette planète n'existe pas dans la galaxie !");
                continue;
            }

            // Vérification qu’il s’agit bien d’une planète tellurique
            if (planeteSelectionneeDansGalaxie instanceof PlaneteGazeuse) {
                System.out.println("Il ne s'agit pas d'une planète Tellurique !");
                continue;
            }

            // Cast sécurisé
            PlaneteTellurique planeteSelectionnee = (PlaneteTellurique) planeteSelectionneeDansGalaxie;
            System.out.println("Le vaisseau souhaite se poser sur la planète " + planeteSelectionnee.nom);

            System.out.println("Quel tonnage souhaitez-vous emporter ?");
            int tonnageSouhaite = sc.nextInt();

            if (planeteSelectionnee.restePlaceDisponible(vaisseauSelectionne)) {
                planeteSelectionnee.accueillirVaisseaux(vaisseauSelectionne);
                System.out.println("Le vaisseau a rejeté : " +
                        vaisseauSelectionne.emporterCargaison(tonnageSouhaite) + " tonnes.");
            } else {
                System.out.println("Le vaisseau ne peut pas se poser sur la planète par manque de place dans la baie.");
            }

            sc.nextLine();
            System.out.println("Voulez-vous recommencer oui/non ?");
            recommencer = sc.nextLine().equalsIgnoreCase("oui");
        }
    }

}

