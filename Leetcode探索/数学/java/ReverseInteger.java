package Leetcode探索.数学.java;

class ReverseInteger {
    public static int reverse(int x) {
        if (x > (Math.pow(2, 32) - 1) || x <  (0 - Math.pow(2, 32))){
        return 0;
        } else if (x >= 0) {
            return (int)Long.parseLong(toReversedString(x));
        } else {
            // x < 0
            return (int)(0-Long.parseLong(toReversedString(0-x)));
        }
    }

    public static String toReversedString (long x) {
        String string = String.valueOf(x);
        String reversedString = "";
        for (int i = 0; i < string.length(); i++) {
            reversedString += string.charAt(string.length() - 1 - i);
        }
        return reversedString;
    }

    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(-123));
        System.out.println(reverse(120));
        System.out.println(reverse(1534236469));
        System.out.println(Math.pow(2, 32));
    }
}