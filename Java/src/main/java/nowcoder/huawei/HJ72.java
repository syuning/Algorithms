package main.java.nowcoder.huawei;

import java.io.*;

public class HJ72 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(br.readLine() != null){
//            鸡翁一值钱五, 鸡母一值钱三, 鸡雏三值钱一, 百钱买百鸡
//            x + y + z == 100 && 5x + 9y + 1/3z == 100 => 15x +9y + z ==300
//            14 * x + 8 * y == 200; => 7 * x + 4 * y == 100
            x: for (int x = 0; x <= 100; x++) { // 公鸡
                y: for (int y = 0; y <= 100; y++) { // 母鸡
                    if (7 * x + 4 * y == 100) {
                        int z = 100 - x - y; // 雏鸡
                        System.out.println(x + " " + y + " " + z);
                    }
                }
            }
        }
    }
}
