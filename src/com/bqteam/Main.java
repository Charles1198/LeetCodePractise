package com.bqteam;

import com.bqteam.List.ListCode;

public class Main {

    public static void main(String[] args) {
        int[] s = new int[]{0, 0, 1, 2, 3, 3, 3, 4, 4};

        ListCode listCode = new ListCode();
        listCode.removeDuplicates(s);
    }
}
