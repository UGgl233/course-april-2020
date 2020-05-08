package com.corejava.designpatternTopic.factory;

/**
 * @author Bangyi Yang
 * @created 2020/05/05
 */
public class CurrencyExchange {
    public static Currency getCurrency(String countryName) {
        Currency currency = null;
        try {
            if (countryName.equals("China")) return new RMB();
            else if (countryName.equals("United state")) return new USD();
            else throw new Exception("Wrong Currency");
        } catch (Exception e) {
             e.printStackTrace();
        }
        return currency;
    }

    public static void main(String[] args) {
        // @TEST
        Currency c = getCurrency("China");
        System.out.println(c.getCOUNTRY());
        Currency c2 = getCurrency("United state");
        System.out.println(c2.getCOUNTRY());
    }
}
