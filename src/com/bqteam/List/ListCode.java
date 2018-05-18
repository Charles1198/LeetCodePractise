package com.bqteam.List;

public class ListCode {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int i = 0;
        while (i < len - 1) {
            if (nums[i] == nums[i + 1]) {
                for (int j = i + 1; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1];
                }
                len--;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            System.out.print(nums[j]);
        }
        return len;
    }
}
