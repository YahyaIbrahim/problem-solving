package com.leetcode;

import com.leetcode.objects.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> linkedList = new ArrayList<>();
        ListNode newHead = null;
        do {
            if (list1 != null) {
                linkedList.add(list1.val);
                list1 = list1.next;
            }
            if (list2 != null) {
                linkedList.add(list2.val);
                list2 = list2.next;
            }
        } while (list1 != null || list2 != null);
        Object[] sorted = linkedList.stream().sorted().toArray();
        for (Object o : sorted) {
            newHead = new ListNode().insert(newHead, (Integer) o);
        }
        return newHead;

    }
}
