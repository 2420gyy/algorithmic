package com.chen.算法随想录卡尔.链表;

/**
 * @Author: chenchen
 * @CreateTime: 2022-07-30  13:23
 * @Description: 定义一个链表
 */
public class ListNode {

    // 节点的值
    int val;

    // 下一个节点
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    // 添加新的结点
    public void add(int newval) {
        ListNode newNode = new ListNode(newval);
        if(this.next == null) {
            this.next = newNode;
        } else {
            this.next.add(newval);
        }
    }
    // 打印链表
    public void print() {
        System.out.print(this.val);
        if(this.next != null)
        {
            System.out.print("-->");
            this.next.print();
        }
    }

}
