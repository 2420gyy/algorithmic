package com.chen.bookDemo.leetcode;

public class 不同路径2_63 {

    /**
     * 加上了障碍物
     *
     * 我的问题：
     *  1. 二维数组的初始化
     *  2. 二维数组的长和宽
     *  3. 行和列的区分
     *  打印dp数组的值
     *
     * @param args
     */

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0,1},{0,0}};
        // m是行（第一层的元素有几个就是几行） n是列 （第一个元素{0,0,0}的长度不就是列吗）
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp =new int[m][n];

        // 列
        for (int i = 0; i < m && obstacleGrid[i][0] == 0; i++) {
            dp[i][0] = 1;
        }
        // 行
        for (int j = 0; j < n && obstacleGrid[0][j] == 0; j++) {
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if(obstacleGrid[i][j] == 0){
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }

        }

        System.out.println(dp[m-1][n-1]);
    }
}
