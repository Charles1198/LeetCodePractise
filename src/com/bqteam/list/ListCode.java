package com.bqteam.list;

import com.bqteam.Util;

import java.util.*;

public class ListCode {

    /**
     * 从排序数组中删除重复项
     *
     * @param nums
     * @return
     */
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

    /**
     * 买卖股票的最佳时机 II
     *
     * @param prices
     * @return
     */
    public int maxProfit(int[] prices) {
        int profit = 0;

        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i] < prices[i + 1]) {
                profit += prices[i + 1] - prices[i];
            }
        }

        return profit;
    }

    /**
     * 旋转数组
     *
     * @param nums
     * @param k
     */
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        if (l <= 1) {
            return;
        }

        for (int i = 0; i < k; i++) {
            rotate(nums);
        }
    }

    private void rotate(int[] nums) {
        int l = nums.length;
        int empty = nums[l - 1];
        for (int i = l - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = empty;
    }

    public boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> resList = new ArrayList<>();

        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    resList.add(nums1[i]);
                    break;
                }
            }
        }

        int[] res = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

    public int[] plusOne(int[] digits) {
        long num = 0;
        for (int i = 0; i < digits.length; i++) {
            num += digits[i] * (long) Math.pow(10, digits.length - i - 1);
        }
        num++;

        String numString = String.valueOf(num);
        char[] numChar = numString.toCharArray();
        int[] res = new int[numChar.length];
        for (int i = 0; i < numChar.length; i++) {
            String n = String.valueOf(numChar[i]);
            res[i] = Integer.valueOf(n);
        }
        return res;
    }

    public void moveZeroes(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums.length - 1; j > i; j--) {
                if (nums[j - 1] == 0 && nums[j] != 0) {
                    Util.swap(nums, j - 1, j);
                }
            }
        }
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }

    public boolean isValidSudoku(char[][] board) {
        Set<String> targetSet = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            targetSet.clear();
            for (int j = 0; j < 9; j++) {
                String s = String.valueOf(board[i][j]);
                if (!s.equals(".")) {
                    if (targetSet.contains(s)) {
                        return false;
                    }
                    targetSet.add(s);
                }
            }
        }

        for (int i = 0; i < 9; i++) {
            targetSet.clear();
            for (int j = 0; j < 9; j++) {
                String s = String.valueOf(board[j][i]);
                if (!s.equals(".")) {
                    if (targetSet.contains(s)) {
                        return false;
                    }
                    targetSet.add(s);
                }
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                targetSet.clear();
                for (int k = i * 3; k < i * 3 + 3; k++) {
                    for (int l = j * 3; l < j * 3 + 3; l++) {
                        String s = String.valueOf(board[k][l]);
                        if (!s.equals(".")) {
                            if (targetSet.contains(s)) {
                                return false;
                            }
                            targetSet.add(s);
                        }
                    }
                }
            }
        }

        return true;
    }

    public void rotate(int[][] matrix) {
        if (matrix.length == 1) {
            return;
        }
        if (matrix.length != matrix[0].length) {
            return;
        }

        int n = matrix.length;
        int[][] matrix2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix2[j][i] = matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = matrix2[i][n - j - 1];
            }
        }
    }
}
