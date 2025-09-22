public class testPlanets {

    public static void main(String[] args) {
        new testPlanets((short) 2006);
    }

    private testPlanets(short yearTesting){
        int nbPlanetes=8;
        short year = 2003;
        String phrase="En " + year + ", les planètes du système solaire étaient au nombre de : " + nbPlanetes;


        if (year < yearTesting) {
            phrase="En " + year + ", les planètes du système solaire étaient au nombre de : " + ++nbPlanetes;
            System.out.println(phrase);
        } else {
            System.out.println(phrase);
        }
    }
}
