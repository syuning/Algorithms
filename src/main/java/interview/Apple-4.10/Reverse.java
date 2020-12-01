
// Question 1
public class Reverse {

    public static int[] reverse (int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums.length - 1 - i];
        }
        return result;
    }
}