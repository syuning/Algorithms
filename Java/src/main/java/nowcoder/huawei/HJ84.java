package main.java.nowcoder.huawei;

import java.io.*;

public class HJ84 {
    public static void main (String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString;
        while ((inputString = br.readLine()) != null) {
            int count = 0;
            for ( char c: inputString.toCharArray()) {
                if (c > 64 && c < 91) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
