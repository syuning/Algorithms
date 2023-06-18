package main.java.nowcoder.huawei;
import java.io.*;
public class HJ87 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String password;
        int score = 0;
        while ((password = br.readLine()) != null) {

            // 字母数字符号检验
            int numOfNums = 0;
            int numOfSymbols = 0;
            boolean hasUppercase = false;
            boolean hasLowerCase = false;
            for (char c: password.toCharArray()) {
                if (c > 47 && c < 58) {
                    numOfNums++;
                } else if (c > 64 && c < 91 ) {
                    hasUppercase = true;
                } else if (c > 96 && c < 123) {
                    hasLowerCase = true;
                } else if (c > 32 && c < 48 || c > 57 && c < 65 || c > 90 && c < 97 || c > 122 && c < 127) {
                    numOfSymbols++;
                }
            }

            System.out.println("numOfNums = " + numOfNums);
            System.out.println("numOfSymbols = " + numOfSymbols);
            System.out.println("hasUppercase = " + hasUppercase);
            System.out.println("hasLowerCase = " + hasLowerCase);

            // 计算分数
            // 长度检验
            if (0 < password.length()  && password.length() < 5) {
                score += 5;
            } else if (4 < password.length() && password.length() < 8) {
                score += 10;
            } else if (password.length() > 7) {
                score += 25;
            }

            // 数字检验
            if (numOfNums == 1){
                score += 10;
            } else if (numOfNums != 0) {
                score += 20;
            }

            // 符号检验
            if (numOfSymbols == 1){
                score += 10;
            } else if (numOfSymbols != 0) {
                score += 25;
            }

            // 字母检验
            if (hasLowerCase && !hasUppercase || hasUppercase && !hasLowerCase) {
                score += 10;
            } else if (hasLowerCase && hasUppercase) {
                score += 20;
            }

            // 奖励环节
            if (hasLowerCase && hasUppercase && (numOfNums > 0) && (numOfSymbols > 0)) {
                score += 5;
            } else if ((numOfNums > 0) && (numOfSymbols > 0)) {
                score += 3;
            } else if ((hasLowerCase || hasUppercase) && numOfNums > 0) {
                score += 2;
            }

            System.out.println("score = " + score);

            // 按照分数输出密码强度
            if (score >= 90) {
                System.out.println("VERY_SECURE");
            } else if (score >= 80) {
                System.out.println("SECURE");
            } else if (score >= 70) {
                System.out.println("VERY_STRONG");
            } else if (score >= 60) {
                System.out.println("STRONG");
            } else if (score >= 50) {
                System.out.println("AVERAGE");
            } else if (score >= 25) {
                System.out.println("WEAK");
            } else {
                System.out.println("VERY_WEAK");
            }
        }
    }
}
