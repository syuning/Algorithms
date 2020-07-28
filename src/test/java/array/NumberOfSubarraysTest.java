package test.java.array;
import main.java.array.NumberOfSubarrays;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberOfSubarraysTest {

    @Test
    public void testNumOfSub1() {
        NumberOfSubarrays numberOfSubarrays = new NumberOfSubarrays();
        int [] nums = {1, 1, 2, 1, 1};
        assertEquals(2, numberOfSubarrays.numberOfSubarrays(nums, 3));
    }

    @Test
    public void testNumOfSub2() {
        NumberOfSubarrays numberOfSubarrays = new NumberOfSubarrays();
        int [] nums = {2, 4, 6};
        assertEquals(0, numberOfSubarrays.numberOfSubarrays(nums, 1));
    }

    @Test
    public void testNumOfSub3() {
        NumberOfSubarrays numberOfSubarrays = new NumberOfSubarrays();
        int [] nums = {2, 2, 2, 1, 2, 2, 1, 2, 2, 2};
        assertEquals(16, numberOfSubarrays.numberOfSubarrays(nums, 2));
    }
}
