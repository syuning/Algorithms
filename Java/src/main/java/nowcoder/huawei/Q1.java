package main.java.nowcoder.huawei;

import java.util.Scanner;

public class Q1 {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        char[] input;
        while (sc.hasNextLine()) {
            int currentScreen = 0;
            int currentSelected = 0;
            int currentCopied = 0;
            input = sc.nextLine().toCharArray();
            for (int i = 0; i < input.length; i++) {
                if (input[i] == '1') { // 输出
                    if (currentSelected > 0) {
                        currentScreen = currentSelected;
                    } else {
                        currentScreen++;
                    }
                    currentSelected = 0;
                } else if ((input[i] == '2') && (currentSelected != 0)) { // 复制
                    currentCopied = currentSelected;
                } else if ((input[i] == '3') && (currentSelected != 0)) { // 剪切
                    currentCopied = currentSelected;
                    currentScreen = 0;
                } else if ((input[i] == '4') && (currentCopied != 0)) { // 粘贴
                    currentScreen = currentCopied;
                    currentSelected = 0;
                } else if (input[i] == '5') { // 全选
                    currentSelected = currentScreen;
                }
            }
            System.out.println(currentScreen);
        }
    }
}
