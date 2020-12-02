package main.java.nowcoder.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ75 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1, s2;
        int maxLength = 0;
        while ((s1 = br.readLine()) != null  && (s2 = br.readLine()) != null) {
            for (int i = 0; i < s1.length(); i++) {
                for (int j = i; j < s1.length(); j++) {
                    if (s2.contains(s1.substring(i, j+1)) && maxLength < j + 1 - i) {
                        maxLength = j + 1 - i;
                    }
                }
            }
            System.out.println(maxLength);
        }
    }
}
