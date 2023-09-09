package de.github.joshu4l;

/*
    Erstellt eine Record 'Client' mit den Eigenschaften Vorname, Nachname und Kundennummer
    (wähle geeignete englische Feldnamen).

    Erstellt eine Klasse 'Account' (kein Record, soll vorerst veränderlich sein)
    mit den Eigenschaften Kontonummer (String), Kontostand (BigDecimal)
    und dem zugehörigen Kunden.
 */

public record Client(

        String firstName,
        String lastName,
        String id


) {
}
