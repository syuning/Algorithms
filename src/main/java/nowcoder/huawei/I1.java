package main.java.nowcoder.huawei;

import java.io.*;

/**
 * 求两个整数的最大公约数和最小公倍数
 */
public class I1 {
    public static void main(String[] args) throws IOException{
        BufferedReader bs = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while((input = bs.readLine()) != null) {

            // 假设输入格式为一行内输入2个空格分隔的整数+回车, 如: 6 9 (加回车)
            int a = Integer.parseInt(input.split(" ")[0]);
            int b = Integer.parseInt(input.split(" ")[1]);

            int min = 1; // 最大公约数初始值, 待升
            // 先计算最大公约数
            for (int i = min; i < (a + 1) && i < (b + 1); i++) {
                if (a % i == 0 && b % i == 0) {
                    min = i;
                }
            }

            // 最小公倍数 = 乘积除以最大公约数
            int max = a * b / min;

            System.out.println("整数"+ a + "和整数" + b + "的");
            System.out.println("最大公约数 = " + min);
            System.out.println("最小公倍数 = " + max);

        }
    }

}
