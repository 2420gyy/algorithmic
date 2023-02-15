package com.chen.demo01;

/**
 * @Author: chenchen
 * @CreateTime: 2022-07-15  16:05
 * @Description: arr 无序，相邻数一定不相等
 */
public class 二分局部最小值{
    public static void main(String[] args) {
        // 看0位置是不是最小，再看n-1是不是局部最小，否则0到n-1必存在局部最小
        // 取中点m，如果不存在m-1>m<m+1;否则假设m比m-1大，0到m位置必存在局部最小
        int[] arr={7,5,4,8,6,2,1,3,9};
        System.out.println(minLocal(arr));
    }

    public static int minLocal(int []arr){
        if (arr == null || arr.length == 0) {
            return -1;
        }
        if (arr.length == 1 || arr[0] < arr[1]) {
            return arr[0];
        }
        if(arr[arr.length-1]<arr[arr.length-2]){
            return arr[arr.length-1];
        }
        int left = 0;
        int right = arr.length-1;
        int mid = 0;
        while (left < right){
            mid = left+(right-left)/2;
//            if(arr[mid]<arr[mid+1] && arr[mid]<arr[mid-1]){
//                return arr[mid];
//            }
            if(arr[mid]>arr[mid-1]){
                right = mid - 1;
            }else if(arr[mid]>arr[mid+1]){
                left = mid + 1;
            }else {
                return arr[mid];
            }
        }
        return left;
    }

}
