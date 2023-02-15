package com.chen.demo01;

public class 冒泡排序 {

    public static void main(String[] args) {
        int arr[] = new int[]{2,7,5,3,4,5,8,6,9};
        int[] ints = maoPao(arr);
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }

    public static int[] maoPao(int[] arr){
        // 从小到大排序
        for (int i = arr.length-1; i > 0 ; i--) {
            for (int j = 0; j < i; j++) {
                // !!!
                if(arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
            }
        }
        return arr;
    }

    public static void swap(int[] arr,int a,int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }


}
