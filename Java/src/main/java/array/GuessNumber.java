package main.java.array;

public class GuessNumber {
    public int game(int[] guess, int[] answer) {
        int correct = 0;
        if (guess[0] == answer[0]) {
            correct++;
        }
        if (guess[1] == answer[1]) {
            correct++;
        }
        if (guess[2] == answer[2]) {
            correct++;
        }

        return correct;
    }
}
