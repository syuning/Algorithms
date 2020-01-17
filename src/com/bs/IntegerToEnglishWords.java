package com.bs;

import java.util.HashMap;

class IntegerToEnglishWords {

    public static String getMap(int num) {
        HashMap<Integer, String> numberMap = new HashMap<>();
        numberMap.put(0, "");
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
        numberMap.put(19, "Nineteen");
        numberMap.put(20, "Twenty");
        numberMap.put(30, "Thirty");
        numberMap.put(40, "Forty");
        numberMap.put(50, "Fifty");
        numberMap.put(60, "Sixty");
        numberMap.put(70, "Seventy");
        numberMap.put(80, "Eighty");
        numberMap.put(90, "Ninety");

        return numberMap.get(num);
    }

    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        } else {
            return billionsToWords(num);
        }
    }

    public static String tensToWords (int num) {
        int tens = num / 10;
        if (num < 20) {
            return getMap(num);
        } else {
            if (num % 10 == 0) {
                return getMap(tens * 10);
            }
            int ones = num - tens * 10;
            return getMap(tens * 10) + " " + getMap(ones);
        }
    }

    public static String hundredToWords(int num) {
        int hundreds = num / 100;
         if (num % 100 == 0 && num != 0) {
            return getMap(hundreds) + " Hundred";
        } else if (num > 100) {
            return getMap(hundreds) + " Hundred " + tensToWords(num - hundreds * 100);
        } else {
            return tensToWords(num);
        }
    }

    public static String billionsToWords (int num) {
        String thousands = "";
        int billions = num / 1000000000;
        int millions = (num - billions * 1000000000) / 1000000;
        int thousand = (num - billions * 1000000000 - millions * 1000000) / 1000;
        int ones = (num - billions * 1000000000 - millions * 1000000 - thousand * 1000);

        if (num > 999999999) {
            thousands += hundredToWords(billions) + " Billion " + hundredToWords(millions) + " Million " + hundredToWords(thousand) + " Thousand " + hundredToWords(ones);
        } else if (num > 999999) {
            thousands += hundredToWords(millions) + " Million " + hundredToWords(thousand) + " Thousand " + hundredToWords(ones);
        } else if (num > 999) {
            thousands += hundredToWords(thousand) + " Thousand " + hundredToWords(ones);
        } else {
            thousands += hundredToWords(num);
        }
        return thousands;
    }

    public static void main(String[] args) {
        System.out.println(billionsToWords(1000));
    }
}