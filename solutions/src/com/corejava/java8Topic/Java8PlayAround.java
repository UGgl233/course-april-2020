package com.corejava.java8Topic;

import com.corejava.java8Topic.defaultmethodinterface.CreditCard;
import com.corejava.java8Topic.defaultmethodinterface.MasterCard;
import com.corejava.java8Topic.defaultmethodinterface.VisaCard;
import com.corejava.java8Topic.functionalinterface.MyStream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Bangyi Yang
 * @created 2020/05/05
 */
public class Java8PlayAround {
    public static void main(String[] args) {
        // 1
        MasterCard masterCard = new MasterCard();
        VisaCard visaCard = new VisaCard();
        masterCard.payBill(1);
        visaCard.payBill(2);
        CreditCard.refund(1);

        // 2
        // 2.1 - General
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(MyStream.MyMap(list));

        MyStream.MyInterface lambda = (List<Integer> lst) -> lst.stream()
                .map(x -> x * 3)
                .collect(Collectors.toList());

        // 2.2 - lambda
        System.out.println(lambda.MyMap(list));

        // 3
        String str = "walabcwalexywalxzsfwalmx";
        System.out.println(Arrays.stream(str.split("wal"))
                .collect(Collectors.joining("sams")));

        // 4
        String str2 = "Eclipse eclipse Eclipse eclipse amc clip ECLIPSE";
        String str3 = str2.toLowerCase();
        Map<String, Integer> map =  Arrays.asList(str.split(" ")).stream()
                .collect(Collectors.groupingBy(o -> o, Collectors.summingInt(o -> 1)));
    }
}
