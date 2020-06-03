package main.java.array;
// passed
public class FindOrInsert {
    public int searchInsert(int[] nums, int target) {
        if (target <= nums[0]) {
            return 0;
        }
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] <= target && nums[i+1] >= target) {
                if (nums[i] == target) {
                    return i;
                } else if (nums[i+1] == target) {
                    return i+1;
                } else {
                    return i+ 1;
                }
            }
        }
        return nums.length;
    }
}
