package main.java.nowcoder.huawei;

import java.io.*;

public class HJ75 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1, s2;
        // asdfas
        // werasdfaswer
        while ((s1 = br.readLine()) != null && (s2 = br.readLine()) != null) {
            int cmStrLength = 0;
            if (s1.length() < s2.length()) {
                for ( int i = 0; i < s2.length(); i++) {
                    while (cmStrLength < s1.length()) {
                        if (s2.contains(s1.substring(0, cmStrLength + 1))) {
                            cmStrLength++;
                        }
                    }
                }
            }
        }
    }
}
