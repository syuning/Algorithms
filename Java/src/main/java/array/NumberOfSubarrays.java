package main.java.array;

public class NumberOfSubarrays {
    public int numberOfSubarrays(int[] nums, int k) {
        int numOfNice = 0;
        if (k > 0 && k < nums.length) {
            int lengthOfSub = k;
            while (lengthOfSub < nums.length) {
                for (int i = 0; i < nums.length - lengthOfSub + 1; i++) {
                    int numOfOdd = 0;
                    for (int j = i; j < lengthOfSub + i; j++) {
                        if (nums[j] % 2 == 1) {
                            numOfOdd++;
                        }
                    }
                    if (numOfOdd >= k) {
                        System.out.println("数组长度为：" + lengthOfSub + "，从第" + i + "项开始" );
                        numOfNice++;
                    }
                }
                lengthOfSub++;
            }
        }
        return numOfNice;
    }

}
