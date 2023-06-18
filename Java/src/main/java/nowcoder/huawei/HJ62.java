package main.java.nowcoder.huawei;

import java.util.Scanner;

public class HJ62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextInt()) {
            String binaryS = Integer.toBinaryString(sc.nextInt());
            int curNumOfOne = 0;
            for (char c: binaryS.toCharArray()) {
                if (c == '1') {
                    curNumOfOne++;
                }
            }
            System.out.println(curNumOfOne);
        }
        sc.close();
    }
}
