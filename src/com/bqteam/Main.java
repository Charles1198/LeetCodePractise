package com.bqteam;

import com.bqteam.list.ListCode;
import com.bqteam.string.StringCode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        ListCode listCode = new ListCode();

//        int[] removeDuplicatesTestList = new int[]{1, 1, 2, 2, 2, 3, 4, 4, 4};
//        listCode.removeDuplicates(removeDuplicatesTestList);
//
//        int[] maxProfitTestList = new int[]{1, 2, 3, 4, 5};
//        listCode.maxProfit(maxProfitTestList);

//        int[] rotateTestList = new int[]{-1,-100,3,99};
//        listCode.rotate(rotateTestList, 2);

//        int[] containsDuplicateTestList = new int[]{1, 2, 3, 1};
//        print(listCode.containsDuplicate(containsDuplicateTestList));

//        int[] intersectTestList1 = new int[]{1, 2, 2, 1};
//        int[] intersectTestList2 = new int[]{1, 1};
//        println(listCode.intersect(intersectTestList1, intersectTestList2));

//        println(listCode.plusOne(new int[]{9,8,7,6,5,4,3,2,1,0}));

//        int[] moveZeroesTestList = new int[]{0, 1, 0, 3, 12};
//        listCode.moveZeroes(moveZeroesTestList);
//        println(moveZeroesTestList);

//        int[] twoSumTestList = new int[]{2, 7, 11, 15};
//        println(listCode.twoSum(twoSumTestList, 9));

//        char[][] isValidSudokuTestList = new char[][]{
//                {"5".charAt(0), "3".charAt(0), ".".charAt(0), ".".charAt(0), "7".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0)},
//                {"6".charAt(0), ".".charAt(0), ".".charAt(0), "1".charAt(0), "9".charAt(0), "5".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0)},
//                {".".charAt(0), "9".charAt(0), "8".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), "6".charAt(0), ".".charAt(0)},
//                {"8".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), "6".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), "3".charAt(0)},
//                {"4".charAt(0), ".".charAt(0), ".".charAt(0), "8".charAt(0), ".".charAt(0), "3".charAt(0), ".".charAt(0), ".".charAt(0), "1".charAt(0)},
//                {"7".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), "2".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), "6".charAt(0)},
//                {".".charAt(0), "6".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), "2".charAt(0), "8".charAt(0), ".".charAt(0)},
//                {".".charAt(0), ".".charAt(0), ".".charAt(0), "4".charAt(0), "1".charAt(0), "9".charAt(0), ".".charAt(0), ".".charAt(0), "5".charAt(0)},
//                {".".charAt(0), ".".charAt(0), ".".charAt(0), ".".charAt(0), "8".charAt(0), ".".charAt(0), ".".charAt(0), "7".charAt(0), "9".charAt(0)}
//        };
//        print(listCode.isValidSudoku(isValidSudokuTestList));

//        int[][] isValidSudokuTestList = new int[][]{
//                {5, 1, 9, 11},
//                {2, 4, 8, 10},
//                {13, 3, 6, 7},
//                {15, 14, 12, 16}
//        };
//        listCode.rotate(isValidSudokuTestList);
//        println(isValidSudokuTestList);

        StringCode stringCode = new StringCode();

//        print(stringCode.reverseString("A man, a plan, a canal: Panama"));

//        print(stringCode.reverse(-2147483648));

        print(stringCode.firstUniqChar("loveleetcode"));


    }

    public static void print(Object o) {
        System.out.print(o);
    }

    public static void println(Object o) {
        System.out.println(o);
    }

    public static void println(int[] list) {
        System.out.println(Arrays.toString(list));
    }

    public static void println(int[][] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.println(Arrays.toString(list[i]));
        }
    }
}
