package com.chen.demo01;

public class 选择排序 {

    /**
     * 选择排序：每次选择最小的值放到”第一位“
     * @param args
     */
    public static void main(String[] args) {
        int arr[] = new int[]{2,7,5,3,4,5,8,6,9};
        int[] ints = selectOption(arr);
        for (int anInt : ints) {
            System.out.print(anInt);
        }
    }

    private static int[] selectOption(int[] arr) {
        for (int i = 0; i < arr.length; i++) { // i ~ n-1 !!!
            int minIndex = i; // 一直都表示的是最小值的位置!!!
            for (int j = i; j < arr.length; j++) {
                minIndex = arr[minIndex] < arr[j] ? minIndex : j;
            }
            // 上方可以避免这种情况吗？
            if(minIndex!=i)
                swap2(arr,minIndex,i);
        }
        return arr;
    }

    public static void swap(int[] arr,int a,int b){
        int c = arr[a];
        arr[a] = arr[b];
        arr[b] = c;
    }

    /*
    异或 可以理解为无进位相加
     */
    public static void swap2(int[] arr,int a,int b){
        arr[a] = arr[a] ^ arr[b];
        arr[b] = arr[a] ^ arr[b];
        arr[a] = arr[a] ^ arr[b];
    }


}
