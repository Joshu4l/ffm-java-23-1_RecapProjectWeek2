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

import java.util.*;

public class BankService {


    // ATTRIBUTES
    protected Map<String, Client> accountRegister = new HashMap<>();

    // CONSTRUCTORS

    public String openAccount(Client client) {

        int accountNumberLength = 20; // desired length of the accountNumber
        StringBuilder randomAccountNumber = new StringBuilder();
        Random rand = new Random();

        for (int i = 0; i < accountNumberLength; i++) {
            int randomNumber = rand.nextInt(10); // random number within a range of 0 to 9
            randomAccountNumber.append(randomNumber);
        }
        String iban = "DE" + randomAccountNumber.toString();
        accountRegister.put(iban, client);
        return iban;
    }


   public void getAccountRegister () {
       System.out.println(accountRegister);
   }


}
