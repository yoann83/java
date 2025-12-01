package perso;

import java.util.*;

public class Analyseur {

    public Analyseur() {
        // Appel d'une méthode utilisant l'énumération en ellipses
        traiterNiveaux(Niveau.BAS, Niveau.HAUT);
        listNiveau();
        setNiveau();
        iteratorNiveau();
    }

    // Méthode avec ellipses (varargs)
    public void traiterNiveaux(Niveau... niveaux) {
        System.out.println("Traitement des niveaux :");


        // boucle foreach
        // prends chaque élément du tableau niveaux nomme-le n, exécute le bloc { ... } une fois pour chaque élément
        for (Niveau n : niveaux) {
            System.out.println("- " + n);
        }

        /* équivalent au for */
        /*
            for (int i = 0; i < niveaux.length; i++) {
                Niveau n = niveaux[i];
                System.out.println("- " + n);
            }
        * */
    }

    /** UNIQUEMENT EN LECTURE **/
    public void listNiveau(){
        List<Niveau> listNiveaux = new ArrayList<>();
        listNiveaux.add(Niveau.BAS);
        listNiveaux.add(Niveau.MOYEN);


        listNiveaux.add(Niveau.MOYEN);
        listNiveaux.add(Niveau.HAUT);

        System.out.println("La list (tableau) de type Niveaux : "+listNiveaux);
    }

    public void setNiveau(){
        Set<Niveau> setNiveaux = new HashSet<>();
        setNiveaux.add(Niveau.BAS);
        setNiveaux.add(Niveau.MOYEN);
        setNiveaux.add(Niveau.MOYEN); // dans un HashSet, c’est toujours le deuxième ajout qui est ignoré
        setNiveaux.add(Niveau.HAUT);

        // racourci iter
        for (Niveau niveau : setNiveaux) {
            System.out.println(
                    "\n -------------------\n" + "État : " + niveau.getDescription() + "\nDangerosité : " + niveau.getDanger()
            );
        }

        System.out.println("Le set (tableau) sans doublon de type Niveaux : "+setNiveaux);
    }

    /** PERMET DE PARCOURIR UNE COLLECTION ET SUPPRIMER UN ELEMENT **/
    public void iteratorNiveau() {
        Set<Niveau> setIteNiveaux = new HashSet<>();
        setIteNiveaux.add(Niveau.BAS);
        setIteNiveaux.add(Niveau.MOYEN);
        setIteNiveaux.add(Niveau.MOYEN); // ignoré
        setIteNiveaux.add(Niveau.HAUT);

        Iterator<Niveau> it = setIteNiveaux.iterator();

        while (it.hasNext()) {
            Niveau elementNiveau = it.next();
            System.out.println("Element itéré : " + elementNiveau);

            // Exemple : suppression d’un élément
            if (elementNiveau == Niveau.HAUT) {
                it.remove();
                System.out.println(" -> Niveau supprimé : " + elementNiveau);
            }
        }
        System.out.println("Set final : " + setIteNiveaux);
    }
}
