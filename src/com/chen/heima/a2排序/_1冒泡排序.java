package com.chen.heima.a2排序;

/**
 * 2022/10/13 0:12
 **/
public class _1冒泡排序 {

    /**
     * 思想：两两比较把最大的值放到最后面
     *
     *
     */

    public static void main(String[] args) {
        int[] a = {4,5,6,3,2,1};
        // 冒泡从小到大排序
        for (int i = a.length-1; i>0;i--){
            for (int j = 0; j<i; j++){
                if(a[j]>a[j+1]){
                    // 交换 j 和 j+1 的位置
                    int s = a[j];
                    a[j] = a[j+1];
                    a[j+1] = s;
                }
            }
        }
        for (int i : a) {
            System.out.print(i);
        }
    }
}
