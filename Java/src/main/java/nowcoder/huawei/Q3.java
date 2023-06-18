package main.java.nowcoder.huawei;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String s = sc.nextLine();
        char [] signal = s.toCharArray();
            int pairs = 0;
            for (int i = 1; i < signal.length -1; i++) {
                if (signal[i] == '1' && signal[i-1] == '0' && signal[i+1] == '0') {
                    pairs++;
                } else
                if ((signal[i] == '1' && signal[i-1] == '1') || (signal[i] == 1 && signal[i+1] == '1')){
                    pairs = 0;
                }
            }

            if (pairs == 0) {
                System.out.println(-1);
            }else if (pairs == 1) {
                System.out.print("010");
            } else {
                for (int i = 0; i < pairs-1; i++) {
                    System.out.print("01");
                }
                System.out.print("0");
            }
    }
}
