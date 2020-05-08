package com.corejava.oopTopic.abstract_;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 * @update 2020/05/05
 */
public class VisaCard extends CreditCard {
    public VisaCard (String holderName, String cardNumber, Long accountBalance, CardType cardType) {
        super(holderName, cardNumber, accountBalance, cardType);
    }

    public boolean isCardAcceptable(CardType cardType) {
        if (cardType.getCardType() == CardType.CardTypeEnum.VISA) return true;
        return false;
    }
}
