package com.corejava.designpatternTopic.factory;

/**
 * @author Bangyi Yang
 * @created 2020/05/05
 */
public class RMB implements Currency {
    private static final String COUNTRY = "CHINA";
    public String getCOUNTRY() {
        return COUNTRY;
    }

}
