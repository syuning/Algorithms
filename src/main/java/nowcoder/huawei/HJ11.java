package main.java.nowcoder.huawei;

import java.io.*;

public class HJ11 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            for (int i = s.length() - 1; i >= 0; i--){
                System.out.print(s.charAt(i));
            }
        }
    }
}
