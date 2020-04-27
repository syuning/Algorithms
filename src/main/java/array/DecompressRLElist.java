package main.java.array;

import java.util.ArrayList;

public class DecompressRLElist {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> decprsdList = new ArrayList<>();
        for (int i = 0 ; i < nums.length - 1; i=i+2) {
            int count = nums[i];
            int value = nums[i+1];
            for (int j = 0; j < count; j++) {
                decprsdList.add(value);
            }
        }
        int[] decprsdArray = new int[decprsdList.size()];
        for (int i = 0; i < decprsdList.size(); i++) {
            decprsdArray[i] = decprsdList.get(i);
        }
        return decprsdArray;
    }
}
