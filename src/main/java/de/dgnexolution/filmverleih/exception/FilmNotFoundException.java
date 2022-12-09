package de.dgnexolution.filmverleih.exception;

/**
 * Diese Klasse dient zum Bereitstellen einer Methode, die eine String-Meldung (Message) ausgeben kann.
 * Bei Fehlern, die das Ermitteln eines Filmobjekts in der Datenbank betreffen, kann die Methode dieser Klasse in der
 * entsprechenden Methode verwendet werden, um ggf. die Fehlermeldung abzufangen und dem User eine verständliche
 * und möglichst nicht-technische Fehlerursache zu nennen.
 */

public class FilmNotFoundException extends RuntimeException {

    public FilmNotFoundException(String message) {
        super(message);
    }
}
