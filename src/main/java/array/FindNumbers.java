package main.java.array;

public class FindNumbers {
    public int findNumbers(int[] nums) {
        int numOfEvenDigit = 0;
        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0) {
                numOfEvenDigit++;
            }
        }
        return numOfEvenDigit;
    }
}
