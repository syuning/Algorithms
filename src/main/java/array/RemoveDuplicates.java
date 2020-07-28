package main.java.array;

class RemoveDuplicates {

    // 标准答案
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }

        for (int a = 0; a < i + 1; a++) {
            System.out.print(nums[a] + " ");
        }
        System.out.println();

        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 4};
        System.out.println(removeDuplicates(nums));
    }
}