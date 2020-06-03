package main.java.array;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

// passed
public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = candies[0];
        if (candies.length > 1) {
            for (int i = 0; i < candies.length; i++) {
                if (candies[i] > max) {
                    max = candies[i];
                }
            }
        }
        List<Boolean> result = new ArrayList<>();
        for ( int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max ) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }

    @Test
    public void test2() {
        int [] candies = {4, 2, 1, 1, 2};
        int extraCandies = 1;
        List<Boolean> expected = new ArrayList<>();
        expected.add(true);
        expected.add(false);
        expected.add(false);
        expected.add(false);
        expected.add(false);
        assertEquals(expected, kidsWithCandies(candies, extraCandies));
    }
}
