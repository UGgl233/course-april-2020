package com.corejava.stringTopic;

import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Bangyi Yang
 * @created 2020/05/04
 */
public class StringManipulation {
    public static void main(String[] args) {
        // 1
        subStringUse();
        // 2
        System.out.println(compareByChars("Teacher Appreciation Week is a national holiday",
                "Teacher Appreciation Week is a national holiday"));
        // 3
        returnStringList();
        List<String[]> test = new LinkedList<>();
        test.add(new String[] {"i", " wanna "});
        test.add(new String[] {"eat", " dinner!"});
        // 4
        System.out.println(flatTheStringList(test));
    }
    private static void subStringUse() {
        String str = "Algorithms";
        System.out.println(str.substring(2, 4));
        System.out.println(str.substring(0, 4));
    }

    private static boolean compareByChars(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            char char1 = s1.charAt(i);
            char char2 = s2.charAt(i);
            if (char1 != char2) return false;
        }
        return true;
    }

    private static String[] returnStringList() {
        String str = "https://www.amazon.com/demo?test=abc";

        // regex way
//        str.replaceAll("[^a-zA-Z0-9]", " ");
//        str.replaceAll("\\s{2,}", " ").trim();
//        String[] res = str.split(" ");
//        return res;

        // StringTokenizer way
        List<String> res = new LinkedList<>();
        StringTokenizer stringTokenizer = new StringTokenizer(str, ":/.?=");
        while (stringTokenizer.hasMoreElements()) {
            res.add(stringTokenizer.nextToken());
        }
        return res.stream().toArray(String[]::new);
    }

    private static String flatTheStringList(List<String[]> strList) {
        StringBuilder sb = new StringBuilder();
        for (String[] sList : strList) {
            for (String str : sList) sb.append(str);
        }
        return sb.toString();
    }
}
