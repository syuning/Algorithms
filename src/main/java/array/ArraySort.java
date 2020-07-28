package main.java.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ArraySort {

    @Test
    public void testSort() {
        int[] arr = {2, 8, 13, 11, 6, 7};
        // 数组正序（排序）
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public int[] shuffle(int[] nums, int n) {
        int [] nums1 = Arrays.copyOfRange(nums, 0, n);
        int [] nums2 = Arrays.copyOfRange(nums, n, n*2);
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));
        for (int i = 0; i < n*2; i+=2) {
            nums[i] = nums1[i/2];
            nums[i+1] = nums2[i/2];
        }
        return nums;
    }

    @Test
    public void testShuffle(){
        int[] arr1 = {2,5,1,3,4,7};
//        Assert.assertEquals(true, shuffle(arr, 3).equals(new int[]{2,3,5,4,1,7}));
        System.out.println(Arrays.toString(shuffle(arr1, 3)));

        int[] arr2 = {1,2,3,4,4,3,2,1};
        System.out.println(Arrays.toString(shuffle(arr2, 4)));

        int[] arr3 = {1,1,2,2};
        System.out.println(Arrays.toString(shuffle(arr3, 2)));
    }

    public boolean canBeEqual(int[] target, int[] arr) {
        // 检查两个数组的元素是否相同
        Arrays.sort(target);
        Arrays.sort(arr);
        System.out.println(Arrays.hashCode(target));
        System.out.println(Arrays.hashCode(arr));
        return Arrays.hashCode(target) == Arrays.hashCode(arr);
    }

    @Test
    public void testCanBeEqual () {
        System.out.println(canBeEqual(new int[] {1,2,3,4}, new int[] {2,4,1,3}));
//        Assert.assertTrue(canBeEqual(new int[] {1,2,3,4}, new int[] {2,4,1,3}));
    }

    public int xorOperation(int n, int start) {
        int xor = start + 2*0;
        for (int i = 1; i < n; i++){
            xor^=(start + 2*i);
        }
        return xor;
    }

    @Test
    public void testXorOperation() {
        Assert.assertEquals(8, xorOperation(5, 0));
    }

    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i=i+2) {
            sum+=nums[i];
        }
        return sum;
    }

    @Test
    public void testArrayPairSum() {
        System.out.println(arrayPairSum(new int[] {1, 4, 3, 2}));
    }

    public int[] sortArrayByParity(int[] A) {
        String nums = "";
        for (int i = 0; i < A.length; i++){
            if (A[i] % 2 == 0) {
                nums = A[i] + "," + nums;
            } else {
               nums = nums + A[i] + ",";
            }
        }
        String[] numString = nums.split(",");
        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(numString[i]);
        }
        return A;
    }

    @Test
    public void testSortArrayByParity() {
        System.out.println(Arrays.toString(sortArrayByParity(new int[] {1,2,4,3,8,10})));
    }

    public void rotate1(int[] nums, int k) {
        for(int i = 0; i < k; i++) {
            int tail = nums[nums.length-1];
            for (int j = nums.length-1; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = tail;
//            System.out.println(Arrays.toString(nums));
        }
    }

    @Test
    public void testRotate1() {
        int[] nums1 = new int[] {1,2,3,4,5,6,7};
        rotate1(nums1, 3);
        System.out.println(Arrays.toString(nums1));

        int[] nums2 = new int[] {-1,-100,3,99};
        rotate1(nums2, 2);
        System.out.println(Arrays.toString(nums2));
    }

    public int minArray(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i+1] >= numbers[i]) {
                continue;
            }else{
                min = numbers[i+1];
                break;
            }
        }
        return min;
    }

    @Test
    public void testMinArray() {
        System.out.println(minArray(new int[] {3, 4, 5, 1, 2}));
        System.out.println(minArray(new int[] {2, 2, 2, 0, 1}));
        System.out.println(minArray(new int[] {1, 3, 5}));
    }

    public int minTimeToVisitAllPoints(int[][] points) {
        int distance = 0;
        for(int i = 0; i < points.length - 1; i++){
            int x = Math.abs(points[i+1][0] - points[i][0]);
            int y = Math.abs(points[i+1][1] - points[i][1]);
            System.out.println(x);
            System.out.println(y);
            if (x > y) {
                distance += x;
            } else {
                distance += y;
            }
        }
        return distance;
    }

    @Test
    public void testMinTimeToVisitAllPoints() {
        System.out.println(minTimeToVisitAllPoints(new int[][] {{1,1}, {3,4}, {-1,0}}));
    }

    public int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

    @Test
    public void testRunningSum() {
        System.out.println(Arrays.toString(runningSum(new int[] {1,2,3,4})));
        System.out.println(Arrays.toString(runningSum(new int[] {1,1,1,1,1})));
        System.out.println(Arrays.toString(runningSum(new int[] {3,1,2,10,1})));
    }

    public int numIdenticalPairs(int[] nums) {
        int numOfIP = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    numOfIP++;
                }
            }
        }
        return numOfIP;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public int getDecimalValue(ListNode head) {
        // 执行用时： 2 ms , 在所有 Java 提交中击败了 5.43% 的用户
        // 内存消耗： 37.3 MB , 在所有 Java 提交中击败了 5.00% 的用户
        String binaryString = String.valueOf(head.val);
        while(head.next != null) {
            binaryString += String.valueOf(head.next.val);
            head = head.next;
        }
        return Integer.parseInt(binaryString, 2);
    }

    @Test
    public void testGetDecimalValue() {
        System.out.println(Integer.parseInt("1", 2));
    }

}
