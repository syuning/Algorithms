package main.java.array;

public class PivotNum {
    public static int pivotIndex(int[] nums) {
        int pivotIndex;
        for ( pivotIndex = 0; pivotIndex < nums.length; pivotIndex ++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < pivotIndex; i ++) {
                leftSum += nums[i];
            }

            for (int j = pivotIndex + 1; j < nums.length; j++) {
                rightSum += nums[j];
            }
            if (leftSum == rightSum) {
                return pivotIndex;
            }
            System.out.println(leftSum == rightSum);
            System.out.println(pivotIndex + ", " + leftSum + ", " + rightSum);
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] nums1 = {1,7,3,6,5,6};
        int[] nums2 = {-1,-1,-1,0,1,1};
        System.out.println(pivotIndex(nums1));
        System.out.println(pivotIndex(nums2));
    }
}