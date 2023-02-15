package com.chen.算法随想录卡尔.链表;

/**
 * @USER: chenchen
 * @DATE: 2023/2/1 0:05
 * @DESCRIPTION:
 */
public class _1669合并两个链表 {

    public static void main(String[] args) {


    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // 1. 找出list2的最后一个节点list2_end
        ListNode list2_end = list2;
        while (list2_end.next!=null){
            list2_end = list2_end.next;
        }
        // 2. 找出截取后 list1 的a-1 和 b+1的节点
        ListNode list1a = list1;
        ListNode list1b = list1;
        for (int i = 0; i < a - 1; i++) {
            list1a = list1a.next;
        }
        for (int i = 0; i < b + 1; i++) {
            list1b = list1b.next;
        }
        // 3. a-1指向list2 ，list2_end 指向b+1
        list2_end.next = list1b;
        list1a.next = list2;
        return list1;
    }

}
