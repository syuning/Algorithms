package com.bs.nowcoder;

import java.util.ArrayList;
import java.util.Scanner;

public class Question3 {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.next());
        ArrayList<Integer> inputArray = new ArrayList();
        for (int i = 0; i < n; i ++) {
            int current = Integer.parseInt(input.next());
            if (inputArray.contains(current)) {
                break;
            } else {
                inputArray.add(current);
            }
        }
        ArrayList<Integer> OutputArray = new ArrayList();
        int min = inputArray.get(0); //取第一个数为最小值
        for (int i = 1; i < inputArray.size(); i++) {
            if (inputArray.get(i) < min) {
                //若当前数小于min，则将原min加入数组，并取当前值为新的min
                OutputArray.set(i, min);
                min = inputArray.get(i);
            } else {
                //若当前数大于min，则将当前值加入数组
                OutputArray.set(i, inputArray.get(i));
            }
        }
        System.out.println(OutputArray);
    }
}
