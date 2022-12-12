# Filmverleih
> Spring Boot Webanwendung

Diese Webanwendung dient als erstes Projekt für die Auszubildenden im ersten Lehrjahr.
Dabei handelt es sich um ein bereitgestelltes Grundgerüst, das die Auszubildenden verwenden können,
um darauf aufbauend Aufgaben zu erledigen.

## Projektbeschreibung
Es handelt sich um eine Anwendung für das Ausleihen von Filmen. Das Projekt ist in der ersten Ausbaustufe
auf das Umsetzen von CRUD-Funktionalitäten beschränkt. Künftige Ausbaustufen sind zunächst nicht geplant, aber möglich.

### Features
- Film erstellen
- Film bearbeiten
- Film löschen
- Film ausleihen
  - zu ergänzen durch Auszubildende
- Film zurückgeben
  - zu ergänzen durch Auszubildende

---
## Lokales Aufsetzen des Projekts
1. Auf den develop-Branch wechseln
   1. Reiter unten rechts in IntelliJ IDE oder über Terminal ```git checkout develop```
2. ```mvn clean install``` im Terminal eingeben oder im Maven Reiter der IDE ausführen
   1. Das dient zum Löschen der Inhalte (Dependencies) des lokalen Maven Repositories sowie des Target-Ordners und
      erneutem Herunterladen der Dependencies.
3. Neuen Branch erstellen und auschecken:
   1. Über Reiter unten rechts in IDE oder über Termin ``` git checkout -b feature-<ticketnr>```
4. Die Anwendung bauen
---
## Problembehandlung
> **Das Projekt wird beim ersten lokalen Aufsetzen nicht als Maven-Projekt erkannt** 

Durch Rechtsklick auf die Projektdatei pom.xml erscheint die Option "add maven project", falls dieses Projekt nicht
bereits durch die IDE als Maven Projekt erkannt wurde.

**Hinweis:** Falls Java-Klassen in IntelliJ kein blaues C-Symbol haben und klein grüner Play-Button in der
Main-Klasse erscheint, deutet es bereits darauf hin, dass das Projekt manuell als Maven konfiguriert werden muss.


