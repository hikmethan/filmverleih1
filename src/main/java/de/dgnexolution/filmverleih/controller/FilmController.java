package de.dgnexolution.filmverleih.controller;

import de.dgnexolution.filmverleih.domain.Film;
import de.dgnexolution.filmverleih.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Diese Klasse dient als REST API. Anhand dieser Schnittstelle kann mit der Anwendung mittels HTTP-Requests
 * interagiert werden. Diese Schnittstelle ermöglicht zudem die Kommunikation zwischen dem Frontend und Backend.
 */

// Kennzeichnet diese Klasse als REST API
@RestController
// Basis Pfad für sämtliche Endpunkte (Endpunkt = eine Methode der REST API)
@RequestMapping(path = "/film")

public class FilmController {

    private final FilmService filmService;

    @Autowired
    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }

    /**
     * Gebe alle in der Datenbank vorhandenen Filme aus.
     * @return
     */
    @GetMapping("/all")
    public ResponseEntity<List<Film>> getAllTickets() {
        List<Film> tickets = filmService.findAllFilme();
        return new ResponseEntity<>(tickets, HttpStatus.OK);
    }

    /**
     * Finde einen Film anhand dessen Id.
     * @param id
     * @return
     */
    @GetMapping("/find/{id}")
    public ResponseEntity<Film> getTicketById(@PathVariable("id") Long id) {
        // Hinweis: Die Methode wird nicht mehr rot markiert sein, wenn diese Methode in der Klasse FilmService existiert
        Film film = filmService.findFilmById(id);
        return new ResponseEntity<>(film, HttpStatus.OK);
    }

    /**
     * Erzeuge ein Film Objekt.
     * @param film
     * @return
     */
    @PostMapping("/add")
    public ResponseEntity<Film> addTicket(@RequestBody Film film) {
        Film newFilm = filmService.addFilm(film);
        return new ResponseEntity<>(newFilm, HttpStatus.CREATED);
    }

    /**
     * Aktualisiere die Daten eines Films anhand dessen Id.
     * @param film
     * @return
     */
    @PutMapping("/update/{id}")
    public ResponseEntity<Film> updateFilm(@RequestBody Film film) {
        Film updateFilm = filmService.updateFilm(film);
        return new ResponseEntity<>(updateFilm, HttpStatus.OK);
    }

    /**
     * Entferne einen Film anhand dessen Id.
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Film> deleteFilm(@PathVariable("id") Long id) {
        filmService.deleteFilm(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
