package main.java.nowcoder.huawei;

import java.io.*;

public class HJ74 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            String [] dates = s.split(" ");
            System.out.println(dates.length);

            for (int i = 0; i < dates.length; i++) {
                System.out.println(dates[i]);
            }
        }
    }
}
