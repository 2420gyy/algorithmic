package com.chen.demo01;

public class 插入排序 {

    /**
     * 1. 算法时间复杂度和数据情况是有关系的
     * 2. p1 1:27:20 中间一点点优化。。。
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = {3,2,5,4,2,3,3,1};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if(arr[j]<arr[j-1]){
                    swap(arr,j,j-1);
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }

    public static void swap(int[] arr,int a,int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }

}
