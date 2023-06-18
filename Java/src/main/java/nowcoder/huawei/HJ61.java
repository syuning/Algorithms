package main.java.nowcoder.huawei;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class HJ61 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int numOfApples = Integer.parseInt(s.split(" ")[0]);
            int numOfPlates = Integer.parseInt(s.split(" ")[1]);
            int numOfChoices = 0;

            for(int i = 0; i < numOfPlates; i++) {
                // i个空盘子，即实际上只有 numOfPlates - i 个盘子里面有苹果
                ArrayList<String> choices = new ArrayList<>();
                for (int j = 0; j < numOfApples - i; j ++) {

                }

            }
        }
    }
}
