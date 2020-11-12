package main.java.array;

public class MaxProduct {
    public int maxProduct(int[] nums) {
        int max = 1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                int currentProduct = (nums[i] - 1)*(nums[j] -1 );
                if (i != j && currentProduct > max) {
                    max = currentProduct;
                }
            }
        }
        return max;
    }
}
