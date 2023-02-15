package com.chen.算法随想录卡尔.数组;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * @Author: chenchen
 * @CreateTime: 2022-07-22  17:29
 * @Description: TODO
 */
public class _54螺旋矩阵 {
    public static void main(String[] args) {
        int [][]matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        int m = matrix.length;
        int n = matrix[0].length;
        int i=0;
        int j=0;
        // 右下左上
        //遍历过的都令为233
        List<Integer> res = new ArrayList<>(m*n);
        int direction = 0;//0代表右，1代表下，2代表左，3代表上
        for(int cur = 0;cur<m*n;cur++){
            res.add(matrix[i][j]);
            matrix[i][j] = 233;
            //确定方向
            if(direction==0&&(j==n-1||matrix[i][j+1]==233)){//方向向右，遇到右边界()
                direction=1;
            }
            if(direction==1&&(i==m-1||matrix[i+1][j]==233)){//方向向下，遇到下边界
                direction=2;
            }
            if(direction==2&&(j==0||matrix[i][j-1]==233)){//方向向左，遇到左边界
                direction=3;
            }
            if(direction==3&&(i==0||matrix[i-1][j]==233)){//方向向上，遇到上边界
                direction=0;
            }

            //根据方向来走
            if(direction==0){
                j++;
            }
            if(direction==1){
                i++;
            }
            if(direction==2){
                j--;
            }
            if(direction==3){
                i--;
            }
        }
        Iterator<Integer> iterator = res.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next());
        }
    }

    private static List<Integer> spiralOrder(int[][] matrix) {
        LinkedList<Integer> result = new LinkedList<>();
        if(matrix==null||matrix.length==0) return result;
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        int numEle = matrix.length * matrix[0].length;
        while (numEle >= 1) {
            for (int i = left; i <= right && numEle >= 1; i++) {
                result.add(matrix[top][i]);
                numEle--;
            }
            top++;
            for (int i = top; i <= bottom && numEle >= 1; i++) {
                result.add(matrix[i][right]);
                numEle--;
            }
            right--;
            for (int i = right; i >= left && numEle >= 1; i--) {
                result.add(matrix[bottom][i]);
                numEle--;
            }
            bottom--;
            for (int i = bottom; i >= top && numEle >= 1; i--) {
                result.add(matrix[i][left]);
                numEle--;
            }
            left++;
        }
        return result;
    }
}
