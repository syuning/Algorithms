package main.java.nowcoder.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HJ91 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input;
        while ((input = br.readLine()) != null) {
            int m = Integer.parseInt(input.split(" ")[0]); // 横向
            int n = m + Integer.parseInt(input.split(" ")[1]); // 纵向

            // 实际上从矩阵左上角到右下角（只能走 → 或 ↓）的路径总数 = (m)个 → 和 (n)和 ↓ 的排列组合
            // 按照排列组合的公式：(m+1)! / (m+1-(n+1))!

            System.out.println(getCombination(m, n));
        }
    }
    public static int getCombination(int m, int n) {
        // n > m
        int denominator = 1;
        int numerator = 1;
        for (int i = 1; i < n + 1; i++) {
            numerator *= i;
        }
        for (int i = 1; i < m + 1; i++) {
            denominator *= i;
        }
        for (int i = 1; i < (n - m) + 1; i++) {
            denominator *= i;
        }
        return numerator/denominator;
    }
}
