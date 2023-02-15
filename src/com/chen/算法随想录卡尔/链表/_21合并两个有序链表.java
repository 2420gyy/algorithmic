package com.chen.算法随想录卡尔.链表;

public class _21合并两个有序链表 {

    public static void main(String[] args) {

    }


    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // 注意引用传递
        ListNode res = new ListNode(0);
        ListNode cur = res;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                cur.next = list1;
                cur = cur.next;
                list1 = list1.next;
            }else{
                cur.next = list2;
                cur = cur.next;
                list2 = list2.next;
            }
        }
        if(list1 == null){
            cur.next = list2;
        }else{
            cur.next = list1;
        }
        return res.next;
    }

}
