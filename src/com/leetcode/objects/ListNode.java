package com.leetcode.objects;

public class ListNode {
    public int val;
    public ListNode next;
    public ListNode() {}
    public ListNode(int val) { this.val = val; }
    public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    public  ListNode insert(ListNode node, int data) {
        ListNode temp;
        if (node == null) {
            node = new ListNode(data);
            return node;
        } else {
            temp = node;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ListNode(data);
            return node;
        }
    }
}
