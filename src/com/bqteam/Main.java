package com.bqteam;

import com.bqteam.List.ListCode;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ListCode listCode = new ListCode();

//        int[] removeDuplicatesTestList = new int[]{1, 1, 2, 2, 2, 3, 4, 4, 4};
//        listCode.removeDuplicates(removeDuplicatesTestList);
//
//        int[] maxProfitTestList = new int[]{1, 2, 3, 4, 5};
//        listCode.maxProfit(maxProfitTestList);

        int[] rotateTestList = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        println(rotateTestList);
        listCode.rotate(rotateTestList, 2);
        println(rotateTestList);
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
}
