package com.chen.heima.a1算法分析;

/**
 * 2022/10/12 23:57
 **/
public class 对数阶 {
    public static void main(String[] args) {
        int i = 1,n = 100;
        // 假设x次后结束，时间复杂度x计算
        // 2*x = n -> x = log(n) 对数阶忽略底数
        while (i<n){
            i = i * 2;
        }
    }
}
