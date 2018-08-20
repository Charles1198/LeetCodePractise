package com.bqteam.string;

import java.util.ArrayList;
import java.util.List;

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

    public int reverse(int x) {
        if (x == 0) {
            return x;
        }
        if (x > 0) {
            String xString = String.valueOf(x);
            String xStringReverse = reverseString(xString);
            long xReverse = Long.valueOf(xStringReverse);
            if (xReverse > 2147483647) {
                return 0;
            }
            return (int) xReverse;
        }

        long y = 0 - (long)x;
        String yString = String.valueOf(y);
        String yStringReverse = reverseString(yString);
        long yReverse = Long.valueOf(yStringReverse);
        if (yReverse > 2147483647) {
            return 0;
        }
        return (int) (0 - yReverse);
    }

    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        for (char c: chars) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return s.indexOf(c);
            }
        }
        return -1;
    }
}
