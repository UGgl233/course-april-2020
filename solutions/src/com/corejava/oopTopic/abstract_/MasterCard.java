package com.corejava.oopTopic.abstract_;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 * @update 2020/05/05
 */
public class MasterCard extends CreditCard{
    public MasterCard(String holderName, String cardNumber, Long accountBalance, CardType cardType){
        super(holderName, cardNumber, accountBalance, cardType);
    }
    public boolean isCardAcceptable(CardType cardType) {
        if (cardType.getCardType() == CardType.CardTypeEnum.MASTER) return true;
        return false;
    }
}
