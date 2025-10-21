public class testPlanets {

    public static void main(String[] args) {
        new testPlanets(); // constructor first methode
    }

    private testPlanets(){
        afficherPlanetesParAnnee((short) 2003);
        afficherHistoriquePlanetes();
    }

    // Calcule le nombre de planètes selon l'années
    private int calculerNbPlanetes(short year) {
        return (year < 2006) ? 9 : 8;
    }

    // Construit le message
    private String construireMessage(short year, int nbPlanetes) {
        return "En " + year + ", les planètes du système solaire étaient au nombre de : " + nbPlanetes;
    }

    // Affiche les planètes pour une année donnée
    private void afficherPlanetesParAnnee(short year){
        int nbPlanetes = calculerNbPlanetes(year);
        String phrase = construireMessage(year, nbPlanetes);
        System.out.println(phrase);
    }

    // Affiche l'historique complet
    private void afficherHistoriquePlanetes(){
        for (int nbPlanetes = 7; nbPlanetes <= 9; nbPlanetes++) {
            afficherMessageParNombre(nbPlanetes);
        }
    }

    // Obtient le message selon le nombre de planètes
    private void afficherMessageParNombre(int nbPlanetes) {
        String message = obtenirMessageAvecSwitch(nbPlanetes);
        System.out.println(message);

        // obtenirMessageAvecWhile(nbPlanetes);
    }

    // Option avec Switch
    private String obtenirMessageAvecSwitch(int nbPlanetes) {
        switch (nbPlanetes) {
            case 7:
                return "On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes";
            case 8:
                return "On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006";
            case 9:
                return "On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8";
            default:
                return "Le programme ne peut pas fournir de résultat pour " + nbPlanetes;
        }
    }

    // Option avec While
    private void obtenirMessageAvecWhile(int nbPlanetes) {
        while (nbPlanetes < 10) {
            switch(nbPlanetes) {
                case 7:
                    System.out.println("On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes");
                    break;
                case 8:
                    System.out.println("On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006");
                    break;
                case 9:
                    System.out.println("On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8");
                    break;
                default:
                    System.out.printf("Le programme ne peut pas fournir de résultat pour %d", nbPlanetes);
                    break;
            }
            nbPlanetes++;
        }
    }
}