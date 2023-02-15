package com.chen.bookDemo.leetcode;

public class 爬楼梯_70 {
    static int[] dp = new int[1000];

    public static void main(String[] args) {

        /**
         * 问有多少种方法，不是问步骤的！
         *
         * f(n) = f(n-1) + f(n-2)
         * 第n个台阶只能从第n-1或者n-2个上来。
         * 到第n-1个台阶的走法 + 第n-2个台阶的走法 = 到第n个台阶的走法，
         * 已经知道了第1个和第2个台阶的走法，一路加上去。
         */
        /**
         * dp[i] 到达i阶有dp[i]种方法
         * dp[1] = 1;dp[2] = 2; 这样初始化才有意义，符合题境
         */
        int n =5;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println("dp = " + dp[n]);



    }
}
