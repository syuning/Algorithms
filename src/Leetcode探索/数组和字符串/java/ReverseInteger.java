package Leetcode探索.数组和字符串.java;

public class ReverseInteger {
    public static int reverse(int x) {
        long resultNum = Long.parseLong(toReversedString(x));
        System.out.println(x);
        System.out.println(resultNum);
        System.out.println(x >= 0 && resultNum < Integer.MAX_VALUE);
        System.out.println(x < 0 && resultNum > Integer.MIN_VALUE);
        if (x >= 0 && resultNum < Integer.MAX_VALUE) {
            return (int)resultNum;
        }else if(x < 0 && resultNum < Integer.MAX_VALUE){
            return (int)-resultNum;
        } else {
            return 0;
        }
    }

    public static String toReversedString(long x) {
        String string = String.valueOf(x);
        String reversedString = "";
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(string.length() - 1 - i) != '-') {
                reversedString += string.charAt(string.length() - 1 - i);
            }
        }
        System.out.println("reversedString = " + reversedString);
        return reversedString;
    }

    public static void main(String[] args) {
        System.out.println("\n\n\n");
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(1534236469));
        System.out.println(reverse(-2147483648));
        System.out.println(Math.pow(2, 32));
    }
}