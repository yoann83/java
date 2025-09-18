public class Planete {
    private static int nombreActuelPlanetes;

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
}