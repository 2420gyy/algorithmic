package com.chen.bookDemo.leetcode;

public class 不同路径_62 {

    public static void main(String[] args) {

        /**
         * dp[i][j] 从(0,0)位置到(i,j)位置有多少种走法
         * dp[i][j] = dp[i][j-1] + dp[i-1][j]
         *
         *
         *
         */
        /**
         * 用一个一维数组（也可以理解是滚动数组）就可以了，但是不利于理解
         *
         */
        /**
         * 机器人一定会走m+n-2步，即从m+n-2中挑出m-1步向下走不就行了
         * dp(m+n-2，min(m-1,n-1));
         */


        int[][] dp = new int[100][100];
        int m = 3,n = 3;

        dp[0][1] = 1;
        dp[1][0] = 1;

        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
            dp[0][i] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i][j-1] + dp[i-1][j];
            }

        }

        System.out.println(dp[m-1][n-1]);

    }
}
