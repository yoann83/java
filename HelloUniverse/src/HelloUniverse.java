public class HelloUniverse {
    public static void main(String... args) {
        int ageDuCapitaine = 30;
        long dateNaissance = 200519801201L;
        float price1 = 10.99F;
        double price2 = 10.99;
        char premiereLettreDuNom = 'J';
        String nomDuCapitaine = "John";
        boolean isCOld = false;

        int initPlanets = Planete.iniNbPlanets(9);
        String correctionNbPlanetes = Planete.updateNbPlanetes(9, -1);
        int nbPlanets = Planete.getNbPlanets();

        System.out.println("Hello Universe!");
        System.out.println("initalisation des planêtes : " + initPlanets);
        System.out.println(correctionNbPlanetes);
        System.out.println(nbPlanets);
    }
}