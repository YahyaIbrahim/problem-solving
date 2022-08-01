package com.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class RunningSumof1dArray {
    public int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            sum[i + 1] = sum[i] + nums[i + 1];
        }
        return sum;

    }

    public void run() {
        Scanner in = new Scanner(System.in);
        String[] n = in.next().replace("[", "").replace("]", "").split(",");
        int[] arr = new int[n.length];
        for (int i = 0; i < n.length; i++) {
            arr[i] = Integer.parseInt(n[i]);
        }
        System.out.println(Arrays.toString(runningSum(arr)));
    }

}
