package main.java.math;

public class SubtractProductAndSum {
    public int subtractProductAndSum(int n) {
        String s = String.valueOf(n);
        int sum = 0;
        int product = 1;
        for (int i = 0; i < s.length(); i ++) {
            sum += (s.charAt(i) - 48);
            product *= (s.charAt(i) - 48);
        }
        return product - sum;
    }
}
