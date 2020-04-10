// Question 2~3 
// Still got some issue about indexOutOfBound, sorry, this is the best I can do in 30 mins
public class Deduplicate {

    public static int[] deduplicate (int[] nums) {
        int[] result = new int[nums.length];
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            boolean duplicatedi = false;
            for (int j = 0; j < i; j++) {
                if (result[j] == nums[i]) {
                    // Duplicated
                    duplicatedi = true;
                }
            }
            if (!duplicatedi) {
                result[i] = nums[i];
            }
        }
        return null;
    }
    public static void main (String[] args) {
        int[] nums = deduplicate(new int[]{1, 3, 3, 2, 5, 8, 2, 1, 9});
        for(int i = 0; i < 9; i++){
            System.out.println(nums[i]);
        }

    }
}