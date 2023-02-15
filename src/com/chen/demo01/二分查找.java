package com.chen.demo01;

import java.util.Arrays;

public class 二分查找 {

    /*
    1. 用普通方法实现
    2. 递归的return 理解！！！
     */

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,8,9,10};

        boolean dichotomy = dichotomy(arr, 74);
        System.out.println(dichotomy);
    }

    /*
    1. 中位数 L+（R-L)/2
    2. 数组分割
     */
    public static boolean dichotomy(int arr[],int num){
        // 1. 从中间开始，大于这个数，找左边区间;重复
        int middle = arr.length%2==0 ? (arr.length)/2:arr.length/2;
        if(arr[middle] == num){
            return true;
        }else if(arr.length == 1 && arr[middle] != num){
            return false;
        }else if(arr[middle] > num){
            int arr1[] = Arrays.copyOfRange(arr,0,middle);
            return dichotomy(arr1,num);
        }else if(arr[middle] <= num){
            int arr2[] = Arrays.copyOfRange(arr,middle,arr.length);
            return dichotomy(arr2,num);
        }
        return false;
    }

}
