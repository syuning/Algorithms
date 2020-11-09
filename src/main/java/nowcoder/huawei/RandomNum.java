package main.java.nowcoder.huawei;

import java.util.Scanner;

public class RandomNum {
    public static void main (String[] args) {
        final Scanner input = new Scanner(System.in);
        final int n = Integer.parseInt(input.next());
        final int[] nums = new int[n]; 
        int index = 0;
        while (input.hasNext()) {
            boolean existed = false;
            final int current =input.nextInt();
            for (int i = 0; i < index; i++) {
                // 去重
                if (current == nums[i]){
                    existed = true;
                }
            }
            if (!existed) {
                nums[index] = current;
            
            index++;
            }
        }

        // 排序
        final int min = nums[0];
        String newNums = "" + min;
        for (int i = 1; i <index + 1; i++) {
            if(nums[i] < min) {
                newNums = nums[i] + newNums;
            } else {
                newNums = newNums + nums[i];
            }
        }
        input.close();
        
        // for (int i = 0; i < newNums.length(); i++) {
        //     System.out.println(newNums.charAt(i));
        // }
    }
}