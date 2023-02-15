package com.chen.算法随想录卡尔.数组;

/**
 * @Author: chenchen
 * @CreateTime: 2022-07-22  14:58
 * @Description: [-4,-1,0,3,10] => [0,1,9,16,100]
 * 问题：有序，则思考数据的特殊性，最值一定出现在左右两边
 */
public class _977有序数组的平方 {
    public static void main(String[] args) {
//        int[] nums = {-7,-3,2,3,11};
        int[] nums = {-4,-1,0,3,10};
        int a[] = new int[nums.length];
        int left = 0;
        int right = nums.length-1;
        for(int i=nums.length-1;i>=0;i--){
            if(nums[right]*nums[right] > nums[left]*nums[left]){
                a[i] = nums[right]*nums[right];
                right--;
            }else{
                a[i] = nums[left]*nums[left];
                left++;
            }
        }
        for (int i : a) {
            System.out.print(i +" ");
        }
    }
}
