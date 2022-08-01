package com.leetcode;

import com.leetcode.objects.ListNode;

import java.util.HashSet;

public class LinkedListCycle {
    public ListNode detectCycle(ListNode head) {
        if (head == null)
            return null;

        HashSet<ListNode> hs = new HashSet<>();
        ListNode f = head;

        while (f.next != null) {
            if (hs.contains(f))
                return f;
            hs.add(f);
            f = f.next;
        }
        hs.forEach(System.out::println);

        return f.next;
    }
}
