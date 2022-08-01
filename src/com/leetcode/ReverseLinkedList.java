package com.leetcode;

import com.leetcode.objects.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReverseLinkedList {

    public  ListNode reverseList(ListNode head) {
        List<Integer> linkedList = new ArrayList<>();
        ListNode newHead = null;
        while (head != null) {
            linkedList.add(head.val);
            head = head.next;
        }
        for(int i =linkedList.size()-1;i>=0;i--) {

            newHead = new ListNode().insert(newHead,linkedList.get(i));
        }
        return newHead;

    }
}
