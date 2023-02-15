package com.chen.demo01;

public class 位运算异或补充 {

    /**
     * 1.一种数出现奇数次，其他数出现偶数次
     * 注意： 0^b = b !!!
     */
    public static void main(String[] args) {
        int arr1[] = {1,1,2,2,2,3,3};
        int res1 = 0;
        for (int i : arr1) {
            res1 = i ^ res1;
        }
        System.out.println(res1);
        System.out.println("=================");

        /**
         * 2.两种数出现奇数次，其他数出现偶数次
         *
         */
        int arr2[] = {1,1,2,2,2,3,3,4,4,4};
        int eor = 0;
        for (int i : arr2) {
            eor ^= i;
        }
        // eor = a ^ b; 2^4
        // eor != 0; （1^0 结果为1）
        // eor 必然有一位上为1
        int rightOne = eor & (~eor + 1); // 提取出最右侧的1 常规操作。。。

        int onlyOne = 0; // a 或者 b
        for (int i : arr2) {
            // 两边取一边（某一位为1和某一位为0的）
            if((i & rightOne) == 0){
                onlyOne ^= i;
            }
        }
        System.out.println(onlyOne + " " + (onlyOne ^ eor));


    }



}
