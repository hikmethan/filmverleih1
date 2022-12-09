package de.dgnexolution.filmverleih.repository;

import de.dgnexolution.filmverleih.domain.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Dieses Interface ermöglicht das Zugreifen auf die Film Datenbanktabelle, indem es viele Methoden bereitstellt,
 * die SQL-Befehle ausführen, um die Film Datenbanktabelle zu manipulieren bzw. abzufragen.
 * Diese bereitgestellten Methoden können durch Drücken der Tasten alt+einfg und dann Klicken auf "Override Methods"
 * eingesehen werden. Diese Methoden werden durch das Framework (Bibliothek, die fertigen Code bereitstellt)
 * Spring Data JPA bereitgestellt.
 */
@Repository
public interface FilmRepository extends JpaRepository<Film, Long> {
    void deleteFilmById(Long id);

    /*
     Der Typ Optional<Film> sagt aus, dass das Ojekt vom Typ Film in der Datenbank theoretisch vorhanden sein kann
     oder auch nicht. Beim Suchen eines Films darf das aber nicht vorkommen, der Nutzer muss zumindest verstehen, wieso
     sein gewünschter Film nicht erscheint. Deshalb wird in der FilmService Klasse ein Fehlerabfangmechanismus benötigt.
     Dieser wird durch die Methode in der Klasse FilmNotFoundException umgesetzt.

     Auszug aus der originalen Doku: "Optional is primarily intended for use as a method return type where there is a
     clear need to represent "no result," and where using null is likely to cause errors. A variable whose type is
     Optional should never itself be null.."

     Tipp: Originale Dokus sind aufrufbar durch Halten der strg Taste und Klicken auf die gewünschte Stelle im Code
     (Datentyp, Methode etc.). Gerne mal bei Optional ausprobieren!
     */
    Optional<Film> findFilmById(Long id);
}
