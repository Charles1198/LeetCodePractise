package com.bqteam.List;

import com.bqteam.Main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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

    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }

        return profit;
    }

    public void rotate(int[] nums, int k) {
        int l = nums.length;
        if (l <= 1) {
            return;
        }

   


//        for (int i = 0; i < k; i++) {
//            int temp = nums[1];
//            for (int j = 1 + l; j > 2; j--) {
//                nums[j % l] = nums[(j - 1) % l];
//            }
//            nums[2 % l] = temp;
//        }

//        for (int i = l - 1; i > 0; i--) {
//
//            if (i - k >= 0) {
//                swap(nums, i, (i - k));
//            } else {
//                swap(nums, i, (i - k) + l);
//            }
//
//        }
    }

    private void swap(int[] s, int a, int b) {
        int temp = s[a];
        s[a] = s[b];
        s[b] = temp;
    }
}
