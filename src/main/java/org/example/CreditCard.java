    package org.example;

    public class CreditCard {
    private String cardNumber;
    private String expirationDate;

    public CreditCard(String cardNumber, String expirationDate) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    @Override
    public String toString() {
        return "Credit Card ending in " + cardNumber.substring(cardNumber.length() - 4);
    }
    }

