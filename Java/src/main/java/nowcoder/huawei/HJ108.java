package main.java.nowcoder.huawei;

import java.io.*;

public class HJ108 {
    public static void main (String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            int minFactor = 1;
            for (int i = 0; i < a && i < b; i++) {
                if ((minFactor < i) && (a % i == 0) && (b % i == 0)) {
                    minFactor = i;
                }
            }

            System.out.print((a * b) / minFactor);
        }
    }
}
