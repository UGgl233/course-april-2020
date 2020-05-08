package com.corejava.oopTopic.abstract_;

import com.corejava.exceptionhandlingTopic.CardTypeException;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 * @updated 2020/05/05, reconstruct CardType class and add CardTypeEnum
 */
public class CardType {
    private CardTypeEnum cardType;

    public CardType(){}
    public CardType(CardTypeEnum cardType) {
        this.cardType = cardType;
    }

    public void setCardType(CardTypeEnum cardType) {
        this.cardType = cardType;
    }

    public CardTypeEnum getCardType() {
        return cardType;
    }

    public static void payWithoutAMEX (CardType cardType) throws CardTypeException {
        if (cardType.getCardType() == CardTypeEnum.AMEX) {
            throw new CardTypeException("AMEX is not supported");
        }
    }

    public enum CardTypeEnum {
        VISA,
        MASTER,
        AMEX
    }
}
