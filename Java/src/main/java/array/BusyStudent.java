package main.java.array;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BusyStudent {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for ( int i = 0; i < startTime.length; i++) {
            if (queryTime >= startTime[i] && queryTime <= endTime[i]) {
                count++;
            }
        }
        return count;
    }

    @Test
    public void test() {
        assertEquals(1, busyStudent(new int[] {1, 2, 3}, new int[] {3, 2, 7}, 4));
    }
}
