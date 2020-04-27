package main.java.math;

public class NumberOfSteps {
    public int numberOfSteps (int num) {
        int step = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                step++;
            } else {
                num--;
                step++;
            }
        }
        return step;
    }
}
