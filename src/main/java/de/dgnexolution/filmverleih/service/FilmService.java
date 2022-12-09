package de.dgnexolution.filmverleih.service;

import de.dgnexolution.filmverleih.domain.Film;
import de.dgnexolution.filmverleih.exception.FilmNotFoundException;
import de.dgnexolution.filmverleih.repository.FilmRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmService(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }

    // Erstelle ein Filmobjekt
    public Film addFilm(Film film) {
        return filmRepository.save(film);
    }

    // Finde alle Filmobjekte
    public List<Film> findAllFilme() {
        return filmRepository.findAll();
    }

    // Finde ein Filmobjekt anhand dessen Id
    // TODO: Methode findFilmById erstellen (Beachte: Methode aus FilmNotFoundException verwenden, um Fehler abzufangen)


    // Aktualisiere die Daten eines Filmobjekts
    public Film updateFilm(Film film) {
        return filmRepository.save(film);
    }

    // Lösche ein Filmobjekt anhand dessen Id
    public void deleteFilm(Long id) {
        filmRepository.deleteFilmById(id);
    }

    // Leihe einen Film aus
    // TODO: Methode filmAusleihen erstellen

    // Gebe einen Film zurück
    // TODO: Methode filmZurueckgeben erstellen

}
