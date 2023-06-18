package test.java.array;
import main.java.array.FindOrInsert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindOrInsertTest {
    @Test
    public void test1() {
        FindOrInsert findOrInstert = new FindOrInsert();
        int [] nums = {1, 3, 5, 6};
        assertEquals(2, findOrInstert.searchInsert(nums, 5));
        assertEquals(1, findOrInstert.searchInsert(nums, 2));
        assertEquals(4, findOrInstert.searchInsert(nums, 7));
        assertEquals(0, findOrInstert.searchInsert(nums, 0));
    }

    @Test
    public void test2() {
        FindOrInsert findOrInstert = new FindOrInsert();
        int [] nums = {1};
        assertEquals(0, findOrInstert.searchInsert(nums, 1));
    }
}
