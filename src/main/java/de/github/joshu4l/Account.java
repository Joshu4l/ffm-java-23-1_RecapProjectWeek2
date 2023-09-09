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


import java.math.BigDecimal;
import java.util.Random;

public class Account {

    private String accountNumber;
    private BigDecimal balance;
    private String clientName;


    // CONSTRUCTORS
    public Account () {
        // Default Constructors
    }
    public Account (String accountNumber, BigDecimal balance, String clientName) {
        // Custom Constructor
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", customerName='" + clientName + '\'' +
                '}';
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    // TRANSACTIONS
    public BigDecimal depositMoney(BigDecimal amount) {
        return this.balance.add(amount);
    }
    public BigDecimal withdrawMoney(BigDecimal amount) {

        //Insufficient balance
        if (balance.compareTo(amount) >= 0) {
            this.balance = balance.subtract(amount);
            return this.balance.subtract(amount);
        } else {
            return this.balance;
        }
    }

    public void transferMoney(String receivingAccount, BigDecimal amount) {
        //Account.getAccountNumber(receivingAccount);

    }


    // GETTER AND SETTER
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getCustomerName() {
        return clientName;
    }
    public void setCustomerName(String customerName) {
        this.clientName = customerName;
    }


}
