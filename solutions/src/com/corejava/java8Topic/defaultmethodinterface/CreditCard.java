package com.corejava.java8Topic.defaultmethodinterface;

import com.corejava.oopTopic.abstract_.CardType;

/**
 * @author Bangyi Yang
 * @created 2020/05/05
 */
public interface CreditCard {
    String HOLDER_NAME = "JFK";
    String CARD_NUMBER = "98u12";
    Double ACCOUNT_BALANCE = -1.0;
    CardType CARD_TYPE = new CardType();

    boolean isCardAcceptable(CardType cardType);

    default void payBill(double bill) {
        // @QUESTION ???
        System.out.println("Bill get paid");
    }

    static void refund(double amount){
        System.out.println("Bill get refunded");
    }
}
