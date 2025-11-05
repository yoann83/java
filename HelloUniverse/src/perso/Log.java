package perso;

public abstract class Log {
    public Log(Boolean start) {
        if (start) {
            String timestamp = new java.util.Date().toString();
            System.out.println("Début du traitement / " + timestamp);
            System.out.println("-------------------------------------");
            System.out.println();
        } else {
            Long startProcess = System.nanoTime();
            Long endProcess = System.nanoTime();
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("Programme terminé avec succès / " + (endProcess - startProcess) + "ns");
        }
    }
}
