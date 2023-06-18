package main.java.nowcoder.huawei;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HJ83 {
    public static void main (String [] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arguments = new int[11];
        arguments[10] = 1; // 计算参数个数
        br.lines().forEach(s ->
                {
                    // 1 2 3 4 5 五个参数
                    switch (arguments[10]) {
                        case 1:
                            arguments[0] = Integer.parseInt(s.split(" ")[0]);
                            arguments[1] = Integer.parseInt(s.split(" ")[1]);
                            if (arguments[0] > 9 || arguments[1] > 9) {
                                System.out.println(-1);
                            } else {
                                System.out.println(0);
                            }
                            arguments[10]++;
                            break;
                        case 2:
                            arguments[2] = Integer.parseInt(s.split(" ")[0]);
                            arguments[3] = Integer.parseInt(s.split(" ")[1]);
                            arguments[4] = Integer.parseInt(s.split(" ")[2]);
                            arguments[5] = Integer.parseInt(s.split(" ")[3]);
                            if (arguments[2] > arguments[0] - 1
                                    || arguments[3] > arguments[1] - 1
                                    || arguments[4] > arguments[0] - 1
                                    || arguments[5] > arguments[1] - 1) {
                                System.out.println(-1);
                            } else {
                                System.out.println(0);
                            }
                            arguments[10]++;
                            break;
                        case 3:
                            arguments[6] = Integer.parseInt(s);
                            if (arguments[0] >= 9 || arguments[6] > arguments[0] - 1) {
                                System.out.println(-1);
                            } else {
                                System.out.println(0);
                            }
                            arguments[10]++;
                            break;
                        case 4:
                            arguments[7] = Integer.parseInt(s);
                            if (arguments[1] >= 9 || arguments[7] > arguments[1] - 1) {
                                System.out.println(-1);
                            } else {
                                System.out.println(0);
                            }
                            arguments[10]++;
                            break;
                        case 5:
                            arguments[8] = Integer.parseInt(s.split(" ")[0]);
                            arguments[9] = Integer.parseInt(s.split(" ")[1]);
                            if (arguments[8] > arguments[0] - 1 || arguments[9] > arguments[1] - 1) {
                                System.out.println(-1);
                            } else {
                                System.out.println(0);
                            }
                            arguments[10] = 1;
                            break;
                    }
                }
        );
    }
}
