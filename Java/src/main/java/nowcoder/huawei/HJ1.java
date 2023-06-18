package main.java.nowcoder.huawei;

import java.util.Scanner;

public class HJ1 {
    // 计算字符串最后一个单词的长度
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        while (sc.hasNextLine()) {
            String[] ss = sc.nextLine().split(" ");
            String s = ss[ss.length];
            System.out.print(s.length());
        }
        sc.close();
    }
}