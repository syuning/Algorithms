package Leetcode探索.数组和字符串.java;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        long oldNum;;
        for (int i = 0; i < digits.length; i++) {
            System.out.println(digits[i] + " " + Math.pow(10, (digits.length - i - 1)));
            oldNum += (digits[i]) * Math.pow(10, (digits.length - i - 1));
        }
        String newNum = String.valueOf(oldNum + 1);
        System.out.println(oldNum + " " + newNum);
        int[] newDigits = new int[newNum.length()];

        for (int i = 0; i < newDigits.length; i++) {
            newDigits[i] = newNum.charAt(i) - 48;
        }

        return newDigits;
        
    }

    public static void main(String[] args) {
        // int[] nums1 = {1,2,3};
        // plusOne(nums1);

        // int[] nums2 = {4,3,2,1};
        // plusOne(nums2);

        // int[] nums3 = {8,9,9,9};
        // plusOne(nums3);

        // int[] nums4 = {9,8,7,6,5,4,3,2,1,0};
        // plusOne(nums4);

        int[] nums5 = {6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3};
        plusOne(nums5);

    }
}