package main.java.nowcoder.huawei;

import java.util.Scanner;

public class HJ15 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        String binaryString = Integer.toBinaryString(sc.nextInt());
        int count = 0;
        for (int i = 0; i < binaryString.length(); i++){
            if (binaryString.charAt(i)  == '1') {
                count++;
            }
        }
        System.out.print(count);
    }
}
