package Leetcode探索.数组.java;

import java.math.BigInteger;

public class PlusOne {
    public static int[] plusOne(int[] digits) {
        String oldNumString = "";
        for (int i = 0; i < digits.length; i++) {
            oldNumString += digits[i];
        }
        System.out.println(oldNumString); 

        BigInteger oldNum = new BigInteger(oldNumString);
        BigInteger one = new BigInteger("1");

        String newNum = String.valueOf(oldNum.add(one));
        System.out.println("oldNum" + oldNum + " newNum" + newNum);
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