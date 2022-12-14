package de.dgnexolution.filmverleih.domain;

import javax.persistence.*;

/**
 * Diese Klasse dient zum Erzeugen von Filmobjekten.
 * Da diese Klasse nur eine Beschreibung des Objekts enthält, aber keine Logik,
 * handelt es sich um ein sogenanntes POJO (Plain Old Java Object).
 */

@Entity
@Table
public class Film {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // TODO: restlichen Attribute ergänzen

    // TODO: Konstruktor mit Attributen ergänzen

    /**
     * Beginn: Getter- und Setter-Methoden
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
