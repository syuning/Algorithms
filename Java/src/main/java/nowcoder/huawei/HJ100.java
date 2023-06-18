package main.java.nowcoder.huawei;

import java.io.*;

public class HJ100 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString;
        while ((inputString = br.readLine()) != null) {
            int input = Integer.parseInt(inputString);
            int sum = (2 + (input - 1) * 3 + 2) * input / 2;
            System.out.println(sum);
        }
    }
}
