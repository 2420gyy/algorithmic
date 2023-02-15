package com.chen.算法随想录卡尔.链表;

/**
 * @USER: chenchen
 * @DATE: 2023/2/3 23:01
 * @DESCRIPTION:
 */
public class _206反转链表 {


    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.add(2);
        listNode.add(3);
        listNode.add(4);
        listNode.add(5);
        ListNode listNode1 = reverseList(listNode);
        listNode1.print();

    }

    public static ListNode reverseList(ListNode head) {


        ListNode left = null;
        ListNode right = head;

        while (right != null){
            ListNode next = null;
            next = right.next;

            right.next = left;
            left = right;

            right = next;
        }

        return left;

    }

    public ListNode reverseList2(ListNode head) {
        return reverse(null, head);
    }
    // 递归的思想和上面的方法是一样的，问题不断拆解，
    // 每层都只解决一个结点的反转（迭代不也是吗），再让后续反转后的链表末尾指向该结点（进入下一层递归）
    private ListNode reverse(ListNode pre, ListNode cur) {
        if (cur == null) {
            return pre;
        }
        ListNode temp = cur.next;// 先保存下一个节点
        cur.next = pre;// 反转
        // 更新prev、cur位置
        return reverse(cur, temp);
    }
    // 尾递归，从后往前改变
    ListNode reverseList3(ListNode head) {
        // 边缘条件判断
        if(head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        // 递归调用，翻转第二个节点开始往后的链表
        ListNode last = reverseList3(head.next);
        // 翻转头节点与第二个节点的指向
        head.next.next = head;
        // 此时的 head 节点为尾节点，next 需要指向 NULL
        head.next = null;
        return last;
    }


}
