package com.chen.bookDemo.数据结构与算法描述._01引论;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author: chenchen
 * @DATE: 2023/2/12 0:02
 * @DESCRIPTION: 引入第一个问题，展示算法时间复杂度的重要性
 *
 * 可以的话，等学完第一章，做up主讲解吧，
 */
public class 选择问题 {


    public static void main(String[] args) {
        // 一组数确定第k个最大者
        int k = 2;
        List<Integer> integers = Arrays.asList(663, 5, 7, 23, 55, 6, 56, 7, 8, 5, 4, 34, 54, 234, 2342, 232, 342, 324, 546, 778);
        method1(integers,k);
        method2(integers,k);

    }

    /**
     * 使用一种排序方法（冒泡），然后取第k个
     * @param arrayList
     * @param k
     */
    public static void method1(List<Integer> arrayList,int k){
        List<Integer> sort = sort(arrayList);
        System.out.println(sort.get(k-1));
    }

    /**
     * 设置一个大小为k的数组，组内有序，添加一个后就做判断
     * @param arrayList
     * @param k
     */
    public static void method2(List<Integer> arrayList,int k){
        int size = arrayList.size();
        // 默认初始都为0
        List<Integer> ints = new ArrayList<>(k);
        for (int i = 0; i < k; i++) {
            ints.add(i,arrayList.get(i));
        }
        // 排序
        List<Integer> sort = sort(ints);
        for (int i = k-1; i < size; i++) {
            //
            if (arrayList.get(i) > sort.get(k - 1)){
                sort.set(k - 1, arrayList.get(i));
                // 排序
                sort(ints);
            }
        }
        System.out.println(ints.get(k-1));
    }

    /**
     * 冒泡排序 从大到小
     * @param arrayList
     * @return
     */
    public static List<Integer> sort(List<Integer> arrayList){
        int size = arrayList.size();
        for (int i = 0; i <size; i++) {
            // 这里j不用也不能比到最后一个去，数组越界了。。。
            for (int j = (size - 1); j > i; j--) {
                if(arrayList.get(j-1) < arrayList.get(j)){
                    int swap = arrayList.get(j-1);
                    arrayList.set(j-1,arrayList.get(j));
                    arrayList.set(j,swap);
                }
            }
        }
        return arrayList;
    }



}
