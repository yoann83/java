package exercices;

public class Planete {
    String nom;
    int diametre;
    String matiere;
    int totalVisiteurs;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuel;

    int revolution(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne autour de mon étoile de "+degres+" degrés.");
        return degres/360;
    }

    int rotation(int degres){
        System.out.println("Je suis la planète "+nom+" et je tourne sur moi-même de "+degres+" degrés.");
        return degres/360;
    }

    Vaisseau accueillirVaisseau(Vaisseau nouveauVaisseau){
        totalVisiteurs += nouveauVaisseau.nbPassagers;
        Vaisseau vaisseauEnPartance = vaisseauActuel;
        vaisseauActuel = nouveauVaisseau;
        return vaisseauEnPartance;
    }
}