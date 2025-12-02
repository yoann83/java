package fr.java.cours.perso;

/**
 * Clique droit générate constructeur
 */
public class NombreDeCharacteresInvalideException extends Exception{
    public NombreDeCharacteresInvalideException() {
    }

    public NombreDeCharacteresInvalideException(String message) {
        super(message);
    }
}
