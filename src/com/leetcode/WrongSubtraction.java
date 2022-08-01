package com.leetcode;

import java.util.Scanner;

public class WrongSubtraction {
    public void wrongSubtraction() {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        for (int i = 0; i < y; i++) {
            if (x % 10 == 0) {
                x = x / 10;

            } else {
                x = x - 1;
            }
        }
        System.out.println(x);
    }
}
