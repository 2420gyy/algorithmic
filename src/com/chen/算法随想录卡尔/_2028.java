package com.chen.算法随想录卡尔;

import java.util.Arrays;

/**
 * 2022/10/25 23:19
 **/
public class _2028 {
    public static void main(String[] args) {
        int[] rolls = {4,5,6,2,3,6,5,4,6,4,5,1,6,3,1,4,5,5,3,2,3,5,3,2,1,5,4,3,5,1,5};
        int mean = 4,n = 40;
        int rollsTotal = Arrays.stream(rolls).sum();
        if((rollsTotal + n*6) < mean*(n+rolls.length)){
            return;
        }
        if((rollsTotal + n*1) > mean*(n+rolls.length)){
            return;
        }
        int nTotal = 0;
        nTotal=  mean * (rolls.length+n) - rollsTotal;
        // 一个数组,n位长度,范围是1到6,和为nTotal
        int[] nRolls = new int[n];
        // 16 余数大于6了！
        int base = nTotal/n;

        int base1 = 6;
        for (int i = 1; i < n; i++) {
            nRolls[i] += base;
        }
        nRolls[0] = nTotal - base*(n-1);
        if((nTotal - base*n)>6){
            // 需要其他值消化
            int oth = (nTotal - base*(n-1)) - base1;
            for (int i = 1; i <= oth; i++) {
                nRolls[i]++;
            }
            nRolls[0] = 6;
        }

        for (int nRoll : nRolls) {
            System.out.print(nRoll+" ");
        }
    }
}
