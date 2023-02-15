package com.chen.算法随想录卡尔.数组;

/**
 * @Author: chenchen
 * @CreateTime: 2022-07-22  15:42
 * @Description: 滑动窗口
 */
public class _209长度最小的子数组 {
    public static void main(String[] args) {
        int target = 7;
        int nums[] = {2,3,1,2,4,3};
        int sum =0,i=0,subL=0; // 滑动窗口的长度
        int result=Integer.MAX_VALUE;
        for(int j = 0;j<nums.length;j++){
            sum+=nums[j];
            // 注意这里使用while，每次更新 i（起始位置），并不断比较子序列是否符合条件
            while(sum>=target){
                subL = j-i+1; // 取子序列的长度
                result = result > subL?subL:result;
                sum -= nums[i++]; // 这里体现出滑动窗口的精髓之处，不断变更i（子序列的起始位置）
            }
        }
        System.out.println(result);
//        return result == Integer.MAX_VALUE ? 0 : result;
    }
}
