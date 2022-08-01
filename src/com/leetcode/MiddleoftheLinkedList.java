package com.leetcode;

import com.leetcode.objects.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MiddleoftheLinkedList {
    public  ListNode middleNode(ListNode head) {
        List<Integer> linkedList = new ArrayList<>();
        ListNode newHead = null;
        while (head != null) {
            linkedList.add(head.val);
            head = head.next;
        }
        int m = linkedList.size() / 2;
        for(int i =m;i<linkedList.size();i++) {

            newHead = new ListNode().insert(newHead, linkedList.get(i));
        }
        return newHead;

    }
}
