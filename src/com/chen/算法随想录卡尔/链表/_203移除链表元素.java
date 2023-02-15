package com.chen.算法随想录卡尔.链表;

/**
 * @Author: chenchen
 * @CreateTime: 2022-07-30  13:50
 * @Description: TODO
 */
public class _203移除链表元素 {
    public static void main(String[] args) {
        ListNode head = new ListNode();

    }
    public static ListNode removeElements(ListNode head, int val) {
        while(head!=null && head.val == val){
            head = head.next;
        }
        if(head == null){
            return head;
        }
        ListNode pre = head;
        ListNode nxt = head.next;

        while(nxt != null){
            if(nxt.val == val){
                pre.next = nxt.next;
            }else{
                pre = nxt;
            }
            nxt = nxt.next;
        }
        return head;
    }
}
