package 面试题.nowcoder.huawei;

import java.util.Scanner;

public class CalculateChar {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        String inputString = input.next();
        char inputChar = input.next().charAt(0);
        int length = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            if (c == inputChar) {
                length++;
            }

            //不区分大小写的输入
            if (c >= 'A' && c <= 'Z') {
                c += 32;
                if (c == inputChar) {
                    length++;
                }
            } else if (c >= 'a' && c <= 'z') {
                c -= 32;
                if (c == inputChar) {
                    length++;
                }
            }
        }
        System.out.println(length);
        input.close();
    }
}