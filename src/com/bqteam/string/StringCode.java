package com.bqteam.string;

import java.util.Arrays;

public class StringCode {
    public String reverseString(String s) {
        char[] char1 = s.toCharArray();
        int l = char1.length;
        char[] char2 = new char[l];
        for (int i = 0; i < l; i++) {
            char2[i] = char1[l - i - 1];
        }
        return String.valueOf(char2);
    }
}
