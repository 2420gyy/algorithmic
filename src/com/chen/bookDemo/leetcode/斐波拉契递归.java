package com.chen.bookDemo.leetcode;

/**
 * 2022/10/7 22:18
 **/
public class 斐波拉契递归 {

    public static void main(String[] args) {

        /**
         * 1 1 2 3 5 8
         * 1. dp[i] 第i个斐波那契数的值
         * 2. dp[i] = dp[i-1] + dp[i-2]
         * 3. 数组的初始化 dp[0] = 1 dp[1] = 1
         * 4. 遍历顺序 前到后
         * 5. 打印dp数组
         *
         */

        int n = 5;

        int dp[] = new int[1000];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[n]);

        // 状态转移
        int sum = 0;
        for (int i = 2; i <= n; i++) {
            sum = dp[0] + dp[1];
            dp[0] = dp[1];
            dp[1] = sum;
        }
        System.out.println(sum);

    }

}
