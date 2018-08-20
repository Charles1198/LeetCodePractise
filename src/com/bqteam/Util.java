package com.bqteam;

public class Util {
    public static void swap(int[]array, int index1, int index2) {
        int empty = array[index1];
        array[index1] = array[index2];
        array[index2] = empty;
    }
}
