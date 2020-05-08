package com.corejava.java8Topic.defaultmethodinterface;

import com.corejava.oopTopic.abstract_.CardType;

/**
 * @author Bangyi Yang
 * @created 2020/05/05
 */
public class VisaCard implements CreditCard {
    String holderName;
    String cardNumber;
    Double accountBalance;
    CardType cardType;

    public VisaCard(String holderName, String cardNumber,
                      Double accountBalance, CardType cardType) {
        this.holderName = holderName;
        this.cardNumber = cardNumber;
        this.accountBalance = accountBalance;
        this.cardNumber = cardNumber;
    }

    public VisaCard() {
        this.holderName = CreditCard.HOLDER_NAME;
        this.cardNumber = CreditCard.CARD_NUMBER;
        this.accountBalance = CreditCard.ACCOUNT_BALANCE;
        this.cardType = CreditCard.CARD_TYPE;
    }

    @Override
    public boolean isCardAcceptable(CardType cardType) {
        return cardType.getCardType() == CardType.CardTypeEnum.VISA;
    }
}
