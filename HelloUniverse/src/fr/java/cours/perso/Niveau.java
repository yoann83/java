package fr.java.cours.perso;

public enum Niveau {
    BAS("froid", 1),
    MOYEN("tempéré", 2),
    HAUT("chaud", 3);

    private final String description;
    private final int danger;

    Niveau(String description, int danger) {
        this.description = description;
        this.danger = danger;
    }

    public String getDescription() { return description; }
    public int getDanger() { return danger; }
}

