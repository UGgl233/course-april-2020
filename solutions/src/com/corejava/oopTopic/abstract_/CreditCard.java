package com.corejava.oopTopic.abstract_;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 */
public abstract class CreditCard {

    String holderName;
    String cardNumber;
    Long accountBalance;
    CardType cardType;

    public CreditCard(String holderName, String cardNumber, Long accountBalance, CardType cardType) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardType = cardType;
    }
    abstract boolean isCardAcceptable(CardType ardType);

    public void payBill(double bill) {
        System.out.println("Paid!");
    }
}
