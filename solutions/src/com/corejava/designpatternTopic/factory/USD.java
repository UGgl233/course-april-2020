package com.corejava.designpatternTopic.factory;

/**
 * @author Bangyi Yang
 * @created 2020/05/05
 */
public class USD implements Currency {
    private static final String COUNTRY = "UNITED_STATE";
    public String getCOUNTRY() {
        return COUNTRY;
    }
}
