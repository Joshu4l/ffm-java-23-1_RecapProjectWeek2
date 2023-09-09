package de.github.joshu4l;
/*
    Erstellt eine Record 'Client' mit den Eigenschaften Vorname, Nachname und Kundennummer
    (wähle geeignete englische Feldnamen).

    Erstellt eine Klasse 'Account' (kein Record, soll vorerst veränderlich sein)
    mit den Eigenschaften Kontonummer (String), Kontostand (BigDecimal)
    und dem zugehörigen Kunden.

    Nun implementieren wir convenience-Methoden, um den Kontostand zu ermitteln und zu verändern:
    - Implementiert eine Methode, um Geld auf das Konto einzuzahlen.
    - Implementiert eine Methode, um Geld vom Konto abzuheben.

    Nun implementieren wir eine Klasse, die eine Liste von Kunden und deren Konten verwaltet.
    - Erstellt eine Klasse 'BankService', die eine Menge von Konten verwaltet.

    - Implementiert eine Methode im BankService, um ein Konto zu eröffnen.
      Man soll dafür nur einen Kunden als Argument übergeben müssen. Es soll die neue Kontonummer zurückgeben.

    - Implementiert eine Methode im BankService, um einen bestimmten Betrag (als BigDecimal)
      von einer Kontonummer (als String) auf eine andere Kontonummer (als String) zu überweisen.
 */

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        // Instantiate a few client objects
        Client client1 = new Client("Josh", "Albert", "C-0001");
        Client client2 = new Client("Rylie", "Castell", "C-0002");
        Client client3 = new Client("Ulrike", "Werner", "C-0003");

        // Instantiate a BankService object
        BankService myBankService = new BankService();

        // Open an account for every client
        myBankService.openAccount(client1);
        myBankService.openAccount(client2);
        myBankService.openAccount(client3);

        // Show the current content of the BankService's accountRegister
        myBankService.getAccountRegister();

    }
}