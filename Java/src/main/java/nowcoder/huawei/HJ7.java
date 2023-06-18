package main.java.nowcoder.huawei;

import java.util.Scanner;

public class HJ7 {
    public static void main (String [] args) {
        Scanner scanner = new Scanner(System.in);
        float f = scanner.nextFloat();
        int i = (int)f;
        if (f * 10 - i * 10 > 4) {
            System.out.print((int)f + 1);
        } else {
            System.out.print((int)f);
        }
    }
}
