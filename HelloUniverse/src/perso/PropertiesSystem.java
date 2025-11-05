package perso;

public class PropertiesSystem {
    public static void main(String[] args) {
        /********************* ecriture des logs et errors *********************
         1. Se placer à la racine de src
         cd /chemin/vers/test/src
            ...NomClass.java

         2. Compilation simple
         javac test/...NomClass.java
         OU
         3. Compilation avec run (inelliJ)
         javac test/NomClass.java && java test.NomClass > logs.txt 2> errors.txt

         4. Exécuter avec redirection des logs
         java test.NomClass > logs.txt 2> errors.txt

         5. Vérifier le contenu en cmd
             cat logs.txt
             cat errors.txt
         ----
            `logs.txt` contiendra l'historique des process
            `errors.txt` contiendra les erreurs

         ici dans l'exemple à chaque changement il faut recompiler :
         .../Projects/java/HelloUniverse/src$
            -> javac perso/PropertiesSystem.java
         .../Projects/java/HelloUniverse/src$ (> ecrase; >> ajoute à la fin )
            -> java perso.PropertiesSystem >> logs.txt 2>> errors.txt
         Affiche 0 si OK, 1 si erreur
            -> echo $?

         ********************* ecriture des logs et errors *********************/

        try {
            String timestamp = new java.util.Date().toString();
            System.out.println("=== " + timestamp + " ===");
            System.out.println("Début du traitement");

            // ========== SIMULATION D'ERREUR ==========
            // Option 1 : Division par zéro
//            int resultat = 10 / 0;  // Lance ArithmeticException

            // Option 2 : NullPointerException
//             String test = null;
//             test.length();  // Lance NullPointerException

            // Option 3 : Lancer manuellement une exception
            // throw new Exception("Erreur simulée pour les tests");

            // Option 4 : ArrayIndexOutOfBoundsException
            // int[] tableau = {1, 2, 3};
            // int valeur = tableau[10];  // Lance ArrayIndexOutOfBoundsException
            // ==========================================

            Long startProcess = System.nanoTime();
            Long endProcess = System.nanoTime();
            System.out.println("Durée: " + (endProcess - startProcess) + "ns");
            System.out.println(System.getProperties());
            System.out.println("Programme terminé avec succès");
            System.exit(0);

        } catch (Exception e) {
            String timestamp = new java.util.Date().toString();
            System.err.println("=== " + timestamp + " ===");
            System.err.println(e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }
}
