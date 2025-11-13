package perso;

public enum TypeMinerais {
    FER("Fer"),
    PLOMB("Plomb"),
    PLATINE("Platine"),
    OR("Or");

    final String nomtypeMinerais;

    private TypeMinerais(String nomtypeMinerais){
        this.nomtypeMinerais = nomtypeMinerais;
    }
}
