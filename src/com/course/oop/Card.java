package com.course.oop;

public class Card {
    private static int nextId = 1;
    private int id;
    private String number;
    private String expireDate;
    private String cvv;
    private CardType cardType;

    public enum CardType {
        VISA,
        MASTERCARD
    }

    //constructor for card class
    public Card(String number, String expireDate, String cvv, CardType cardType) {
        this.id = nextId++;
        this.number = number;
        this.expireDate = expireDate;
        this.cvv = cvv;
        this.cardType = cardType;
    }

    //Getters and setters
    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public CardType getCardType() {
        return cardType;
    }

    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}
