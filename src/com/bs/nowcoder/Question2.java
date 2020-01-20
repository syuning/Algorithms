package com.bs.nowcoder;

import java.util.Scanner;

public class Question2 {
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

}
}
