package Leetcode探索.数组.java;

public class DominantIndex {
    
    public static int dominantIndex(int[] nums) {
        // 查找最大值
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i ++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println("max" + maxIndex);
        // 检查最大值是否大于其他元素的两倍
        int max = nums[maxIndex];
        nums[maxIndex] = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]*2 > max) {
                return -1;
            }
        }

        return maxIndex;
    }


    public static void main(String[] args) {
        int[] nums1 = {3, 6, 1, 0};
        int[] nums2 = {1, 2, 3, 4};
        System.out.println(dominantIndex(nums1));
        System.out.println(dominantIndex(nums2));
    }
}