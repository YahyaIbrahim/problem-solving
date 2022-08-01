package com.leetcode;

import java.util.Scanner;

public class EvenOdds {
    public void evenOdds() {
        Scanner in = new Scanner(System.in);
        long x = in.nextLong();
        long y = in.nextLong();
        if (y <= ((x + 1) / 2))
            System.out.println(y * 2 - 1);
        else
            System.out.println((y - (x + 1) / 2) * 2);

    }
}
