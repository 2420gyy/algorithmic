package com.chen.bookDemo.leetcode;

public class 整数拆分_343 {

    public static void main(String[] args) {

        int n = 8;
        int num = 0;
//        extracted(n, num);




    }

    /**
     * 可以用数学方法，但是有点复杂。。。
     * https://leetcode.cn/problems/integer-break/solutions/352875/zheng-shu-chai-fen-by-leetcode-solution/
     * @param n
     * @param num
     */
    private static void extracted(int n, int num) {
        for (int i = n; i >= 2 ; i--) {
            int res = result(n,i);
            num = max(num,res);
        }
        System.out.println(num);
    }

    private static int result(int n, int i) {
        // 把n进行i等分相乘
        // TODO 等分就不对 4*4<3*6
        // 应该将给定的正整数拆分成尽可能多的 3
        int res = 1;
        int num = n/i;
        if(n%i == 1){
            // 除不尽
            for (int j = 0; j < i-1; j++) {
                res*=num;
            }
            res*=(num+1);
        }else {
            for (int j = 0; j < i; j++) {
                res*=num;
            }
        }
        return res;
    }
    private static int max(int num, int res) {
        // 取大值
        return num > res?num:res;
    }
}
