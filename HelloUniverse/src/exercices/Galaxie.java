package exercices;
import java.util.HashSet;
import java.util.Set;

public class Galaxie {

    String nom;
    Set<Planete> planetes = new HashSet<>();

    public Galaxie() {
    }

    public Galaxie(String nom) {
        this.nom = nom;
    }
}