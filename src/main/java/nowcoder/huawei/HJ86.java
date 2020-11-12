package main.java.nowcoder.huawei;

import java.util.Scanner;

public class HJ86 {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        String binaryI = Integer.toBinaryString(i);
        System.out.println("binaryI = " + binaryI);
        int count = 0;
        int max = 0;
        for (int j = 0; j < binaryI.length(); j++) {
            if (binaryI.charAt(j) == '0') {
                count = 0;
            } else {
                count++;
                if (max < count) {
                    max = count;
                }
            }
        }
        System.out.println(max);
    }
}
