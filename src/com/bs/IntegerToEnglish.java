package com.bs;

import java.util.HashMap;

public class IntegerToEnglish {
    public String numberToWords(int num) {
        String string = new String(String.valueOf(num));

        HashMap<Integer, String> numberMap = new HashMap<Integer, String>();
        numberMap.put(1, "One");
        numberMap.put(2, "Two");
        numberMap.put(3, "Three");
        numberMap.put(4, "Four");
        numberMap.put(5, "Five");
        numberMap.put(6, "Six");
        numberMap.put(7, "Seven");
        numberMap.put(8, "Eight");
        numberMap.put(9, "Nine");
        numberMap.put(10, "Ten");
        numberMap.put(11, "Eleven");
        numberMap.put(12, "Twelve");
        numberMap.put(13, "Thirteen");
        numberMap.put(14, "Fourteen");
        numberMap.put(15, "Fifteen");
        numberMap.put(16, "Sixteen");
        numberMap.put(17, "Seventeen");
        numberMap.put(18, "Eighteen");
        numberMap.put(19, "Ninteen");
        numberMap.put(20, "Twenty");
        numberMap.put(30, "Thirty");
        numberMap.put(40, "Fourty");
        numberMap.put(50, "Fifty");
        numberMap.put(60, "Sixty");
        numberMap.put(70, "Seventy");
        numberMap.put(80, "Eighty");
        numberMap.put(90, "Ninty");
        numberMap.put(100, "Handred");
        numberMap.put(1000, "Thousand");
        numberMap.put(1000000, "Million");
        numberMap.put(1000000000, "Billion");

        numberMap.get(1);


        int[] numList = new int[string.length()];
        int current = num;
        for (int i = 0; i < string.length(); i++) {
            numList[i] = current % 10;
            current /= 10;
            if (i%3 == 2) {

            }
        }
        System.out.print(string.length());
        return string;
    }
}
