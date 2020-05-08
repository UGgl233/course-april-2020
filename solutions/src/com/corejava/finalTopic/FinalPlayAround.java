package com.corejava.finalTopic;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 */
public class FinalPlayAround {

    private static final double PI_CONSTANT = Math.PI;

    final class ICantBeExtended {

        final String var1 = "var1";
        int var2;

        public ICantBeExtended(int i) {
            var2 = i;
        }

        public final void doThings(int i) {
            var2 = i;
        }
    }

}
