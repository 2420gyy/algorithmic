package com.chen.bookDemo.leetcode;

public class 使用最小花费爬楼梯_746 {
    public static void main(String[] args) {

        /**
         * 给你一个整数数组 cost ，其中 cost[i] 是从楼梯第 i 个台阶向上爬需要支付的费用。
         * 一旦你支付此费用，即可选择向上爬一个或者两个台阶。
         *
         * 你可以选择从下标为 0 或下标为 1 的台阶开始爬楼梯。
         *
         * 请你计算并返回达到楼梯顶部的最低花费。
         */
        /**
         * dp[i] 是爬到第i层的花费
         * dp[i] = min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2])
         *  前面的花费+再往上走一层需要的花费
         *
         * 初始化：往上跳才需要花费，所以一开始站在那个地方为0
         */

        int dp[] = new int[1000];
        int cost[] = new int[]{10,15,20};
        dp[0] = 0;
        dp[1] = 0;
        for (int i = 2; i <= cost.length; i++) {
            dp[i] = min(dp[i-1]+cost[i-1],dp[i-2]+cost[i-2]);
        }
        System.out.println("dp[i] = " + dp[cost.length]);

    }

    private static int min(int a, int b) {
        if(a>b){
            return b;
        }else{
            return a;
        }
    }
}
