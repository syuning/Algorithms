package main.java.nowcoder.huawei;

import java.io.*;

public class HJ106 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString;
        while ((inputString = br.readLine()) != null) {
            for (int i = inputString.length() - 1; i >= 0 ; i--) {
                System.out.print(inputString.charAt(i));
            }
        }
    }
}
