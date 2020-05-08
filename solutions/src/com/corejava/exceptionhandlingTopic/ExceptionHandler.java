package com.corejava.exceptionhandlingTopic;

import com.corejava.oopTopic.abstract_.CardType;

/**
 * @author Bangyi Yang
 * @created 2020/05/05
 */
public class ExceptionHandler {

    private static class Address {
        String address;

        public Address (String address) {
            this.address = address;
        }

        public void isOutSideOfUS() throws AddressException{
            if (!address.contains("US")) {
                throw new AddressException("Address is outSide of US");
            }
        }
    }

    public static void handleException(CardType cardType, Address address) {
        try {
            CardType.payWithoutAMEX(cardType);
            address.isOutSideOfUS();
        } catch (CardTypeException cte) {
            System.out.println("CardTypeException is caught");
            cte.printStackTrace();
        } catch (AddressException ae) {
            System.out.println("AddressException is caught");
            ae.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        // @result
        //  CardTypeException is caught
        //  com.corejava.exceptionhandlingTopic.CardTypeException: AMEX is not supported
        //	at com.corejava.oopTopic.abstract_.CardType.payWithoutAMEX(CardType.java:27)
        //	at com.corejava.exceptionhandlingTopic.ExceptionHandler.handleException(ExceptionHandler.java:27)
        //	at com.corejava.exceptionhandlingTopic.ExceptionHandler.main(ExceptionHandler.java:43)
        CardType ct = new CardType(CardType.CardTypeEnum.AMEX);
        Address address = new Address("US");
        handleException(ct, address);
    }
}
