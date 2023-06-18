package main.java.nowcoder.huawei;

import java.io.*;
public class HJ66 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            String[] input = s.split(" ");
            if (input.length == 1) {
                System.out.println("reset what");
            } else {
                if (input[0].charAt(0) == 'h') {
                    System.out.println("unknown command");
                } else if (input[1].charAt(0) == 'd') {
                    System.out.println("no board at all");
                } else if (input[0].charAt(2) == 's') {
                    System.out.println("board fault");
                } else if (input[1].charAt(1) == 'd') {
                    System.out.println("where to add");
                } else if (input[0].charAt(1) == 'e') {
                    System.out.println("impossible");
                } else if (input[0].charAt(2) == 'c') {
                    System.out.println("install first");
                }
            }
        }
    }
}
