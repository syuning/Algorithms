package main.java.nowcoder.huawei;

import java.io.*;
public class HJ85 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString;
        int maxLength = 0;
        while ((inputString = br.readLine()) != null) {
            for (int i = 0; i < inputString.length(); i++) {
                for (int j = i; j < inputString.length(); j++) {
                    String subInputString = inputString.substring(i, j + 1);
                    if (isPalindrome(subInputString) && maxLength < subInputString.length()) {
                        maxLength = subInputString.length();
                    }
                }
            }
            System.out.println(maxLength);
        }
    }
    public static boolean isPalindrome(String s) {
        int halfLength = s.length() / 2; // 假如s长度为单数，则最中间的字符不需要参与判断
        boolean isPalindrome = true;
        for ( int i = 0; i < halfLength; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                isPalindrome = false;
            }
        }
        return isPalindrome;
    }
}
