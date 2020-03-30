package 面试题.leetcode;

import java.util.HashMap;

// # 273 - 整数转换英文表示
// 执行用时 : 7 ms, 在所有 Java 提交中击败了 15.65% 的用户
// 内存消耗 : 36.4 MB, 在所有 Java 提交中击败了 9.68% 的用户

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
        } else if (num < 1000) {
            return hundredToWords(num);
        } else if (num < 1000000) {
            return thousandToWords(num);
        } else if (num < 1000000000) {
            return millionsToWords(num);
        } else if (num < Math.pow(2, 32)) {
            return billionsToWords(num);
        } else {
            return "Integer must be less than th 32th power of 2.";
        }
    }

    public static String tensToWords (int num) {
        int tens = num / 10;
        if (num < 20) {
            return getMap(num);
        } else {
            if (num % 10 == 0 && num != 0) {
                return getMap(tens * 10);
            }
            int ones = num - tens * 10;
            return getMap(tens * 10) + " " + getMap(ones);
        }
    }

    public static String hundredToWords(int num) {
        if (num < 100) {
            return tensToWords(num);
        }
        String hundredInWords = "";
        int hundreds = num / 100;
        if (num % 100 == 0 && num != 0) {
            hundredInWords = getMap(hundreds) + " Hundred";
        } else if (num > 100) {
            hundredInWords = getMap(hundreds) + " Hundred " + tensToWords(num - hundreds * 100);
        }

        return hundredInWords;
    }

    public static String thousandToWords(int num) {
        if (num < 1000) {
            return hundredToWords(num);
        }
        String thousandsInWords = "";
        int thousand = num / 1000;
        int hundreds = num - thousand * 1000;if (num % 1000 == 0 && num != 0) {
            thousandsInWords += hundredToWords(thousand) + " Thousand";
        } else {
            thousandsInWords += hundredToWords(thousand) + " Thousand " + hundredToWords(hundreds);
        }
        return thousandsInWords;

    }

    public static String millionsToWords (int num) {
        if (num < 1000000) {
            return thousandToWords(num);
        }
        String millionsInWords = "";
        int millions = num / 1000000;
        int thousand = num - millions * 1000000;
        if (num % 1000000 == 0 && num != 0) {
            millionsInWords += hundredToWords(millions) + " Million";
        } else {
            millionsInWords += hundredToWords(millions) + " Million " +  thousandToWords(thousand);
        }

        return millionsInWords;
    }

    public static String billionsToWords (int num) {
        String billionsInWords = "";
        int billions = num / 1000000000;
        int millions = num - billions * 1000000000;

        if (num % 1000000000 == 0) {
            billionsInWords = hundredToWords(billions) + " Billion";
        } else {
            billionsInWords = hundredToWords(billions) + " Billion " + millionsToWords(millions);
        }

        return billionsInWords;
    }

    public static void main(String[] args) {
        System.out.println(numberToWords(1000000001));
    }
}