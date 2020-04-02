package Leetcode题库;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] sol = new int[2];
        for (int i = 0; i < nums.length; i ++) {
            for (int j = 0; j < nums.length; j++) {
                if ( (i != j) && (nums[i] + nums[j]) == target) {
                    System.out.println(nums[i] + " " + nums[j] + " " + target);
                    sol[0] = i;
                    sol[1] = j;
                    return sol;
                }
            }
        }
        return sol;
    }

    public static void main(String[] args) {
        TwoSum ts = new TwoSum();

//        int target = 9;
//        int[] array = new int[4];
//        array[0] = 2;
//        array[1] = 7;
//        array[2] = 11;
//        array[3] = 15;

//        int target = 6;
//        int[] array = new int[2];
//        array[0] = 3;
//        array[1] = 3;

        int target = 6;
        int[] array = new int[3];
        array[0] = 3;
        array[1] = 2;
        array[2] = 4;
        System.out.println(ts.twoSum(array, target)[0] + " " + ts.twoSum(array, target)[1]);
    }
}

